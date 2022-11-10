package com.freakycyoas.superslut.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class OptionalModifierScope {
    var onTrue: (@Composable Modifier.() -> Modifier)? = null
    @Composable
    fun onTrue(appliedModifier: @Composable Modifier.() -> Modifier) {
        onTrue = appliedModifier
    }
    var onFalse: (@Composable Modifier.() -> Modifier)? = null
    @Composable
    fun onFalse(appliedModifier: @Composable Modifier.() -> Modifier) {
        onFalse = appliedModifier
    }
}

@Composable
fun Modifier.applyIf(expression: Boolean, predicate: @Composable OptionalModifierScope.() -> Unit): Modifier {
    return OptionalModifierScope()
        .apply{ predicate() }
        .let {
            if(expression)
                it.onTrue?.invoke(this)
            else
                it.onFalse?.invoke(this)
        }
        ?: this
}