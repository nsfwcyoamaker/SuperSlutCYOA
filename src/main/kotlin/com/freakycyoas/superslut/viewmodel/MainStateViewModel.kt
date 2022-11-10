package com.freakycyoas.superslut.viewmodel

import com.freakycyoas.superslut.data.gender.Gender
import com.freakycyoas.superslut.data.gender.GenderMainOriginalGender
import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.deactivable.DeactivableChoice
import com.freakycyoas.superslut.model.points.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map

class MainStateViewModel {
    private val _currentSelectedChoicesFlow by lazy { MutableStateFlow<List<Choice>>(listOf(GenderMainOriginalGender(Gender.MALE))) }

    var selectedChoices: List<Choice>
        get() = currentSelectedChoicesFlow.value
        set(value) {
            _currentSelectedChoicesFlow.value = value.cleanNotEnabled()
        }

    val currentSelectedChoicesFlow
        get() = _currentSelectedChoicesFlow.asStateFlow()

    val currentPowerPoints: Flow<PowerPoints> by lazy { currentSelectedChoicesFlow.map(::calculatePowerPoints) }
    val currentGoldPoints: Flow<GoldPoints> by lazy { currentSelectedChoicesFlow.map(::calculateGoldPoints) }
    val currentOutfitGoldPoints: Flow<GoldPoints?> by lazy { currentSelectedChoicesFlow.map(::calculateOutfitGoldPoints).map { it.takeIf { it.amount > 0 } } }
    val currentFatePoints: Flow<FatePoints> by lazy { currentSelectedChoicesFlow.map(::calculateFatePoints) }

    private fun calculatePowerPoints(allChoices: List<Choice>): PowerPoints {
        val modifiers = allChoices.filterIsInstance<PowerPointsModifierChoice>().sortedByPriority()

        return allChoices
            .filterIsInstance<PowerPointsBearerChoice>()
            .map { bearer ->
                var points = bearer.getBasePowerPoints(allChoices)
                modifiers.forEach { modifier ->
                    points = modifier.modifyGrantedPowerPoints(allChoices, bearer, points)
                }
                points
            }
            .sum()
    }

    private fun calculateGoldPoints(allChoices: List<Choice>): GoldPoints {
        val outfitRemainingCost = calculateOutfitGoldPoints(allChoices).amount.coerceAtMost(0).gp

        val modifiers = allChoices.filterIsInstance<GoldPointsModifierChoice>().sortedByPriority()

        return allChoices
            .filterIsInstance<GoldPointsBearerChoice>()
            .map { bearer ->
                var points = bearer.getBaseGoldPoints(allChoices)
                modifiers.forEach { modifier ->
                    points = modifier.modifyGrantedGoldPoints(allChoices, bearer, points)
                }
                points
            }
            .sum() + outfitRemainingCost
    }

    private fun calculateOutfitGoldPoints(allChoices: List<Choice>): GoldPoints {
        val modifiers = allChoices.filterIsInstance<OutfitGoldPointsModifierChoice>().sortedByPriority()

        return allChoices
            .filterIsInstance<OutfitGoldPointsBearerChoice>()
            .map { bearer ->
                var points = bearer.getBaseOutfitGoldPoints(allChoices)
                modifiers.forEach { modifier ->
                    points = modifier.modifyGrantedOutfitGoldPoints(allChoices, bearer, points)
                }
                points
            }
            .sum()
    }

    private fun calculateFatePoints(allChoices: List<Choice>): FatePoints {
        val modifiers = allChoices.filterIsInstance<FatePointsModifierChoice>().sortedByPriority()

        return allChoices
            .filterIsInstance<FatePointsBearerChoice>()
            .map { bearer ->
                var points = bearer.getBaseFatePoints(allChoices)
                modifiers.forEach { modifier ->
                    points = modifier.modifyGrantedFatePoints(allChoices, bearer, points)
                }
                points
            }
            .sum()
    }

    private fun List<Choice>.cleanNotEnabled(): List<Choice> {
        return this - this.filterIsInstance<DeactivableChoice>().filter { !it.isEnabled(this) }.toSet()
    }
}
