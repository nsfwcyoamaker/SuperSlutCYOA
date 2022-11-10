package com.freakycyoas.superslut.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape

val BottomRightCornerCutShape: Shape
    @Composable
    @Stable
    get() = remember { CutCornerShape(bottomEnd = choiceTextPadding) }