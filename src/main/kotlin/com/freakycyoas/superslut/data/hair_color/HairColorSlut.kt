package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorSlut:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/hair/slut.jpeg"
    override val name: AnnotatedString
        get() = "SLUT".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Your libido will be boosted to slut levels. You’ll crave sex on a daily basis and sex it will never be far from your thoughts. If you go too long without sex you’ll start to act like a bitch in heat.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 10.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = HairColorRed
)