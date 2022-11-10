package com.freakycyoas.superslut.data.appereance

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object AppearanceAnimalGenitals:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/appearance/animal_genitals.jpeg"
    override val name: AnnotatedString
        get() = "ANIMAL GENITALS".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Instead of having a human cock, you will have the penis of an animal. You may choose the animal, but highly recommend that you go with a horse cock or a horse pussy!")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 10.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = AppearanceHumanoid,
)

