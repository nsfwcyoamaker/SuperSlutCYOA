package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface PowerPointsBearerChoice: Choice {
    fun getBasePowerPoints(allSelectedChoices: List<Choice>): PowerPoints
}