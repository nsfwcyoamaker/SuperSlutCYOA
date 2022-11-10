package com.freakycyoas.superslut.data.gender

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object GenderDrawbackChivalrous:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/gender/chivalrous.jpeg"
    override val name: AnnotatedString
        get() = "CHIVALROUS".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("Your subconscious mind will be altered to make you act like a perfect gentleman. You will be gallant, courteous and polite. Acting dishonorably, especially towards women becomes unthinkable to you.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 10.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = GenderMainMale
)