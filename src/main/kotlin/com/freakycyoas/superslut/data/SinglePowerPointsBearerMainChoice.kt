package com.freakycyoas.superslut.data

import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.displayable.PowerPointsDisplayerChoice
import com.freakycyoas.superslut.model.displayable.ShownPoints
import com.freakycyoas.superslut.model.displayable.ShownPointsType
import com.freakycyoas.superslut.model.points.PowerPoints
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice

class SinglePowerPointsBearerMainChoice(
    val points: PowerPoints,
    val shownPointsType: ShownPointsType
): PowerPointsBearerChoice, PowerPointsDisplayerChoice {
    override val shownPowerPoints: ShownPoints<PowerPoints>
        get() = ShownPoints(type = shownPointsType, points = points)

    override fun getBasePowerPoints(allSelectedChoices: List<Choice>): PowerPoints {
        return points
    }
}