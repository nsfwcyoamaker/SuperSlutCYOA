package com.freakycyoas.superslut.di

import com.freakycyoas.superslut.viewmodel.MainStateViewModel
import org.kodein.di.DI
import org.kodein.di.bindSingleton

val global = DI {
    bindSingleton { MainStateViewModel() }
}