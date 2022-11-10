package com.freakycyoas.superslut.model.points

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.superslut.theme.powerPointsStyle

@JvmInline
value class PowerPoints(override val amount: Int): Points {
    operator fun plus(other: PowerPoints): PowerPoints {
        return (this.amount + other.amount).pp
    }

    override val style: SpanStyle
        get() = powerPointsStyle
}