package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorFourEyes:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/hair/four_eyes.jpeg"
    override val name: AnnotatedString
        get() = "FOUR EYES".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("You will get really bad eyesight. Like you will need to wear glasses to see anything. Your eyesight can never get better by magic, technology, etc. While wearing your superhero uniform you can uses lenses, but otherwise, lenses won't work.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 7.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = HairColorBrown
)