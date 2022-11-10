package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorBlack:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/hair/black.jpeg"
    override val name: AnnotatedString
        get() = "BLACK".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Mysterious, exotic and reserved are just some traits that are associated with black hair. On the other hand, black haired people are thought to be more untrustworthy, cold and ruthless than people of other hair colors.")

    override fun getLinkedDrawback(): DrawbackChoice = HairColorSadist
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 0.pp,
    shownPointsType = ShownPointsType.GAIN
)

