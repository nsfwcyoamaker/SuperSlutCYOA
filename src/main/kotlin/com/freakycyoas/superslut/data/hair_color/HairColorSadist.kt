package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorSadist:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/hair/sadist.jpeg"
    override val name: AnnotatedString
        get() = "SADIST".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("You will become a huge sadist, nothing will turn you on more than seeing others suffer, especially supervillains and their goons. Making them scream and beg for mercy will feel like the best thing ever.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 10.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = HairColorBlack
)
