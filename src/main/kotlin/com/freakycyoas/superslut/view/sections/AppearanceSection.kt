package com.freakycyoas.superslut.view.sections

import androidx.compose.ui.text.buildAnnotatedString
import com.freakycyoas.superslut.data.appereance.AppearanceChoicesGroup
import com.freakycyoas.superslut.view.MainPageSection

object AppearanceSection: MainPageSection by SimpleSection(
    "APPEARANCE",
    buildAnnotatedString { append("What about some special features, like it would be totally boring if you looked like every other human. Like how lame would that be?") },
    AppearanceChoicesGroup,
)