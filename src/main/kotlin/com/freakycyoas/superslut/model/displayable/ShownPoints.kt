package com.freakycyoas.superslut.model.displayable

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.superslut.model.points.Points
import com.freakycyoas.superslut.theme.choiceSubtitleParagraphStyle
import com.freakycyoas.superslut.theme.choiceSubtitleSpanStyle
import kotlin.math.absoluteValue

data class ShownPoints<T: Points>(
    val type: ShownPointsType,
    val points: T,
    val prefix: AnnotatedString? = null,
    val suffix: AnnotatedString? = null,
) {
    init {
        require(points.amount in type.range)
    }

    val displayedText: AnnotatedString
        get() = buildAnnotatedString {
            withStyle(choiceSubtitleParagraphStyle) {
                withStyle(choiceSubtitleSpanStyle) {
                    prefix?.let { append(it) }
                    append(type.label)
                    withStyle(points.style) {
                        append(type.sign)
                        append(points.amount.absoluteValue.toString())
                    }
                    suffix?.let { append(it) }
                }
            }
        }
}