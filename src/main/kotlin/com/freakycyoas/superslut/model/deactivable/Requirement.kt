package com.freakycyoas.superslut.model.deactivable

import com.freakycyoas.superslut.model.Choice

interface Requirement {
    fun isMet(allSelectedChoices: List<Choice>): Boolean
}