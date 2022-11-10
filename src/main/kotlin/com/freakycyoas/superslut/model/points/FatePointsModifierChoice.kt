package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface FatePointsModifierChoice: Choice {
    val priority: Int
    fun modifyGrantedFatePoints(allSelectedChoices: List<Choice>, choice: Choice, points: FatePoints): FatePoints
}