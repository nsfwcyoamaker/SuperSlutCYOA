package com.freakycyoas.superslut

import androidx.compose.material.Surface
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.freakycyoas.superslut.di.global
import com.freakycyoas.superslut.theme.AppTheme
import com.freakycyoas.superslut.view.MainPage
import org.kodein.di.compose.withDI

fun main() = application {
    Window(onCloseRequest = ::exitApplication, state = rememberWindowState(placement = WindowPlacement.Maximized)) {
        withDI(global) {
            AppTheme {
                Surface {
                    MainPage()
                }
            }
        }
    }
}
