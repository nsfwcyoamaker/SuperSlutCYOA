package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface GoldPointsModifierChoice: Choice {
    val priority: Int
    fun modifyGrantedGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, points: GoldPoints): GoldPoints
}