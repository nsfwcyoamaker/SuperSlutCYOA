package com.freakycyoas.superslut.view.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.freakycyoas.superslut.model.Choice
import com.freakycyoas.superslut.model.displayable.*
import com.freakycyoas.superslut.model.drawback.DrawbackLinkedChoice
import com.freakycyoas.superslut.model.states.ChoiceState
import com.freakycyoas.superslut.model.states.ChoiceWithDrawbackState
import com.freakycyoas.superslut.theme.*
import com.freakycyoas.superslut.view.applyIf

@Composable
fun SimpleChoicesRow(
    row: List<ChoiceWithDrawbackState>,
    onChoiceSelected: (Choice) -> Unit,
    choiceWidth: Dp = choiceRowItemWidth,
    itemSpacing: Dp = choiceRowSpacingWidth,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.main }.forEach { choiceState ->
                MainChoiceItem(
                    choiceState = choiceState,
                    onSelected = { onChoiceSelected(choiceState.choice) },
                    clipBottomRightCorner = (choiceState.choice !is DrawbackLinkedChoice),
                    width = choiceWidth,
                    modifier = Modifier.fillMaxHeight(),
                )
            }
        }
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.drawback }.forEach { choiceState ->
                if(choiceState != null) {
                    DrawbackChoiceItem(
                        choiceState = choiceState,
                        onSelected = { onChoiceSelected(choiceState.choice) },
                        width = choiceWidth,
                        modifier = Modifier.fillMaxHeight(),
                    )
                } else {
                    Box(modifier = Modifier.width(choiceWidth).fillMaxHeight())
                }
            }
        }
    }
}


@Composable
private fun MainChoiceItem(
    choiceState: ChoiceState,
    clipBottomRightCorner: Boolean,
    onSelected: () -> Unit,
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .applyIf(clipBottomRightCorner) {
                onTrue { clip(BottomRightCornerCutShape) }
            }
            .applyIf(choiceState.isEnabled) {
                onTrue { alpha(1f).clickable(onClick = onSelected) }
                onFalse { alpha(0.6f) }
            }
            .drawWithContent {
                drawContent()
                if(choiceState.isSelected) {
                    drawRect(selectedChoiceOverlayColor)
                }
            }
    ) {
        ChoiceImage(choiceState, width)

        Box(
            modifier = Modifier
                .width(width)
                .height(4.dp)
                .background(color = RedBoxBackgroundColor)
        )

        Column(
            modifier = Modifier
                .width(width)
                .weight(1f)
                .background(color = BlackBoxBackgroundColor)
                .padding(choiceTextPadding)
        ) {
            ChoiceName(choiceState)
            ChoiceDeactivabilitySubtitle(choiceState)
            ChoicePointsSubtitles(choiceState)
            ChoiceDescription(choiceState)

            /* TODO
            (choiceState.choice as? LeveledChoice)?.let { leveledChoice ->
                leveledChoice.levels.forEach { choiceLevel ->
                    Text(
                        buildAnnotatedString {
                            withStyle(choiceSubtitleSpanStyle) {
                                append("Level ${choiceLevel.level} (")
                                withStyle(powerPointsStyle) { append(choiceLevel.points.amount.toString()) }
                                append(")")
                            }
                            append("\n")
                            withStyle(choiceDescriptionStyle) {
                                append(choiceLevel.description)
                            }
                        },
                        modifier = Modifier.fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .clickable { onLevelSelected(choiceLevel) }
                            .drawWithContent {
                                drawContent()
                                if(choiceState.selectedLevel == choiceLevel.number) {
                                    drawRect(selectedChoiceOverlayColor)
                                }
                            }
                            .padding(12.dp)
                    )
                }
            }

             */
        }
    }
}

@Composable
fun ChoiceImage(choiceState: ChoiceState, width: Dp) {
    (choiceState.choice as? ImageDisplayerChoice)?.let { imageDisplayer ->
        Image(
            painter = painterResource(imageDisplayer.imagePath),
            null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(width)
                .aspectRatio(1f, false),
        )
    }
}

@Composable
fun ChoiceName(choiceState: ChoiceState) {
    (choiceState.choice as? NameDisplayerChoice)?.let { nameDisplayer ->
        Text(
            nameDisplayer.name,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun ChoiceDeactivabilitySubtitle(choiceState: ChoiceState) {
    (choiceState.choice as? DeactivabilityDisplayerChoice)?.let { deactivabilityDisplayer ->
        Text(
            deactivabilityDisplayer.deactivabilityDescription,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun ChoicePointsSubtitles(choiceState: ChoiceState) {
    listOfNotNull(
        (choiceState.choice as? PowerPointsDisplayerChoice)?.shownPowerPoints,
        (choiceState.choice as? GoldPointsDisplayerChoice)?.shownGoldPoints,
        (choiceState.choice as? OutfitGoldPointsDisplayerChoice)?.shownOutfitGoldPoints,
        (choiceState.choice as? FatePointsDisplayerChoice)?.shownFatePoints,
    ).forEach { shownPoints ->
        Text(
            shownPoints.displayedText,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun ChoiceDescription(choiceState: ChoiceState) {
    (choiceState.choice as? DescriptionDisplayerChoice)?.let { descriptionDisplayer ->
        Text(
            buildAnnotatedString {
                withStyle(choiceDescriptionStyle) {
                    append(descriptionDisplayer.description)
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun DrawbackChoiceItem(
    choiceState: ChoiceState,
    onSelected: () -> Unit,
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(BottomRightCornerCutShape)
            .applyIf(choiceState.isEnabled) {
                onTrue { alpha(1f).clickable(onClick = onSelected) }
                onFalse { alpha(0.6f) }
            }
            .drawWithContent {
                drawContent()
                if(choiceState.isSelected) {
                    drawRect(selectedChoiceOverlayColor)
                }
            }
    ) {
        Column(
            modifier = Modifier
                .width(width)
                .weight(1f)
                .background(color = GrayBoxBackgroundColor)
        ) {
            Column(modifier = Modifier.padding(choiceTextPadding)) {
                ChoiceName(choiceState)
                ChoiceDeactivabilitySubtitle(choiceState)
                ChoicePointsSubtitles(choiceState)
                ChoiceDescription(choiceState)
            }
            Box(modifier = Modifier.weight(1f))
            ChoiceImage(choiceState, width)
        }
    }
}