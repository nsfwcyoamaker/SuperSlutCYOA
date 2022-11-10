package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface PowerPointsModifierChoice: Choice {
    val priority: Int
    fun modifyGrantedPowerPoints(allSelectedChoices: List<Choice>, choice: Choice, points: PowerPoints): PowerPoints
}