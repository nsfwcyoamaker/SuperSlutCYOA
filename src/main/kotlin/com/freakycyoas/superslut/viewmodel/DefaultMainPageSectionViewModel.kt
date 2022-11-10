package com.freakycyoas.superslut.viewmodel

import com.freakycyoas.superslut.di.global
import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.groups.ChoicesGroup
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

class DefaultMainPageSectionViewModel(val group: ChoicesGroup, val rowSpan: Int = 3): MainPageSectionViewModel {
    private val mainStateViewModel: MainStateViewModel by global.instance()

    override val choiceStates by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allSelectedChoices ->
            group.choices.map { it.toChoiceWithDrawbackState(allSelectedChoices) }.chunked(rowSpan)
        }
    }

    override fun onSelected(choice: Choice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let { allSelectedChoices ->
            group.onChoiceSelected(choice, allSelectedChoices)
        }
    }
}