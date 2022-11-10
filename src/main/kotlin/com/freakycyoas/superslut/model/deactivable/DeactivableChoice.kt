package com.freakycyoas.superslut.model.deactivable

import com.freakycyoas.superslut.model.Choice

interface DeactivableChoice: Choice {
    fun isEnabled(allSelectedChoices: List<Choice>): Boolean
}