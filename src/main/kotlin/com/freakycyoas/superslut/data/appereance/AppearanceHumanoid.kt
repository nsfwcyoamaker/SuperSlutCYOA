package com.freakycyoas.superslut.data.appereance

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object AppearanceHumanoid:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/appearance/humanoid.jpeg"
    override val name: AnnotatedString
        get() = "HUMANOID".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("What about some non-human features? You can choose any non-human features you want, but must choose at least 1 feature. Like squirrel ears and a tail, vampire fangs, elf ears, antennas or tentacle hair.")

    override fun getLinkedDrawback(): DrawbackChoice = AppearanceAnimalGenitals
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 3.pp,
    shownPointsType = ShownPointsType.GAIN
)