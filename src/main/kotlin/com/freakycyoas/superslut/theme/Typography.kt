package com.freakycyoas.superslut.theme

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

val mainTitleSpanStyle
    @Stable
    get() = SpanStyle(
        color = RedBoxTextColor,
        fontSize = 90.sp,
        fontWeight = FontWeight.Bold,
    )

val mainTitleParagraphStyle
    @Stable
    get() = ParagraphStyle(
        textAlign = TextAlign.Center,
    )

val String.mainTitle
    @Stable
    get() = AnnotatedString(
        this,
        spanStyle = mainTitleSpanStyle,
        paragraphStyle = mainTitleParagraphStyle
    )

val sectionTitleSpanStyle
    @Stable
    get() = SpanStyle(
        color = RedBoxTextColor,
        fontSize = 45.sp,
        fontWeight = FontWeight.Bold,
    )

val sectionTitleParagraphStyle
    @Stable
    get() = ParagraphStyle(
        textAlign = TextAlign.Center,
    )

val sectionDescriptionStyle
    @Stable
    get() = SpanStyle(
        color = RedBoxTextColor,
        fontSize = 16.sp,
    )

val powerPointsStyle
    @Stable
    get() = SpanStyle(
        color = PowerPointsColor,
        fontWeight = FontWeight.Bold,
        shadow = Shadow(color = Color.Black, blurRadius = 2f),
    )

val goldPointsStyle
    @Stable
    get() = SpanStyle(
        color = GoldPointsColor,
        fontWeight = FontWeight.Bold,
        shadow = Shadow(color = Color.Black, blurRadius = 2f),
    )

val fatePointsStyle
    @Stable
    get() = SpanStyle(
        color = FatePointsColor,
        fontWeight = FontWeight.Bold,
        shadow = Shadow(color = Color.Black, blurRadius = 2f),
    )

val choiceTitleParagraphStyle
    @Stable
    get() = ParagraphStyle(
        textAlign = TextAlign.Center,
    )

val choiceTitleSpanStyle
    @Stable
    get() = SpanStyle(
        color = BlackBoxTitleTextColor,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
    )

val choiceSubtitleParagraphStyle
    @Stable
    get() = ParagraphStyle(
        textAlign = TextAlign.Center,
    )

val choiceSubtitleSpanStyle
    @Stable
    get() = SpanStyle(
        color = BlackBoxTitleTextColor,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
    )

val choiceRequirementSpanStyle
    @Stable
    get() = SpanStyle(
        color = RedBoxBackgroundColor,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
    )

val choiceDescriptionStyle
    @Stable
    get() = SpanStyle(
        color = BlackBoxMainTextColor,
        fontSize = 16.sp,
    )