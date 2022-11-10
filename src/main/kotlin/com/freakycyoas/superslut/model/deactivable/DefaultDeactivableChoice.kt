package com.freakycyoas.superslut.model.deactivable

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.superslut.model.Choice

@Immutable
@Stable
class DefaultDeactivableChoice(val choice: Choice): DeactivableChoice {
    override fun isEnabled(allSelectedChoices: List<Choice>): Boolean {
        val requirements = (choice as? RequirementBearerChoice)?.requirements ?: emptyList()
        val requirementType = (choice as? RequirementBearerChoice)?.type ?: RequirementsBearerType.ANY
        val incompatibilities = (choice as? IncompatibilityBearerChoice)?.incompatibilities ?: emptyList()

        if(requirements.isEmpty() && incompatibilities.isEmpty()) return true

        val requirementsMet = if(requirements.isNotEmpty()) {
            when(requirementType) {
                RequirementsBearerType.ALL -> requirements.all { it.isMet(allSelectedChoices) }
                RequirementsBearerType.ANY -> requirements.any { it.isMet(allSelectedChoices) }
            }
        } else {
            true
        }

        val incompatibilitiesMet = if(incompatibilities.isNotEmpty()) {
            incompatibilities.all { it.isMet(allSelectedChoices) }
        } else  {
            true
        }

        return requirementsMet && incompatibilitiesMet
    }
}