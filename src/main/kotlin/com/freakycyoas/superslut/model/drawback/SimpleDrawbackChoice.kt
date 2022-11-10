package com.freakycyoas.superslut.model.drawback

import com.freakycyoas.superslut.model.Choice

interface SimpleDrawbackChoice: DrawbackChoice {
    val linkedChoiceInstance: Choice

    override fun isLinkComplete(allSelectedChoices: List<Choice>): Boolean {
        return allSelectedChoices.contains(linkedChoiceInstance)
    }
}