package com.freakycyoas.superslut.model.deactivable

import com.freakycyoas.superslut.model.Choice

interface Incompatibility {
    fun isMet(allSelectedChoices: List<Choice>): Boolean
}