package com.freakycyoas.superslut.view

import androidx.compose.runtime.Composable

interface MainPageSection {
    @Composable
    fun getItems(): List<@Composable () -> Unit>
}