package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorWhite:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/hair/white.jpeg"
    override val name: AnnotatedString
        get() = "WHITE".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("White hair is associated with purity, virtue, wisdom and maturity. However white haired people are also viewed as cold, distant and introvert.")

    override fun getLinkedDrawback(): DrawbackChoice = HairColorEmotionless
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 1.pp,
    shownPointsType = ShownPointsType.GAIN
)
