package com.freakycyoas.superslut.viewmodel

import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.states.ChoiceWithDrawbackState
import kotlinx.coroutines.flow.Flow

interface MainPageSectionViewModel {
    val choiceStates: Flow<List<List<ChoiceWithDrawbackState>>>
    fun onSelected(choice: Choice)
}