package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface FatePointsBearerChoice: Choice {
    fun getBaseFatePoints(allSelectedChoices: List<Choice>): FatePoints
}