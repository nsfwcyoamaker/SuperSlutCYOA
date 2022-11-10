package com.freakycyoas.superslut.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.freakycyoas.superslut.viewmodel.MainPageViewModel

@Composable
fun MainPage() {
    val viewModel = remember { MainPageViewModel() }
    val sections by viewModel.sections.collectAsState(emptyList())
    val sectionsItems = sections.map { it.getItems() }.flatten()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            items(sectionsItems) { sectionItem ->
                sectionItem()
            }
        }

        Box(
            modifier = Modifier.wrapContentHeight().fillMaxWidth()
        ) {
            PointsBar()
        }
    }
}

