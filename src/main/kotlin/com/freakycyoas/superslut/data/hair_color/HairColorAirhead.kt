package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorAirhead:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/hair/airhead.jpeg"
    override val name: AnnotatedString
        get() = "AIRHEAD".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("You're going to be a bit dumber. You'll often find yourself lose your train of thought and forget things a lot, but that's totally fine, being a bit ditzy is totally adorbs! Being smart is so overrated.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 12.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = HairColorBlonde
)
