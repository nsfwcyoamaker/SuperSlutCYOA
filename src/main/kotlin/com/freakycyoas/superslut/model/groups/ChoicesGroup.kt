package com.freakycyoas.superslut.model.groups

import com.freakycyoas.superslut.model.Choice

interface ChoicesGroup {
    val choices: List<Choice>
    fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice>
}