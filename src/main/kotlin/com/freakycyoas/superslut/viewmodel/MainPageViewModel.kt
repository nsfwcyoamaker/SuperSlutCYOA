package com.freakycyoas.superslut.viewmodel

import com.freakycyoas.superslut.di.global
import com.freakycyoas.superslut.view.MainPageSection
import com.freakycyoas.superslut.view.sections.AppearanceSection
import com.freakycyoas.superslut.view.sections.GenderSection
import com.freakycyoas.superslut.view.sections.HairColorSection
import com.freakycyoas.superslut.view.sections.MainTitleSection
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

class MainPageViewModel {
    private val mainStateViewModel: MainStateViewModel by global.instance()

    val sections: Flow<List<MainPageSection>> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            listOfNotNull(
                MainTitleSection,

                GenderSection,
                AppearanceSection,
                HairColorSection,
                //BodyFigureSection,
                //BodySizeSection,
                //BreastSizeSection,
                //ButtSizeSection,
                //GenitalsSection,
//
                //AppearanceDisclaimerSection,
//
                //PowerSourceSection,
                //PowersSection,
                //allChoices
                //    .singleOrNull { it::class == PowersSummonMinion::class }
                //    ?.let { it as PowersSummonMinion }
                //    ?.takeIf { it.selectedLevel != null }
                //    ?.let {
                //        MinionPowersSection(it.selectedLevel!!)
                //    },
//
                //SafetyDisclaimerSection,
//
                //SponsorSection,
                //ContractsSection.takeIf { allChoices.none { it == SponsorNoSponsor } },
                //SocialClassSection,
                //SuperheroLicenseSection,
                //OutfitDesignSection,
                //OutfitFeaturesSection,
                //identity
                //part-time job
                //base
                //perks
                //superheroines
                //supervillains
                //fate
//
                //EndingSection,
            )
        }
    }
}