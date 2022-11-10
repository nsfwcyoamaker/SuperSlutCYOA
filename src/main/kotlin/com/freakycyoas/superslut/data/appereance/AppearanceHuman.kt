package com.freakycyoas.superslut.data.appereance

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object AppearanceHuman:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/appearance/human.jpeg"
    override val name: AnnotatedString
        get() = "HUMAN".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Seriously? Do you want to be a boring human? What's the point in being a superhero if you're just going to look like everyone else. Stop being lame!")

    override fun getLinkedDrawback(): DrawbackChoice = AppearanceUnnaturalSkinColor
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 0.pp,
    shownPointsType = ShownPointsType.GAIN
)