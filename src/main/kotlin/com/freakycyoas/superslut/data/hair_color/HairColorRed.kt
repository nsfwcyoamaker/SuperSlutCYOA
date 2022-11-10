package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorRed:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/hair/red.jpeg"
    override val name: AnnotatedString
        get() = "RED".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("People tend to see redheads as unique, interesting, passionate, loving and sensual! On the other hand, they get a bad rap for being aggressive and promiscuous.")

    override fun getLinkedDrawback(): DrawbackChoice = HairColorSlut
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 2.pp,
    shownPointsType = ShownPointsType.GAIN
)



