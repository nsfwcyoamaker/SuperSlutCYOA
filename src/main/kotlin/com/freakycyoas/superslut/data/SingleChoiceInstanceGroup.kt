package com.freakycyoas.superslut.data

import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.drawbacks
import com.freakycyoas.superslut.model.groups.ChoicesGroup

open class SingleChoiceInstanceGroup(override val choices: List<Choice>): ChoicesGroup {
    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        return when (choice) {
            in allSelectedChoices -> allSelectedChoices.minus(choice)
            in choices -> allSelectedChoices.filter { it !in choices }.plus(choice)
            in choices.drawbacks -> allSelectedChoices.plus(choice)
            else -> throw IllegalArgumentException()
        }
    }
}