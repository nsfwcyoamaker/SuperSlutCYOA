package com.freakycyoas.superslut.model

import com.freakycyoas.superslut.model.deactivable.DeactivableChoice
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice

fun Choice.isEnabled(allSelectedChoices: List<Choice>): Boolean = (this as? DeactivableChoice)?.isEnabled(allSelectedChoices) ?: true

val Choice.drawback: DrawbackChoice?
    get() = (this as? DrawbackLinkedChoice)?.getLinkedDrawback()

val List<Choice>.drawbacks: List<Choice>
    get() = this.filterIsInstance<DrawbackLinkedChoice>().map { it.getLinkedDrawback() }

val List<Choice>.withDrawbacks: List<Choice>
    get() = this + this.drawbacks