package com.freakycyoas.superslut.model.drawback

import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.points.PowerPoints
import com.freakycyoas.superslut.model.points.PowerPointsBearerChoice
import com.freakycyoas.superslut.model.points.pp

interface DrawbackChoice: Choice, PowerPointsBearerChoice {
    val grantedPowerPoints: PowerPoints
    fun isLinkComplete(allSelectedChoices: List<Choice>): Boolean

    override fun getBasePowerPoints(allSelectedChoices: List<Choice>): PowerPoints {
        return grantedPowerPoints + if(isLinkComplete(allSelectedChoices)) 3.pp else 0.pp
    }
}