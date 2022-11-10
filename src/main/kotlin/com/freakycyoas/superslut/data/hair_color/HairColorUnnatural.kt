package com.freakycyoas.superslut.data.hair_color

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object HairColorUnnatural:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/hair/unnatural.jpeg"
    override val name: AnnotatedString
        get() = "UNNATURAL".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Why settle for a mortal hair color? You can have any hair color you want! Pink hair, blue hair, green hair or why not rainbow colored hair? The sky is the limit!")

    override fun getLinkedDrawback(): DrawbackChoice = HairColorDaddyIssues
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 3.pp,
    shownPointsType = ShownPointsType.GAIN
)
