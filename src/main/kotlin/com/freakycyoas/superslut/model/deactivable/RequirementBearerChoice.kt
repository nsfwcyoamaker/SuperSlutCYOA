package com.freakycyoas.superslut.model.deactivable

import com.freakycyoas.superslut.model.Choice

interface RequirementBearerChoice: Choice {
    val requirements: List<Requirement>
    val type: RequirementsBearerType
}