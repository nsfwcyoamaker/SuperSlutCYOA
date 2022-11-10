package com.freakycyoas.superslut.view.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.model.groups.ChoicesGroup
import com.freakycyoas.superslut.view.MainPageSection
import com.freakycyoas.superslut.view.items.SimpleChoicesRow
import com.freakycyoas.superslut.viewmodel.DefaultMainPageSectionViewModel
import com.freakycyoas.superslut.viewmodel.MainPageSectionViewModel

class SimpleSection(val title: String, val description: AnnotatedString, val viewModelFactory: () -> MainPageSectionViewModel): MainPageSection {
    constructor(title: String, description: AnnotatedString, group: ChoicesGroup): this(title, description, { DefaultMainPageSectionViewModel(group) })

    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember { viewModelFactory() }
        val choices by viewModel.choiceStates.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable { SectionHeader(title, description) }

        val choicesRows: List<@Composable () -> Unit> = choices
            .map { choicesInRow ->
                @Composable {
                    SimpleChoicesRow(
                        row = choicesInRow,
                        onChoiceSelected = viewModel::onSelected,
                    )
                }
            }

        return listOf(header).plus(choicesRows)
    }
}