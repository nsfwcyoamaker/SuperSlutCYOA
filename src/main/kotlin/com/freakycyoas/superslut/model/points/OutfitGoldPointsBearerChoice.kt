package com.freakycyoas.superslut.model.points

import com.freakycyoas.superslut.model.Choice

interface OutfitGoldPointsBearerChoice: Choice {
    fun getBaseOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints
}