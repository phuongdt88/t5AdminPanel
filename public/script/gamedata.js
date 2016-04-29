var sectionWrap = ["arenaReferenceWrap",
                "cardBuildingWrap",
                "cardBuildingLevelWrap",
                "cardTroopWrap",
                "cardTroopLevelWrap",
                "cardSpellWrap",
                "cardSpellLevelWrap",
                "buildingWrap",
                "troopWrap",
                "spellWrap",
                "buildingLevelWrap",
                "troopLevelWrap",
                "spellLevelWrap",
                "chestSequenceWrap",
                "achievementWrap",
                "donationWrap",
                "requestWrap",
                "chestDataWrap",
                "tribeDaggerRankWrap",
                "dataConstantWrap",
                "chestProbabilityWrap",
                "loserDaggerModifierWrap",
                "freeGemSequenceWrap",
                "crownGemSequenceWrap",
                "tvRoyaleWrap",
                "towerLevelWrap",
                "shopCardPriceWrap",
                "unitEffectWrap",
                "unitSoundFXWrap"]

var selectedSection;

jQuery(document).ready(function($)
{

  $("#publishConfirmDialog").dialog({
    autoOpen: false,
    modal: true,
    buttons : {
      "Publish" : function() {
        PublishGGSSToServer();
      },
      "Cancel" : function() {
        $( this ).dialog( "close" );
      }
    }
  });

	arenaReferenceTable = $("#arenaReferenceTable").dataTable({
	       "bSort" : false,
	       "aLengthMenu": [
	        [25, 50, 100, -1], [25, 50, 100, "All"]
	      ]
	    });

  arenaReferenceGGSSTbl = $("#arenaReferenceGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	cardBuildingTable = $("#cardBuildingTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  cardBuildingGGSSTbl = $("#cardBuildingGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	cardBuildingLevelTable = $("#cardBuildingLevelTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  cardBuildingLevelGGSSTbl = $("#cardBuildingLevelGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	cardTroopTable = $("#cardTroopTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  cardTroopGGSSTbl = $("#cardTroopGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	cardTroopLevelTable = $("#cardTroopLevelTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  cardTroopLevelGGSSTbl = $("#cardTroopLevelGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	cardSpellTable = $("#cardSpellTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  cardSpellGGSSTbl = $("#cardSpellGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	cardSpellLevelTable = $("#cardSpellLevelTable").dataTable({
       "bSort" : false,
       "aLengthMenu": [
        [25, 50, 100, -1], [25, 50, 100, "All"]
      ]
    });

  cardSpellLevelGGSSTbl = $("#cardSpellLevelGGSSTbl").dataTable({
       "bSort" : false,
       "aLengthMenu": [
        [25, 50, 100, -1], [25, 50, 100, "All"]
      ]
    });

	buildingTable = $("#buildingTable").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  buildingGGSSTbl = $("#buildingGGSSTbl").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	troopTable = $("#troopTable").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  troopGGSSTbl = $("#troopGGSSTbl").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	spellTable = $("#spellTable").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  spellGGSSTbl = $("#spellGGSSTbl").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	buildingLevelTable = $("#buildingLevelTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  buildingLevelGGSSTbl = $("#buildingLevelGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	troopLevelTable = $("#troopLevelTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  troopLevelGGSSTbl = $("#troopLevelGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

	spellLevelTable = $("#spellLevelTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  spellLevelGGSSTbl = $("#spellLevelGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  chestSequenceTable = $("#chestSequenceTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ],
        "columns" : [
        null,
        null,{
          defaultContent: ""
        }]
         
      });

  chestSequenceGGSSTbl = $("#chestSequenceGGSSTbl").dataTable({
        "bSort" : false,
        "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ],
        "columns" : [
        null,
        null,{
          defaultContent: ""
        }]
      });

  achievementTable = $("#achievementTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  achievementGGSSTbl = $("#achievementGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  donationTable = $("#donationTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  donationGGSSTbl = $("#donationGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  requestTable = $("#requestTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  requestGGSSTbl = $("#requestGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  chestDataTable = $("#chestDataTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  chestDataGGSSTbl = $("#chestDataGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  tribeDaggerRankTable = $("#tribeDaggerRankTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  tribeDaggerRankGGSSTbl = $("#tribeDaggerRankGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  dataConstantTable = $("#dataConstantTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  dataConstantGGSSTbl = $("#dataConstantGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  chestProbabilityTable = $("#chestProbabilityTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  chestProbabilityGGSSTbl = $("#chestProbabilityGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  loserDaggerModifierTable = $("#loserDaggerModifierTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  loserDaggerModifierGGSSTbl = $("#loserDaggerModifierGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  freeGemSequenceTable = $("#freeGemSequenceTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  freeGemSequenceGGSSTbl = $("#freeGemSequenceGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  crownGemSequenceTable = $("#crownGemSequenceTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  crownGemSequenceGGSSTbl = $("#crownGemSequenceGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });  

  tvRoyaleTable = $("#tvRoyaleTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  tvRoyaleGGSSTbl = $("#tvRoyaleGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  towerLevelTable = $("#towerLevelTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  towerLevelGGSSTbl = $("#towerLevelGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });  

  shopCardPriceTable = $("#shopCardPriceTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  shopCardPriceGGSSTbl = $("#shopCardPriceGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  unitEffectTable = $("#unitEffectTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  unitEffectGGSSTbl = $("#unitEffectGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  unitSoundFXTable = $("#unitSoundFXTable").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  unitSoundFXGGSSTbl = $("#unitSoundFXGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

  section = {
    ARENA_REFERENCE : {
      dataTable: arenaReferenceTable, 
      ggssTable: arenaReferenceGGSSTbl, 
      sectionName: "arenareference", 
      wrap: "arenaReferenceWrap",
      currentSection: "currentArenaReference",
      exportTypeSelectID: "arenaRefExportSelect",
      ggssSection: "arenaReferenceGGSS",
      publishBtn: "arenaReferenceGGSSPublishBtn",
    },
    CARD_BUILDING : {
      dataTable: cardBuildingTable, 
      ggssTable: cardBuildingGGSSTbl, 
      sectionName: "cardbuilding", 
      wrap: "cardBuildingWrap",
      currentSection: "currentCardBuilding",
      exportTypeSelectID: "cardBuildingExportSelect", 
      ggssSection: "cardBuildingGGSS",
      publishBtn: "cardBuildingGGSSPublishBtn",
    },
    CARD_BUILDING_LEVEL : {
      dataTable: cardBuildingLevelTable, 
      ggssTable: cardBuildingLevelGGSSTbl, 
      sectionName: "cardbuildinglevel", 
      wrap: "cardBuildingLevelWrap",
      currentSection: "currentCardBuildingLevel", 
      exportTypeSelectID: "cardBuildingLevelExportSelect",
      ggssSection: "cardBuildingLevelGGSS",
      publishBtn: "cardBuildingLevelGGSSPublishBtn",
    },
    CARD_TROOP : {
      dataTable: cardTroopTable, 
      ggssTable: cardTroopGGSSTbl, 
      sectionName: "cardtroop", 
      wrap: "cardTroopWrap",
      currentSection: "currentCardTroop",
      exportTypeSelectID: "cardTroopExportSelect", 
      ggssSection: "cardTroopGGSS",
      publishBtn: "cardTroopGGSSPublishBtn",
    },
    CARD_TROOP_LEVEL : {
      dataTable: cardTroopLevelTable, 
      ggssTable: cardTroopLevelGGSSTbl, 
      sectionName: "cardtrooplevel", 
      wrap: "cardTroopLevelWrap",
      currentSection: "currentCardTroopLevel",
      exportTypeSelectID: "cardTroopLevelExportSelect", 
      ggssSection: "cardTroopLevelGGSS",
      publishBtn: "cardTroopLevelGGSSPublishBtn"
    },
    CARD_SPELL : {
      dataTable: cardSpellTable, 
      ggssTable: cardSpellGGSSTbl, 
      sectionName: "cardspell", 
      wrap: "cardSpellWrap",
      currentSection: "currentCardSpell",
      exportTypeSelectID: "cardSpellExportSelect", 
      ggssSection: "cardSpellGGSS",
      publishBtn: "cardSpellGGSSPublishBtn"
    },
    CARD_SPELL_LEVEL : {
      dataTable: cardSpellLevelTable, 
      ggssTable: cardSpellLevelGGSSTbl, 
      sectionName: "cardspelllevel", 
      wrap: "cardSpellLevelWrap",
      currentSection: "currentCardSpellLevel",
      exportTypeSelectID: "cardSpellLevelExportSelect", 
      ggssSection: "cardSpellLevelGGSS",
      publishBtn: "cardSpellLevelGGSSPublishBtn"
    },
    BUILDING : {
      dataTable: buildingTable, 
      ggssTable: buildingGGSSTbl, 
      sectionName: "building", 
      wrap: "buildingWrap",
      currentSection: "currentBuilding",
      exportTypeSelectID: "buildingExportSelect", 
      ggssSection: "buildingGGSS",
      publishBtn: "buildingGGSSPublishBtn"
    },
    BUILDING_LEVEL : {
      dataTable: buildingLevelTable, 
      ggssTable: buildingLevelGGSSTbl, 
      sectionName: "buildinglevel", 
      wrap: "buildingLevelWrap",
      currentSection: "currentBuildingLevel",
      exportTypeSelectID: "buildingLevelExportSelect", 
      ggssSection: "buildingLevelGGSS",
      publishBtn: "buildingLevelGGSSPublishBtn"
    },
    TROOP : {
      dataTable: troopTable, 
      ggssTable: troopGGSSTbl, 
      sectionName: "troop", 
      wrap: "troopWrap",
      currentSection: "currentTroop",
      exportTypeSelectID: "troopExportSelect", 
      ggssSection: "troopGGSS",
      publishBtn: "troopGGSSPublishBtn"
    },
    TROOP_LEVEL : {
      dataTable: troopLevelTable, 
      ggssTable: troopLevelGGSSTbl, 
      sectionName: "trooplevel", 
      wrap: "troopLevelWrap",
      currentSection: "currentTroopLevel",
      exportTypeSelectID: "troopLevelExportSelect", 
      ggssSection: "troopLevelGGSS",
      publishBtn: "troopLevelGGSSPublishBtn"
    },
    SPELL : {
      dataTable: spellTable, 
      ggssTable: spellGGSSTbl, 
      sectionName: "spell", 
      wrap: "spellWrap",
      currentSection: "currentSpell",
      exportTypeSelectID: "spellExportSelect", 
      ggssSection: "spellGGSS",
      publishBtn: "spellGGSSPublishBtn"
    },
    SPELL_LEVEL : {
      dataTable: spellLevelTable, 
      ggssTable: spellLevelGGSSTbl, 
      sectionName: "spelllevel", 
      wrap: "spellLevelWrap",
      currentSection: "currentSpellLevel",
      exportTypeSelectID: "spellLevelExportSelect", 
      ggssSection: "spellLevelGGSS",
      publishBtn: "spellLevelGGSSPublishBtn"
    },
    CHEST_SEQUENCE : {
      dataTable: chestSequenceTable, 
      ggssTable: chestSequenceGGSSTbl, 
      sectionName: "chestsequence", 
      wrap: "chestSequenceWrap",
      currentSection: "currentChestSequence",
      exportTypeSelectID: "chestSequenceExportSelect", 
      ggssSection: "chestSequenceGGSS",
      publishBtn: "chestSequenceGGSSPublishBtn"
    },
    ACHIEVEMENT : {
      dataTable: achievementTable, 
      ggssTable: achievementGGSSTbl, 
      sectionName: "achievement", 
      wrap: "achievementWrap",
      currentSection: "currentAchievement",
      exportTypeSelectID: "achievementExportSelect", 
      ggssSection: "achievementGGSS",
      publishBtn: "achievementGGSSPublishBtn"
    },
    DONATION : {
      dataTable: donationTable, 
      ggssTable: donationGGSSTbl, 
      sectionName: "donation", 
      wrap: "donationWrap",
      currentSection: "currentDonation",
      exportTypeSelectID: "donationExportSelect", 
      ggssSection: "donationGGSS",
      publishBtn: "donationGGSSPublishBtn"
    },
    REQUEST : {
      dataTable: requestTable, 
      ggssTable: requestGGSSTbl, 
      sectionName: "request", 
      wrap: "requestWrap",
      currentSection: "currentRequest",
      exportTypeSelectID: "requestExportSelect", 
      ggssSection: "requestGGSS",
      publishBtn: "requestGGSSPublishBtn"
    },
    CHEST_DATA : {
      dataTable: chestDataTable, 
      ggssTable: chestDataGGSSTbl, 
      sectionName: "chestdata", 
      wrap: "chestDataWrap",
      currentSection: "currentChestData",
      exportTypeSelectID: "chestDataExportSelect", 
      ggssSection: "chestDataGGSS",
      publishBtn: "chestDataGGSSPublishBtn"
    },
    TRIBE_DAGGER_RANK : {
      dataTable: tribeDaggerRankTable, 
      ggssTable: tribeDaggerRankGGSSTbl, 
      sectionName: "tribedaggerrank", 
      wrap: "tribeDaggerRankWrap",
      currentSection: "currentTribeDaggerRank",
      exportTypeSelectID: "tribeDaggerRankExportSelect", 
      ggssSection: "tribeDaggerRankGGSS",
      publishBtn: "tribeDaggerRankGGSSPublishBtn"
    },
    DATA_CONSTANT : {
      dataTable: dataConstantTable, 
      ggssTable: dataConstantGGSSTbl, 
      sectionName: "dataconstant", 
      wrap: "dataConstantWrap",
      currentSection: "currentDataConstant",
      exportTypeSelectID: "dataConstantExportSelect", 
      ggssSection: "dataConstantGGSS",
      publishBtn: "dataConstantGGSSPublishBtn"
    },
    CHEST_PROBABILITY : {
      dataTable: chestProbabilityTable, 
      ggssTable: chestProbabilityGGSSTbl, 
      sectionName: "chestprobability", 
      wrap: "chestProbabilityWrap",
      currentSection: "currentChestProbability",
      exportTypeSelectID: "chestProbabilityExportSelect", 
      ggssSection: "chestProbabilityGGSS",
      publishBtn: "chestProbabilityGGSSPublishBtn"
    },
    LOSER_DAGGER_MODIFIER : {
      dataTable: loserDaggerModifierTable, 
      ggssTable: loserDaggerModifierGGSSTbl, 
      sectionName: "loserdaggermodifier", 
      wrap: "loserDaggerModifierWrap",
      currentSection: "currentLoserDaggerModifier",
      exportTypeSelectID: "loserDaggerModifierExportSelect", 
      ggssSection: "loserDaggerModifierGGSS",
      publishBtn: "loserDaggerModifierGGSSPublishBtn"
    },
    FREE_GEM_SEQUENCE : {
      dataTable: freeGemSequenceTable, 
      ggssTable: freeGemSequenceGGSSTbl, 
      sectionName: "freegemsequence", 
      wrap: "freeGemSequenceWrap",
      currentSection: "currentFreeGemSequence",
      exportTypeSelectID: "freeGemSequenceExportSelect", 
      ggssSection: "freeGemSequenceGGSS",
      publishBtn: "freeGemSequenceGGSSPublishBtn"
    },
    CROWN_GEM_SEQUENCE : {
      dataTable: crownGemSequenceTable, 
      ggssTable: crownGemSequenceGGSSTbl, 
      sectionName: "crowngemsequence", 
      wrap: "crownGemSequenceWrap",
      currentSection: "currentCrownGemSequence",
      exportTypeSelectID: "crownGemSequenceExportSelect", 
      ggssSection: "crownGemSequenceGGSS",
      publishBtn: "crownGemSequenceGGSSPublishBtn"
    },
    TV_ROYALE : {
      dataTable: tvRoyaleTable, 
      ggssTable: tvRoyaleGGSSTbl, 
      sectionName: "tvroyale", 
      wrap: "tvRoyaleWrap",
      currentSection: "currentTVRoyale",
      exportTypeSelectID: "tvRoyaleExportSelect", 
      ggssSection: "tvRoyaleGGSS",
      publishBtn: "tvRoyaleGGSSPublishBtn"
    },
    TOWER_LEVEL : {
      dataTable: towerLevelTable, 
      ggssTable: towerLevelGGSSTbl, 
      sectionName: "towerlevel", 
      wrap: "towerLevelWrap",
      currentSection: "currentTowerLevel",
      exportTypeSelectID: "towerLevelExportSelect", 
      ggssSection: "towerLevelGGSS",
      publishBtn: "towerLevelGGSSPublishBtn"
    },
    SHOP_CARD_PRICE : {
      dataTable: shopCardPriceTable, 
      ggssTable: shopCardPriceGGSSTbl, 
      sectionName: "shopcardprice", 
      wrap: "shopCardPriceWrap",
      currentSection: "currentShopCardPrice",
      exportTypeSelectID: "shopCardPriceExportSelect", 
      ggssSection: "shopCardPriceGGSS",
      publishBtn: "shopCardPriceGGSSPublishBtn"
    },
    UNIT_EFFECT : {
      dataTable: unitEffectTable, 
      ggssTable: unitEffectGGSSTbl, 
      sectionName: "uniteffect", 
      wrap: "unitEffectWrap",
      currentSection: "currentUnitEffect",
      exportTypeSelectID: "unitEffectExportSelect", 
      ggssSection: "unitEffectGGSS",
      publishBtn: "unitEffectGGSSPublishBtn"
    },
    UNIT_SOUND_FX : {
      dataTable: unitSoundFXTable, 
      ggssTable: unitSoundFXGGSSTbl, 
      sectionName: "unitsoundfx", 
      wrap: "unitSoundFXWrap",
      currentSection: "currentUnitSoundFX",
      exportTypeSelectID: "unitSoundFXExportSelect", 
      ggssSection: "unitSoundFXGGSS",
      publishBtn: "unitSoundFXGGSSPublishBtn"
    },
  }

	  $("ul.navbar-nav").find("li").on('click', function() {
      $("ul.navbar-nav").find(".active")[0].className = "";
      $(this)[0].className = "active";
    })

    $("#arenaReferenceLink").on('click', function() {
      selectedSection = section.ARENA_REFERENCE;
      GetCurrentData();
    });

    $("#cardBuildingLink").on('click', function() {
      selectedSection = section.CARD_BUILDING;
      GetCurrentData();
    });

    $("#cardBuildingLevelLink").on('click', function() {
      selectedSection = section.CARD_BUILDING_LEVEL;
      GetCurrentData();
    });

    $("#cardTroopLink").on('click', function() {
      selectedSection = section.CARD_TROOP;
      GetCurrentData();
    });

    $("#cardTroopLevelLink").on('click', function() {
      selectedSection = section.CARD_TROOP_LEVEL;
      GetCurrentData();
    });

    $("#cardSpellLink").on('click', function() {
      selectedSection = section.CARD_SPELL;
      GetCurrentData();
    });

    $("#cardSpellLevelLink").on('click', function() {
      selectedSection = section.CARD_SPELL_LEVEL;
      GetCurrentData();
    });

    $("#buildingLink").on('click', function() {
      selectedSection = section.BUILDING;
      GetCurrentData();
    });

    $("#buildingLevelLink").on('click', function() {
      selectedSection = section.BUILDING_LEVEL;
      GetCurrentData();
    });

    $("#troopLink").on('click', function() {
      selectedSection = section.TROOP;
      GetCurrentData();
    });

    $("#troopLevelLink").on('click', function() {
      selectedSection = section.TROOP_LEVEL;
      GetCurrentData();
    });

    $("#spellLink").on('click', function() {
      selectedSection = section.SPELL;
      GetCurrentData();
    });

    $("#spellLevelLink").on('click', function() {
      selectedSection = section.SPELL_LEVEL;
      GetCurrentData();
    });

    $("#chestSequenceLink").on('click', function() {
      selectedSection = section.CHEST_SEQUENCE;
      GetCurrentData();
    });

    $("#achievementLink").on('click', function() {
      selectedSection = section.ACHIEVEMENT;
      GetCurrentData();
    });

    $("#donationLink").on('click', function() {
      selectedSection = section.DONATION;
      GetCurrentData();
    });

    $("#requestLink").on('click', function() {
      selectedSection = section.REQUEST;
      GetCurrentData();
    });

    $("#chestDataLink").on('click', function() {
      selectedSection = section.CHEST_DATA;
      GetCurrentData(section.CHEST_DATA);
    });

    $("#tribeDaggerRankLink").on('click', function() {
      selectedSection = section.TRIBE_DAGGER_RANK;
      GetCurrentData();
    });

    $("#dataConstantLink").on('click', function() {
      selectedSection = section.DATA_CONSTANT;
      GetCurrentData();
    });

    $("#chestProbabilityLink").on('click', function() {
      selectedSection = section.CHEST_PROBABILITY;
      GetCurrentData();
    });

    $("#loserDaggerModifierLink").on('click', function() {
      selectedSection = section.LOSER_DAGGER_MODIFIER;
      GetCurrentData();
    });

    $("#freeGemSequenceLink").on('click', function() {
      selectedSection = section.FREE_GEM_SEQUENCE;
      GetCurrentData();
    });

    $("#crownGemSequenceLink").on('click', function() {
      selectedSection = section.CROWN_GEM_SEQUENCE;
      GetCurrentData();
    });

    $("#tvRoyaleLink").on('click', function() {
      selectedSection = section.TV_ROYALE;
      GetCurrentData();
    });

    $("#towerLevelLink").on('click', function() {
      selectedSection = section.TOWER_LEVEL;
      GetCurrentData();
    });

    $("#shopCardPriceLink").on('click', function() {
      selectedSection = section.SHOP_CARD_PRICE;
      GetCurrentData();
    });

    $("#unitEffectLink").on('click', function() {
      selectedSection = section.UNIT_EFFECT;
      GetCurrentData();
    });

    $("#unitSoundFXLink").on('click', function() {
      selectedSection = section.UNIT_SOUND_FX;
      GetCurrentData();
    });

    selectedSection = section.ARENA_REFERENCE;
		GetCurrentData();  //default - first visit page

    var exportBtnArr = $('[name="exportBtn"]');
    for (var i = 0; i < exportBtnArr.length; i ++ ) {
      $("#" + exportBtnArr[i].id).click(function(e) {
        e.preventDefault();
        ExportFile();
      })
    }
})

// ggssForm
$("#ggssForm").submit(function() {
  $("#ggssForm").validate();
  if($("#ggssForm").valid()) {
    var spreadsheetUrl = $("#ggssUrl").val();
    GetSpreadsheetData(spreadsheetUrl);
  }
})

function ExportFile() {
  var dataObj = {};
  dataObj["exportType"] = $("#" + selectedSection.exportTypeSelectID).val();
  $.ajax({
    url: "exportgamedata/" + selectedSection.sectionName,
    method: "POST",
    data: dataObj
  })
  .done(function(resData) { 
    saveFile(resData, selectedSection.sectionName);  
  })
  .fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}

function GetCurrentData() {
	var section = "";
	var tempSectionWrap;
	$.ajax({
		url: "getdata/" + selectedSection.sectionName,
		method: "GET"
	})
	.done(function(resData) {
		var data = JSON.parse(resData).data;
		AddDataToTable(selectedSection.dataTable, data);
		ShowSection(selectedSection.wrap);
	})
	.fail(function(xhr, status, error) {
		showLoadingBar(100);
  	toastr.error(status, "Error", opts);
	})
}

function ShowSection(sectionName) {
  for (var i = 0; i < sectionWrap.length; i++) {
  		if (sectionWrap[i] == sectionName) {
  			$("#"+sectionWrap[i]).show();
  		} else {
  			$("#"+sectionWrap[i]).hide();
  		} 
  }
}

function GetSpreadsheetData(spreadsheetUrl) {
  var dataObj = {};
  dataObj["spreadsheetUrl"] = spreadsheetUrl;
  $.ajax({
    url: 'viewspreadsheetdata/' + selectedSection.sectionName,
    method: 'GET',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData){
    showLoadingBar(100);
    AddDataToTable(selectedSection.ggssTable, resData);
    $('html, body').animate({
        scrollTop: $("#"+selectedSection.ggssSection).offset().top
      }, 500);
    AddEventForPublishBtn(selectedSection);
  }).
  fail(function(xhr, status, error){
    toastr.error(status, "Error", opts);
    showLoadingBar(100);
  })
}

function AddDataToTable(table, resData) {
  var dataArr = resData.split("\n");
  var tableData = [];
  for (var i = 1; i <= dataArr.length -1; i++) {        //i = 0 -> headertext
    var tdDataArr = dataArr[i].split("\t");
    if (tdDataArr.length > 1){                         // prevent null array ([""])
      for (var j = 0; j < tdDataArr.length; j++) {
        if (tdDataArr[j] == null) {
          tdDataArr[j] == "";
        }
      }
      tableData.push(tdDataArr);
    }
  }
  table.fnClearTable();
  table.fnAddData(tableData);
}

function AddEventForPublishBtn(selectedSection) {
  $("#" + selectedSection.publishBtn).click (function(e) {
    $("#publishConfirmDialog").dialog("open");
  }) 
}

function PublishGGSSToServer() {
  $.ajax({
    url: 'publishspreadsheet/' + selectedSection.sectionName,
    method: 'GET',
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData){
    showLoadingBar(100);
    if(resData == "0") {
      GetCurrentData();
      $("#publishConfirmDialog").dialog("close");
      $('html, body').animate({
        scrollTop: $("#"+selectedSection.currentSection).offset().top
      }, 500);
    }
  }).
  fail(function(xhr, status, error){
    toastr.error(status, "Error", opts);
    showLoadingBar(100);
  })
}
