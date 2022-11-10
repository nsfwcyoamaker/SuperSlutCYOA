package com.freakycyoas.superslut.model.points

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.superslut.theme.fatePointsStyle

@JvmInline
value class FatePoints(override val amount: Int): Points {
    operator fun plus(other: FatePoints): FatePoints {
        return (this.amount + other.amount).fp
    }

    override val style: SpanStyle
        get() = fatePointsStyle
}