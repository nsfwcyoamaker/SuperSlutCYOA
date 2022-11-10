package com.freakycyoas.superslut.data

import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.displayable.PowerPointsDisplayerChoice
import com.freakycyoas.superslut.model.displayable.ShownPoints
import com.freakycyoas.superslut.model.displayable.ShownPointsType
import com.freakycyoas.superslut.model.drawback.SimpleDrawbackChoice
import com.freakycyoas.superslut.model.points.PowerPoints

class SinglePowerPointsBearerDrawbackChoice(
    val points: PowerPoints,
    val shownPointsType: ShownPointsType,
    override val linkedChoiceInstance: Choice,

): SimpleDrawbackChoice, PowerPointsDisplayerChoice {
    override val shownPowerPoints: ShownPoints<PowerPoints>
        get() = ShownPoints(type = shownPointsType, points = points)

    override val grantedPowerPoints: PowerPoints
        get() = points
}
