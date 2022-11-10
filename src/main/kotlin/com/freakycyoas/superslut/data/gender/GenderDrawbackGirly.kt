package com.freakycyoas.superslut.data.gender

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object GenderDrawbackGirly:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/gender/girly.jpeg"
    override val name: AnnotatedString
        get() = "GIRLY".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Your subconscious mind will be altered to make your body language and the way you speak super feminine. You'll act like a stereotypical girl and you will also start to like girly things, like makeup and pretty dresses.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 8.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = GenderMainFemale
)