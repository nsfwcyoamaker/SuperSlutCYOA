package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorBrown:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/hair/brown.jpeg"
    override val name: AnnotatedString
        get() = "BROWN".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Brunettes have a reputation for being sophisticated, intelligent and mature. But they are also viewd as boring and plain compared to their blonde, red, white and raven-haired counterparts.")

    override fun getLinkedDrawback(): DrawbackChoice = HairColorFourEyes
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 0.pp,
    shownPointsType = ShownPointsType.GAIN
)