package com.freakycyoas.superslut.view.sections

import androidx.compose.ui.text.buildAnnotatedString
import com.freakycyoas.superslut.data.hair_color.HairColorChoicesGroup
import com.freakycyoas.superslut.view.MainPageSection

object HairColorSection: MainPageSection by SimpleSection(
    title = "HAIR COLOR",
    description = buildAnnotatedString { append("This is gonna be 1 of the most important questions I’ll ask you. Ok, take a deep breath and prepare yourself. What color do you want your hair to be?\nLike your hair color is super important for first impressions and the kind of vibes you want to send out.") },
    group = HairColorChoicesGroup,
)