package com.freakycyoas.superslut.data.appereance

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp
import com.freakycyoas.superslut.theme.choiceSubtitleSpanStyle

object AppearanceOtherwordly:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/appearance/otherwordly.jpeg"
    override val name: AnnotatedString
        get() = "OTHERWORLDLY".asChoiceTitle()
    override val description: AnnotatedString
        get() = buildAnnotatedString {
            append("You must choose to gain at least 1 major biologically impossible body feature which will affect most of your body. It can be the same as the minor feature you choose from ")
            withStyle(choiceSubtitleSpanStyle) { append("Metahuman") }
            append(", but on a larger scale.")
        }
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 15.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = AppearanceMetahuman,
)