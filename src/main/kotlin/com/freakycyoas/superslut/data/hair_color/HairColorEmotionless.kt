package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorEmotionless:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/hair/emotionless.jpeg"
    override val name: AnnotatedString
        get() = "EMOTIONLESS".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("You will become unable to express emotions with your face and your voice. You’ll have the best poker face in the world and you will always speak in a flat monotone voice.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 10.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = HairColorWhite
)