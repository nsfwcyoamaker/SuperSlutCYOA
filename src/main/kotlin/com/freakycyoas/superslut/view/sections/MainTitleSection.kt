package com.freakycyoas.superslut.view.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.freakycyoas.superslut.theme.*
import com.freakycyoas.superslut.view.MainPageSection

object MainTitleSection: MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        return listOf @Composable {
            Box(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 48.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier.wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        "SUPER SLUT".mainTitle,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = RedBoxBackgroundColor)
                            .padding(horizontal = 40.dp, vertical = 6.dp),
                        maxLines = 1,
                    )
                    Text(
                        "Hi hi! Welcome to the Halls of the Lightbringer! Before you ask, I am not the Lightbringer and no you may not speak o the Lightbringer. My name is Illendria and- WHAT?! Have you never heard of the Lightbringer? Well, I know you're mortal and all, but WOW... I'm surprised, guess i have some explaining to do then. You see the Lightbringer is this totally amazing and dreamy goddess who turns puny mortals into great heroes and sends them off into the universe to bring order, niceness and all that good stuff. The Lightbringer was wounded in an epic battle that prevented the destruction of the multiverse, I participated too you know, so you're welcome, no need to thank me. Aaaanyways~ since the Lighbringer is still wounded she won't be able to personally train you. So Illendria, the goddess of love and desire will act as the Lightbringers stand-in. But I have better things to do than teach you like morality lessons that build character, cultivate inner strength, prevent you from being corrupted by evil and bla bla bla. so I'm just going to zap you with superpowers instead. What do you mean I sound super frivolous and I'm not taking this seriously? Do you need those lessons? Like are you a bad person or something? Because I could totally find another mortal and zap them with superpowers instead. Just kidding!- That was actually a test to see if you were a good person and you passed with flying colors! Not to brag, but I have watched like a lot of superhero movies from your world to prepare me for this hero business, so I am totally knowing what I am doing. Like Obi-Wan Kenobi once said, with power comes great responsibility. My knowledge of your world is pretty impressive, right? What do you mean Uncle Ben said that? Uncle Ben Kenobi am I right? Now stand still and I'll start the zappening!",
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = BottomRightCornerCutShape)
                            .background(color = BlackBoxBackgroundColor)
                            .padding(8.dp),
                        color = BlackBoxMainTextColor,
                        fontSize = 16.sp,
                    )
                }
            }
        }
    }
}