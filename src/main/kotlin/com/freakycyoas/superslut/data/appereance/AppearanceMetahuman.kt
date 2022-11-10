package com.freakycyoas.superslut.data.appereance

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.data.SinglePowerPointsBearerMainChoice
import com.freakycyoas.superslut.data.asChoiceTitle
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackChoice
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

object AppearanceMetahuman:
    ImageDisplayerChoice,
    NameDisplayerChoice,
    DescriptionDisplayerChoice,
    PowerPointsBearerChoice by powerPoints,
    PowerPointsDisplayerChoice by powerPoints,
    DrawbackLinkedChoice {

    override val imagePath: String
        get() = "images/appearance/metahuman.jpeg"
    override val name: AnnotatedString
        get() = "METAHUMAN".asChoiceTitle()
    override val description: AnnotatedString
        get() = AnnotatedString("You must choose to gain at least minor biologically impossible body feature. For example, your hair is made out of slime, your eyes glow red or your hair is made out of harmless fire.")

    override fun getLinkedDrawback(): DrawbackChoice = AppearanceOtherwordly
}

private val powerPoints = SinglePowerPointsBearerMainChoice(
    points = 4.pp,
    shownPointsType = ShownPointsType.GAIN
)