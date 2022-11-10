package com.freakycyoas.superslut.data

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.superslut.theme.choiceTitleParagraphStyle
import com.freakycyoas.superslut.theme.choiceTitleSpanStyle

fun String.asChoiceTitle(): AnnotatedString = AnnotatedString(this, paragraphStyle = choiceTitleParagraphStyle, spanStyle = choiceTitleSpanStyle)