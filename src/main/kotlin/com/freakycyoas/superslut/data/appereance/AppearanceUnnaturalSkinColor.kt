package com.freakycyoas.superslut.data.appereance

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerDrawbackChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.pp

object AppearanceUnnaturalSkinColor:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    SimpleDrawbackChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints {

    override val imagePath: String
        get() = "images/appearance/unnatural_skin_color.jpeg"
    override val name: AnnotatedString
        get() = "UNNATURAL SKIN COLOR".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("How about we just change your skin color? That would be totally aaaawseome!~ Just pick any unnatural skin color you want and I'Il work my magic on you.")
}

private val powerPoints = SinglePowerPointsBearerDrawbackChoice(
    points = 8.pp,
    shownPointsType = ShownPointsType.GAIN,
    linkedChoiceInstance = AppearanceHuman,
)