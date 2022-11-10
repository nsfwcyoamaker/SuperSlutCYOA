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

object GenderMainMale:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/gender/male.jpeg"
    override val name: AnnotatedString
        get() = "MALE".asChoiceTitle()
    override val description: AnnotatedString
        get() = buildAnnotatedString {
            append("Yeah, and there is also the option to be a man... It's not like I don't like men but let's just say I enjoy their penises a lot more than I enjoy their looks. I'm also not very good at flesh sculpting males, I won't be able to make you as beautiful as if you chose to be a girl, but I'Il do my best. Which will probably make you the best looking man on the planet, but your looks won't be like divine or anything. If this option caused you to change gender you gain ")
            withStyle(powerPointsStyle) { append("10") }
            append(" additional ")
            withStyle(powerPointsStyle) { append("Power Points") }
            append(".")
        }

    override fun getLinkedDrawback(): DrawbackChoice = GenderDrawbackChivalrous
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 20.pp,
    shownPointsType = ShownPointsType.GAIN
)