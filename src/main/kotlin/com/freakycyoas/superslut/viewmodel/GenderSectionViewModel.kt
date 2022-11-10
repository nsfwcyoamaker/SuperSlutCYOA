package com.freakycyoas.superslut.viewmodel

import com.freakycyoas.superslut.data.gender.GenderChoicesGroup
import com.freakycyoas.superslut.data.gender.GenderMainOriginalGender
import com.freakycyoas.superslut.di.global
import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.drawback
import com.freakycyoas.superslut.model.isEnabled
import com.freakycyoas.superslut.model.states.ChoiceState
import com.freakycyoas.superslut.model.states.ChoiceWithDrawbackState
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

class GenderSectionViewModel: MainPageSectionViewModel {
    private val mainStateViewModel: MainStateViewModel by global.instance()

    private fun Choice.toChoiceState(allSelectedChoices: List<Choice>): ChoiceState {
        val isEnabled = this.isEnabled(allSelectedChoices)

        return ChoiceState(
            choice = this,
            isEnabled = isEnabled,
            isSelected = isEnabled && (this in allSelectedChoices),
        )
    }

    private fun Choice.toChoiceWithDrawbackState(allSelectedChoices: List<Choice>): ChoiceWithDrawbackState {
        return ChoiceWithDrawbackState(
            main = this.toChoiceState(allSelectedChoices),
            drawback = this.drawback?.toChoiceState(allSelectedChoices),
        )
    }

    override val choiceStates by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allSelectedChoices ->
            val playerGender = allSelectedChoices
                .filterIsInstance<GenderMainOriginalGender>()
                .single()
                .originalGender

            GenderChoicesGroup.choices.map { choice ->
                ChoiceWithDrawbackState(
                    main = choice.let { mainChoice ->
                        val isEnabled = mainChoice.isEnabled(allSelectedChoices)
                        val isSelected = (mainChoice as? GenderMainOriginalGender)?.let { it.originalGender == playerGender } ?: (mainChoice in allSelectedChoices)

                        ChoiceState(
                            choice = mainChoice,
                            isEnabled = isEnabled,
                            isSelected = isEnabled && isSelected,
                        )
                    },
                    drawback = choice.drawback?.let { drawbackChoice ->
                        val isEnabled = drawbackChoice.isEnabled(allSelectedChoices)

                        ChoiceState(
                            choice = drawbackChoice,
                            isEnabled = isEnabled,
                            isSelected = isEnabled && (drawbackChoice in allSelectedChoices),
                        )
                    },
                )
            }.chunked(2)
        }
    }

    override fun onSelected(choice: Choice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let { allSelectedChoices ->
            GenderChoicesGroup.onChoiceSelected(choice, allSelectedChoices)
        }
    }
}