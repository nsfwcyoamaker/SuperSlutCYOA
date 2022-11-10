package com.freakycyoas.superslut.viewmodel

import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.drawback
import com.freakycyoas.superslut.model.isEnabled
import com.freakycyoas.superslut.model.states.ChoiceState
import com.freakycyoas.superslut.model.states.ChoiceWithDrawbackState

fun Choice.toChoiceState(allSelectedChoices: List<Choice>): ChoiceState {
    val isEnabled = this.isEnabled(allSelectedChoices)

    return ChoiceState(
        choice = this,
        isEnabled = isEnabled,
        isSelected = isEnabled && (this in allSelectedChoices),
    )
}

fun Choice.toChoiceWithDrawbackState(allSelectedChoices: List<Choice>): ChoiceWithDrawbackState {
    return ChoiceWithDrawbackState(
        main = this.toChoiceState(allSelectedChoices),
        drawback = this.drawback?.toChoiceState(allSelectedChoices),
    )
}