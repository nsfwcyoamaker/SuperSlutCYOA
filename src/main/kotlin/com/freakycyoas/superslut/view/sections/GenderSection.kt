package com.freakycyoas.superslut.view.sections

import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.superslut.theme.powerPointsStyle
import com.freakycyoas.superslut.view.MainPageSection
import com.freakycyoas.superslut.viewmodel.GenderSectionViewModel

object GenderSection: MainPageSection by SimpleSection(
    "GENDER",
    buildAnnotatedString {
        append("Wait! I feel like I am forgetting something very important. Hmm, the most important thing about heroes is not their superpowers… no, it's their looks! Yes! I have never seen an ugly superhero! Who would want to get saved by a total uggo anyways? Not me, that's for sure. So let's get you a total makeover first. So what gender do you want to be? Like you don't have to be the gender you were born with, actually, I prefer you didn't, it really doesn't suit you you know. On second thought, this makeover is like reeeeally delicate and it will like influence your superpowers. Yes, you get like ")
        withStyle(powerPointsStyle) { append("Power Points") }
        append(" for choosing how your new body will look like. Some options will grant you more ")
        withStyle(powerPointsStyle) { append("Power Points") }
        append(" than others and then you will spend your ")
        withStyle(powerPointsStyle) { append("Power Points") }
        append(" to purchase superpowers. Yes, that is totally how this works and it's not something I just made up! I also don't want your new body to get all wrinkly and old so I'Il grant you eternal youth. Like it would be such a waste for me to make you look beautiful and then after a couple of years you would just get ugly again. I almost forgot something else, t is super important for a superhero to have weaknesses and flaws. So most options will have 1 connected drawback. While the drawbacks are totally optional, they will grant you Ir Points if you take them. You can take drawbacks that are not connected to the options you choose. But if you do take a drawback that is connected to an option you have chosen you will gain ")
        withStyle(powerPointsStyle) { append("3") }
        append(" additional ")
        withStyle(powerPointsStyle) { append("Power Points") }
        append(". Some options and drawbacks also have requirements which you must obey in order to pick them.")
    },
    ::GenderSectionViewModel
)