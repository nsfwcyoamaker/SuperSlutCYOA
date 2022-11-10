package com.freakycyoas.superslut.data.gender

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.displayable.NameDisplayerChoice
import com.freakycyoas.superslut.model.points.PowerPoints
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

class GenderMainOriginalGender(val originalGender: Gender): Choice, NameDisplayerChoice, PowerPointsBearerChoice {
    override val name: AnnotatedString
        get() = originalGender.name.let { "I AM $it".asChoiceTitle() }

    override fun getBasePowerPoints(allSelectedChoices: List<Choice>): PowerPoints {
        val switchedToFemale = originalGender == Gender.MALE && allSelectedChoices.contains(GenderMainFemale)
        val switchedToMale = originalGender == Gender.FEMALE && allSelectedChoices.contains(GenderMainMale)

        return if(switchedToFemale || switchedToMale) 10.pp else 0.pp
    }
}