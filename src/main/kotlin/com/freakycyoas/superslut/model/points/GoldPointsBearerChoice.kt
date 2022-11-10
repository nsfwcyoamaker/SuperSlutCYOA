package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface GoldPointsBearerChoice: Choice {
    fun getBaseGoldPoints(allSelectedChoices: List<Choice>): GoldPoints
}