package com.freakycyoas.superslut.data.gender

import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.drawbacks
import com.freakycyoas.superslut.model.groups.ChoicesGroup

object GenderChoicesGroup: ChoicesGroup {
    override val choices: List<Choice>
        get() = listOf(GenderMainOriginalGender(Gender.FEMALE), GenderMainOriginalGender(Gender.MALE), GenderMainFemale, GenderMainMale)

    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        return when (choice) {
            is GenderMainOriginalGender -> allSelectedChoices.filter { it !is GenderMainOriginalGender }.plus(choice)
            in allSelectedChoices -> allSelectedChoices.minus(choice)
            in choices -> allSelectedChoices.filter { it !in choices }.plus(choice)
            in choices.drawbacks -> allSelectedChoices.plus(choice)
            else -> throw IllegalArgumentException()
        }
    }
}