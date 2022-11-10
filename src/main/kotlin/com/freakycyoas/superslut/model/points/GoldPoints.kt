package com.freakycyoas.superslut.model.points

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.superslut.theme.goldPointsStyle

@JvmInline
value class GoldPoints(override val amount: Int): Points {
    operator fun plus(other: GoldPoints): GoldPoints {
        return (this.amount + other.amount).gp
    }

    override val style: SpanStyle
        get() = goldPointsStyle
}