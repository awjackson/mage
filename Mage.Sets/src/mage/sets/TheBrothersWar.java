package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class TheBrothersWar extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList("Arcane Proxy", "Combat Thresher", "Depth Charge Colossus", "Fallaji Dragon Engine", "Phyrexian Fleshgorger", "Rust Goliath", "Skitterbeam Battalion");

    private static final TheBrothersWar instance = new TheBrothersWar();

    public static TheBrothersWar getInstance() {
        return instance;
    }

    private TheBrothersWar() {
        super("The Brothers' War", "BRO", ExpansionSet.buildDate(2022, 11, 18), SetType.EXPANSION);
        this.blockName = "The Brothers' War";
        this.hasBoosters = false; // temporary

        cards.add(new SetCardInfo("Arbalest Engineers", 206, Rarity.UNCOMMON, mage.cards.a.ArbalestEngineers.class));
        cards.add(new SetCardInfo("Arcane Proxy", 75, Rarity.MYTHIC, mage.cards.a.ArcaneProxy.class));
        cards.add(new SetCardInfo("Argoth, Sanctum of Nature", "256a", Rarity.RARE, mage.cards.a.ArgothSanctumOfNature.class));
        cards.add(new SetCardInfo("Argothian Opportunist", 167, Rarity.COMMON, mage.cards.a.ArgothianOpportunist.class));
        cards.add(new SetCardInfo("Ashnod's Harvester", 117, Rarity.UNCOMMON, mage.cards.a.AshnodsHarvester.class));
        cards.add(new SetCardInfo("Audacity", 169, Rarity.UNCOMMON, mage.cards.a.Audacity.class));
        cards.add(new SetCardInfo("Battlefield Forge", 257, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Bitter Reunion", 127, Rarity.COMMON, mage.cards.b.BitterReunion.class));
        cards.add(new SetCardInfo("Blanchwood Armor", 171, Rarity.UNCOMMON, mage.cards.b.BlanchwoodArmor.class));
        cards.add(new SetCardInfo("Blast Zone", 258, Rarity.RARE, mage.cards.b.BlastZone.class));
        cards.add(new SetCardInfo("Brotherhood's End", 128, Rarity.RARE, mage.cards.b.BrotherhoodsEnd.class));
        cards.add(new SetCardInfo("Brushland", 259, Rarity.RARE, mage.cards.b.Brushland.class));
        cards.add(new SetCardInfo("Clay Revenant", 118, Rarity.COMMON, mage.cards.c.ClayRevenant.class));
        cards.add(new SetCardInfo("Combat Thresher", 35, Rarity.UNCOMMON, mage.cards.c.CombatThresher.class));
        cards.add(new SetCardInfo("Corrupt", 88, Rarity.UNCOMMON, mage.cards.c.Corrupt.class));
        cards.add(new SetCardInfo("Depth Charge Colossus", 78, Rarity.COMMON, mage.cards.d.DepthChargeColossus.class));
        cards.add(new SetCardInfo("Diabolic Intent", 89, Rarity.RARE, mage.cards.d.DiabolicIntent.class));
        cards.add(new SetCardInfo("Disciples of Gix", 90, Rarity.UNCOMMON, mage.cards.d.DisciplesOfGix.class));
        cards.add(new SetCardInfo("Disenchant", 6, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Disfigure", 91, Rarity.COMMON, mage.cards.d.Disfigure.class));
        cards.add(new SetCardInfo("Drafna, Founder of Lat-Nam", 47, Rarity.RARE, mage.cards.d.DrafnaFounderOfLatNam.class));
        cards.add(new SetCardInfo("Epic Confrontation", 176, Rarity.COMMON, mage.cards.e.EpicConfrontation.class));
        cards.add(new SetCardInfo("Fade from History", 177, Rarity.RARE, mage.cards.f.FadeFromHistory.class));
        cards.add(new SetCardInfo("Fallaji Chaindancer", 134, Rarity.COMMON, mage.cards.f.FallajiChaindancer.class));
        cards.add(new SetCardInfo("Fallaji Dragon Engine", 159, Rarity.UNCOMMON, mage.cards.f.FallajiDragonEngine.class));
        cards.add(new SetCardInfo("Fallaji Excavation", 178, Rarity.UNCOMMON, mage.cards.f.FallajiExcavation.class));
        cards.add(new SetCardInfo("Feldon, Ronom Excavator", 135, Rarity.RARE, mage.cards.f.FeldonRonomExcavator.class));
        cards.add(new SetCardInfo("Flow of Knowledge", 49, Rarity.UNCOMMON, mage.cards.f.FlowOfKnowledge.class));
        cards.add(new SetCardInfo("Forest", 286, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Gaea's Courser", 181, Rarity.UNCOMMON, mage.cards.g.GaeasCourser.class));
        cards.add(new SetCardInfo("Giant Growth", 183, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Go for the Throat", 102, Rarity.UNCOMMON, mage.cards.g.GoForTheThroat.class));
        cards.add(new SetCardInfo("Goblin Firebomb", 235, Rarity.COMMON, mage.cards.g.GoblinFirebomb.class));
        cards.add(new SetCardInfo("Hajar, Loyal Bodyguard", 211, Rarity.RARE, mage.cards.h.HajarLoyalBodyguard.class));
        cards.add(new SetCardInfo("Hall of Tagsin", 263, Rarity.RARE, mage.cards.h.HallOfTagsin.class));
        cards.add(new SetCardInfo("Harbin, Vanguard Aviator", 212, Rarity.RARE, mage.cards.h.HarbinVanguardAviator.class));
        cards.add(new SetCardInfo("Heavyweight Demolisher", 160, Rarity.UNCOMMON, mage.cards.h.HeavyweightDemolisher.class));
        cards.add(new SetCardInfo("Hurkyl's Final Meditation", 52, Rarity.RARE, mage.cards.h.HurkylsFinalMeditation.class));
        cards.add(new SetCardInfo("Hurkyl, Master Wizard", 51, Rarity.RARE, mage.cards.h.HurkylMasterWizard.class));
        cards.add(new SetCardInfo("In the Trenches", 8, Rarity.MYTHIC, mage.cards.i.InTheTrenches.class));
        cards.add(new SetCardInfo("Island", 280, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Lat-Nam Adept", 56, Rarity.COMMON, mage.cards.l.LatNamAdept.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 264, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Loran of the Third Path", 12, Rarity.RARE, mage.cards.l.LoranOfTheThirdPath.class));
        cards.add(new SetCardInfo("Mishra's Command", 141, Rarity.RARE, mage.cards.m.MishrasCommand.class));
        cards.add(new SetCardInfo("Mishra's Foundry", 265, Rarity.RARE, mage.cards.m.MishrasFoundry.class));
        cards.add(new SetCardInfo("Mishra's Juggernaut", 161, Rarity.COMMON, mage.cards.m.MishrasJuggernaut.class));
        cards.add(new SetCardInfo("Mishra's Onslaught", 143, Rarity.COMMON, mage.cards.m.MishrasOnslaught.class));
        cards.add(new SetCardInfo("Mishra, Claimed by Gix", 216, Rarity.MYTHIC, mage.cards.m.MishraClaimedByGix.class));
        cards.add(new SetCardInfo("Mishra, Excavation Prodigy", 140, Rarity.UNCOMMON, mage.cards.m.MishraExcavationProdigy.class));
        cards.add(new SetCardInfo("Mishra, Lost to Phyrexia", "163b", Rarity.MYTHIC, mage.cards.m.MishraLostToPhyrexia.class));
        cards.add(new SetCardInfo("Mishra, Tamer of Mak Fawa", 217, Rarity.RARE, mage.cards.m.MishraTamerOfMakFawa.class));
        cards.add(new SetCardInfo("Monastery Swiftspear", 144, Rarity.UNCOMMON, mage.cards.m.MonasterySwiftspear.class));
        cards.add(new SetCardInfo("Mountain", 284, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Obstinate Baloth", 187, Rarity.UNCOMMON, mage.cards.o.ObstinateBaloth.class));
        cards.add(new SetCardInfo("Overwhelming Remorse", 110, Rarity.COMMON, mage.cards.o.OverwhelmingRemorse.class));
        cards.add(new SetCardInfo("Painful Quandary", 111, Rarity.RARE, mage.cards.p.PainfulQuandary.class));
        cards.add(new SetCardInfo("Phyrexian Dragon Engine", "163a", Rarity.RARE, mage.cards.p.PhyrexianDragonEngine.class));
        cards.add(new SetCardInfo("Phyrexian Fleshgorger", 121, Rarity.MYTHIC, mage.cards.p.PhyrexianFleshgorger.class));
        cards.add(new SetCardInfo("Plains", 278, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Powerstone Fracture", 112, Rarity.COMMON, mage.cards.p.PowerstoneFracture.class));
        cards.add(new SetCardInfo("Queen Kayla bin-Kroog", 218, Rarity.RARE, mage.cards.q.QueenKaylaBinKroog.class));
        cards.add(new SetCardInfo("Reconstructed Thopter", 242, Rarity.UNCOMMON, mage.cards.r.ReconstructedThopter.class));
        cards.add(new SetCardInfo("Recruitment Officer", 23, Rarity.UNCOMMON, mage.cards.r.RecruitmentOfficer.class));
        cards.add(new SetCardInfo("Rust Goliath", 204, Rarity.COMMON, mage.cards.r.RustGoliath.class));
        cards.add(new SetCardInfo("Scrapwork Cohort", 37, Rarity.COMMON, mage.cards.s.ScrapworkCohort.class));
        cards.add(new SetCardInfo("Siege Veteran", 25, Rarity.RARE, mage.cards.s.SiegeVeteran.class));
        cards.add(new SetCardInfo("Simian Simulacrum", 205, Rarity.RARE, mage.cards.s.SimianSimulacrum.class));
        cards.add(new SetCardInfo("Skitterbeam Battalion", 165, Rarity.MYTHIC, mage.cards.s.SkitterbeamBattalion.class));
        cards.add(new SetCardInfo("Splitting the Powerstone", 63, Rarity.UNCOMMON, mage.cards.s.SplittingThePowerstone.class));
        cards.add(new SetCardInfo("Stern Lesson", 64, Rarity.COMMON, mage.cards.s.SternLesson.class));
        cards.add(new SetCardInfo("Su-Chi Cave Guard", 249, Rarity.UNCOMMON, mage.cards.s.SuChiCaveGuard.class));
        cards.add(new SetCardInfo("Surge Engine", 81, Rarity.MYTHIC, mage.cards.s.SurgeEngine.class));
        cards.add(new SetCardInfo("Survivor of Korlis", 28, Rarity.COMMON, mage.cards.s.SurvivorOfKorlis.class));
        cards.add(new SetCardInfo("Swamp", 282, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Tawnos, the Toymaker", 222, Rarity.RARE, mage.cards.t.TawnosTheToymaker.class));
        cards.add(new SetCardInfo("Teferi, Temporal Pilgrim", 66, Rarity.MYTHIC, mage.cards.t.TeferiTemporalPilgrim.class));
        cards.add(new SetCardInfo("Terisian Mindbreaker", 83, Rarity.RARE, mage.cards.t.TerisianMindbreaker.class));
        cards.add(new SetCardInfo("The Mightstone and Weakstone", "238a", Rarity.RARE, mage.cards.t.TheMightstoneAndWeakstone.class));
        cards.add(new SetCardInfo("The Stasis Coffin", 245, Rarity.RARE, mage.cards.t.TheStasisCoffin.class));
        cards.add(new SetCardInfo("Third Path Iconoclast", 223, Rarity.UNCOMMON, mage.cards.t.ThirdPathIconoclast.class));
        cards.add(new SetCardInfo("Third Path Savant", 67, Rarity.COMMON, mage.cards.t.ThirdPathSavant.class));
        cards.add(new SetCardInfo("Thopter Architect", 29, Rarity.COMMON, mage.cards.t.ThopterArchitect.class));
        cards.add(new SetCardInfo("Thopter Mechanic", 68, Rarity.UNCOMMON, mage.cards.t.ThopterMechanic.class));
        cards.add(new SetCardInfo("Thran Spider", 254, Rarity.RARE, mage.cards.t.ThranSpider.class));
        cards.add(new SetCardInfo("Titania, Gaea Incarnate", "256b", Rarity.MYTHIC, mage.cards.t.TitaniaGaeaIncarnate.class));
        cards.add(new SetCardInfo("Titania, Voice of Gaea", 193, Rarity.MYTHIC, mage.cards.t.TitaniaVoiceOfGaea.class));
        cards.add(new SetCardInfo("Tocasia's Dig Site", 266, Rarity.COMMON, mage.cards.t.TocasiasDigSite.class));
        cards.add(new SetCardInfo("Tocasia's Onulet", 39, Rarity.COMMON, mage.cards.t.TocasiasOnulet.class));
        cards.add(new SetCardInfo("Tocasia's Welcome", 30, Rarity.RARE, mage.cards.t.TocasiasWelcome.class));
        cards.add(new SetCardInfo("Transmogrant's Crown", 125, Rarity.RARE, mage.cards.t.TransmograntsCrown.class));
        cards.add(new SetCardInfo("Tyrant of Kher Ridges", 154, Rarity.RARE, mage.cards.t.TyrantOfKherRidges.class));
        cards.add(new SetCardInfo("Underground River", 267, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Urza's Command", 70, Rarity.RARE, mage.cards.u.UrzasCommand.class));
        cards.add(new SetCardInfo("Urza's Rebuff", 71, Rarity.COMMON, mage.cards.u.UrzasRebuff.class));
        cards.add(new SetCardInfo("Urza's Sylex", 40, Rarity.MYTHIC, mage.cards.u.UrzasSylex.class));
        cards.add(new SetCardInfo("Urza, Lord Protector", 225, Rarity.MYTHIC, mage.cards.u.UrzaLordProtector.class));
        cards.add(new SetCardInfo("Urza, Planeswalker", "238b", Rarity.MYTHIC, mage.cards.u.UrzaPlaneswalker.class));
        cards.add(new SetCardInfo("Urza, Powerstone Prodigy", 69, Rarity.UNCOMMON, mage.cards.u.UrzaPowerstoneProdigy.class));
        cards.add(new SetCardInfo("Urza, Prince of Kroog", 226, Rarity.RARE, mage.cards.u.UrzaPrinceOfKroog.class));
        cards.add(new SetCardInfo("Yotian Dissident", 227, Rarity.UNCOMMON, mage.cards.y.YotianDissident.class));
        cards.add(new SetCardInfo("Yotian Medic", 33, Rarity.COMMON, mage.cards.y.YotianMedic.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is implemented
    }

//    @Override
//    public BoosterCollator createCollator() {
//        return new TheBrothersWarCollator();
//    }
}
