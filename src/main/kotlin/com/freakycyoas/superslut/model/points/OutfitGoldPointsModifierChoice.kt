package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface OutfitGoldPointsModifierChoice: Choice {
    val priority: Int
    fun modifyGrantedOutfitGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, points: GoldPoints): GoldPoints
}