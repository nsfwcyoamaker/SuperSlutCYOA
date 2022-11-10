package com.freakycyoas.superslut.data.gender

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp
import com.freakycyoas.superslut.theme.powerPointsStyle

object GenderMainFemale:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/gender/female.jpeg"
    override val name: AnnotatedString
        get() = "FEMALE".asChoiceTitle()
    override val description: AnnotatedString
        get() = buildAnnotatedString {
            append("I don't do makeovers half-heartedly so I will not turn you into a girl, I will turn you into THE GIRL, your beauty will be divine. As a girl, you will inspire lust and desire in all who gaze upon you. Everyone will want you, yeah that means the supervillains, especially the supervillains. They will want to rape and ravage you. No, sorry, I won't settle for anything less than divine beauty! If this option caused you to change gender you gain ")
            withStyle(powerPointsStyle) { append("10") }
            append(" additional ")
            withStyle(powerPointsStyle) { append("Power Points") }
            append(".")
        }

    override fun getLinkedDrawback(): DrawbackChoice = GenderDrawbackGirly
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 20.pp,
    shownPointsType = ShownPointsType.GAIN
)