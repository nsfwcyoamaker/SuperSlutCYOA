package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorBlonde:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/hair/blonde.jpeg"
    override val name: AnnotatedString
        get() = "BLONDE".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Blondes are often thought of as party girls. Seen as happy, cheerful, fun and social. However, they are also seen as vain, dumb and promiscuous compared to other hair colors. Totally undeserved if you ask me!")

    override fun getLinkedDrawback(): DrawbackChoice = HairColorAirhead
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 2.pp,
    shownPointsType = ShownPointsType.GAIN
)


