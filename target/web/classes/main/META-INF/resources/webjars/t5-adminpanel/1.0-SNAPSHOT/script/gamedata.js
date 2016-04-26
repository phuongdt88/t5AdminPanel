var sections = ["arenaReferenceWrap",
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

// var gameDataObj = {chestData:1};

jQuery(document).ready(function($)
{
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
        ]
      });

  chestSequenceGGSSTbl = $("#chestSequenceGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
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

	  $("ul.navbar-nav").find("li").on('click', function() {
      $("ul.navbar-nav").find(".active")[0].className = "";
      $(this)[0].className = "active";
    })

    $("#arenaReferenceLink").on('click', function() {
      GetTableData(arenaReferenceTable);
    });

    $("#cardBuildingLink").on('click', function() {
      GetTableData(cardBuildingTable);
    });

    $("#cardBuildingLevelLink").on('click', function() {
      GetTableData(cardBuildingLevelTable);
    });

    $("#cardTroopLink").on('click', function() {
      GetTableData(cardTroopTable);
    });

    $("#cardTroopLevelLink").on('click', function() {
      GetTableData(cardTroopLevelTable);
    });

    $("#cardSpellLink").on('click', function() {
      GetTableData(cardSpellTable);
    });

    $("#cardSpellLevelLink").on('click', function() {
      GetTableData(cardSpellLevelTable);
    });

    $("#buildingLink").on('click', function() {
      GetTableData(buildingTable);
    });

    $("#buildingLevelLink").on('click', function() {
      GetTableData(buildingLevelTable);
    });

    $("#troopLink").on('click', function() {
      GetTableData(troopTable);
    });

    $("#troopLevelLink").on('click', function() {
      GetTableData(troopLevelTable);
    });

    $("#spellLink").on('click', function() {
      GetTableData(spellTable);
    });

    $("#spellLevelLink").on('click', function() {
      GetTableData(spellLevelTable);
    });

    $("#chestSequenceLink").on('click', function() {
      GetTableData(chestSequenceTable);
    });

    $("#achievementLink").on('click', function() {
      GetTableData(achievementTable);
    });

    $("#donationLink").on('click', function() {
      GetTableData(donationTable);
    });

    $("#requestLink").on('click', function() {
      GetTableData(requestTable);
    });

    $("#chestDataLink").on('click', function() {
      GetTableData(chestDataTable);
    });

    $("#tribeDaggerRankLink").on('click', function() {
      GetTableData(tribeDaggerRankTable);
    });

    $("#dataConstantLink").on('click', function() {
      GetTableData(dataConstantTable);
    });

    $("#chestProbabilityLink").on('click', function() {
      GetTableData(chestProbabilityTable);
    });

    $("#loserDaggerModifierLink").on('click', function() {
      GetTableData(loserDaggerModifierTable);
    });

    $("#freeGemSequenceLink").on('click', function() {
      GetTableData(freeGemSequenceTable);
    });

    $("#crownGemSequenceLink").on('click', function() {
      GetTableData(crownGemSequenceTable);
    });

    $("#tvRoyaleLink").on('click', function() {
      GetTableData(tvRoyaleTable);
    });

    $("#towerLevelLink").on('click', function() {
      GetTableData(towerLevelTable);
    });

    $("#shopCardPriceLink").on('click', function() {
      GetTableData(shopCardPriceTable);
    });

    $("#unitEffectLink").on('click', function() {
      GetTableData(unitEffectTable);
    });

    $("#unitSoundFXLink").on('click', function() {
      GetTableData(unitSoundFXTable);
    });

		GetTableData(arenaReferenceTable);  //default - first visit page

    $("#arenaRefExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#arenaRefExportSelect").val(), "arenareference");
    });

    $("#cardBuildingExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#cardBuildingExportSelect").val(), "cardbuilding");
    });

    $("#cardBuildingLevelExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#cardBuildingLevelExportSelect").val(), "cardbuildinglevel");
    });

    $("#cardTroopExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#cardTroopExportSelect").val(), "cardtroop");
    });

    $("#cardTroopLevelExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#cardTroopLevelExportSelect").val(), "cardtrooplevel");
    });

    $("#cardSpellExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#cardSpellExportSelect").val(), "cardspell");
    });

    $("#cardSpellLevelExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#cardSpellLevelExportSelect").val(), "cardspelllevel");
    });

    $("#buildingExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#buildingExportSelect").val(), "building");
    });

    $("#troopExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#troopExportSelect").val(), "troop");
    });

    $("#spellExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#spellExportSelect").val(), "spell");
    });

    $("#buildingLevelExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#buildingLevelExportSelect").val(), "buildinglevel");
    });

    $("#troopLevelExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#troopLevelExportSelect").val(), "trooplevel");
    });

    $("#spellLevelExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#spellLevelExportSelect").val(), "spelllevel");
    });

    $("#chestSequenceExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#chestSequenceExportSelect").val(), "chestsequence");
    });

    $("#achievementExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#achievementExportSelect").val(), "achievement");
    });

    $("#donationExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#donationExportSelect").val(), "donation");
    });

    $("#chestDataExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#chestDataExportSelect").val(), "chestdata");
    });

    $("#requestExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#requestExportSelect").val(), "request");
    });

    $("#tribeDaggerRankExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#tribeDaggerRankExportSelect").val(), "tribedaggerrank");
    });

    $("#dataConstantExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#dataConstantExportSelect").val(), "dataconstant");
    });

    $("#chestProbabilityExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#chestProbabilityExportSelect").val(), "chestprobability");
    });

    $("#loserDaggerModifierExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#loserDaggerModifierExportSelect").val(), "loserdaggermodifier");
    });

    $("#freeGemSequenceExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#freeGemSequenceExportSelect").val(), "freegemsequence");
    });

    $("#crownGemSequenceExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#crownGemSequenceExportSelect").val(), "crowngemsequence");
    });

    $("#tvRoyaleExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#tvRoyaleExportSelect").val(), "tvroyale");
    });

    $("#towerLevelExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#towerLevelExportSelect").val(), "towerlevel");
    });

    $("#shopCardPriceExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#shopCardPriceExportSelect").val(), "shopcardprice");
    });

    $("#unitEffectExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#unitEffectExportSelect").val(), "uniteffect");
    });

    $("#unitSoundFXExportBtn").click(function(e) {
      e.preventDefault();
      ExportFile($("#unitSoundFXExportSelect").val(), "unitsoundfx");
    });
})

// arenaReferenceGGSSForm
$("#arenaReferenceGGSSForm").submit(function() {
  $("#arenaReferenceGGSSForm").validate();
  if($("#arenaReferenceGGSSForm").valid()) {
    GetSpreadsheetData("arenareference", $("#arenaReferenceGGSSUrl").val());
  }
})

// cardBuildingGGSSForm
$("#cardBuildingGGSSForm").submit(function() {
  $("#cardBuildingGGSSForm").validate();
  if($("#cardBuildingGGSSForm").valid()) {
    GetSpreadsheetData("cardbuilding", $("#cardBuildingGGSSUrl").val());
  }
})

// cardBuildingLevelGGSSForm
$("#cardBuildingLevelGGSSForm").submit(function() {
  $("#cardBuildingLevelGGSSForm").validate();
  if($("#cardBuildingLevelGGSSForm").valid()) {
    GetSpreadsheetData("cardbuildinglevel", $("#cardBuildingLevelGGSSUrl").val());
  }
})

// cardTroopGGSSForm
$("#cardTroopGGSSForm").submit(function() {
  $("#cardTroopGGSSForm").validate();
  if($("#cardTroopGGSSForm").valid()) {
    GetSpreadsheetData("cardtroop", $("#cardTroopLevelGGSSUrl").val());
  }
})

// cardTroopLevelGGSSForm
$("#cardTroopLevelGGSSForm").submit(function() {
  $("#cardTroopLevelGGSSForm").validate();
  if($("#cardTroopLevelGGSSForm").valid()) {
    GetSpreadsheetData("cardtrooplevel", $("#cardTroopGGSSUrl").val());
  }
})

// cardSpellGGSSForm
$("#cardSpellGGSSForm").submit(function() {
  $("#cardSpellGGSSForm").validate();
  if($("#cardSpellGGSSForm").valid()) {
    GetSpreadsheetData("cardspell", $("#cardSpellGGSSUrl").val());
  }
})

// cardSpellLevelGGSSForm
$("#cardSpellLevelGGSSForm").submit(function() {
  $("#cardSpellLevelGGSSForm").validate();
  if($("#cardSpellLevelGGSSForm").valid()) {
    GetSpreadsheetData("cardspelllevel", $("#cardSpellLevelGGSSUrl").val());
  }
})

// buildingGGSSForm
$("#buildingGGSSForm").submit(function() {
  $("#buildingGGSSForm").validate();
  if($("#buildingGGSSForm").valid()) {
    GetSpreadsheetData("building", $("#buildingGGSSUrl").val());
  }
})

// buildingLevelGGSSForm
$("#buildingLevelGGSSForm").submit(function() {
  $("#buildingLevelGGSSForm").validate();
  if($("#buildingLevelGGSSForm").valid()) {
    GetSpreadsheetData("buildinglevel", $("#buildingLevelGGSSUrl").val());
  }
})

// troopGGSSForm
$("#troopGGSSForm").submit(function() {
  $("#troopGGSSForm").validate();
  if($("#troopGGSSForm").valid()) {
    GetSpreadsheetData("troop", $("#troopGGSSUrl").val());
  }
})

// troopLevelGGSSForm
$("#troopLevelGGSSForm").submit(function() {
  $("#troopLevelGGSSForm").validate();
  if($("#troopLevelGGSSForm").valid()) {
    GetSpreadsheetData("trooplevel", $("#troopLevelGGSSUrl").val());
  }
})

// spellGGSSForm
$("#spellGGSSForm").submit(function() {
  $("#spellGGSSForm").validate();
  if($("#spellGGSSForm").valid()) {
    GetSpreadsheetData("spell", $("#spellGGSSUrl").val());
  }
})

// spellLevelGGSSForm
$("#spellLevelGGSSForm").submit(function() {
  $("#spellLevelGGSSForm").validate();
  if($("#spellLevelGGSSForm").valid()) {
    GetSpreadsheetData("spelllevel", $("#spellLevelGGSSUrl").val());
  }
})

// chestSequenceGGSSForm
$("#chestSequenceGGSSForm").submit(function() {
  $("#chestSequenceGGSSForm").validate();
  if($("#chestSequenceGGSSForm").valid()) {
    GetSpreadsheetData("chestsequence", $("#chestSequenceGGSSUrl").val());
  }
})

// achievementGGSSForm
$("#achievementGGSSForm").submit(function() {
  $("#achievementGGSSForm").validate();
  if($("#achievementGGSSForm").valid()) {
    GetSpreadsheetData("achievement", $("#achievementGGSSUrl").val());
  }
})

// donationGGSSForm
$("#donationGGSSForm").submit(function() {
  $("#donationGGSSForm").validate();
  if($("#donationGGSSForm").valid()) {
    GetSpreadsheetData("donation", $("#donationGGSSUrl").val());
  }
})

// chestDataGGSSForm
$("#chestDataGGSSForm").submit(function() {
  $("#chestDataGGSSForm").validate();
  if($("#chestDataGGSSForm").valid()) {
    GetSpreadsheetData("chestdata", $("#chestDataGGSSUrl").val());
  }
})

// requestGGSSForm
$("#requestGGSSForm").submit(function() {
  $("#requestGGSSForm").validate();
  if($("#requestGGSSForm").valid()) {
    GetSpreadsheetData("request", $("#requestGGSSUrl").val());
  }
})

// tribeDaggerRankGGSSForm
$("#tribeDaggerRankGGSSForm").submit(function() {
  $("#tribeDaggerRankGGSSForm").validate();
  if($("#tribeDaggerRankGGSSForm").valid()) {
    GetSpreadsheetData("tribedaggerrank", $("#tribeDaggerRankGGSSUrl").val());
  }
})

// dataConstantGGSSForm
$("#dataConstantGGSSForm").submit(function() {
  $("#dataConstantGGSSForm").validate();
  if($("#dataConstantGGSSForm").valid()) {
    GetSpreadsheetData("dataconstant", $("#dataConstantGGSSUrl").val());
  }
})

// chestProbabilityGGSSForm
$("#chestProbabilityGGSSForm").submit(function() {
  $("#chestProbabilityGGSSForm").validate();
  if($("#chestProbabilityGGSSForm").valid()) {
    GetSpreadsheetData("chestprobability", $("#chestProbabilityGGSSUrl").val());
  }
})

// loserDaggerModifierGGSSForm
$("#loserDaggerModifierGGSSForm").submit(function() {
  $("#loserDaggerModifierGGSSForm").validate();
  if($("#loserDaggerModifierGGSSForm").valid()) {
    GetSpreadsheetData("loserdaggermodifier", $("#loserDaggerModifierGGSSUrl").val());
  }
})

// freeGemSequenceGGSSForm
$("#freeGemSequenceGGSSForm").submit(function() {
  $("#freeGemSequenceGGSSForm").validate();
  if($("#freeGemSequenceGGSSForm").valid()) {
    GetSpreadsheetData("freegemsequence", $("#freeGemSequenceGGSSUrl").val());
  }
})

// crownGemSequenceGGSSForm
$("#crownGemSequenceGGSSForm").submit(function() {
  $("#crownGemSequenceGGSSForm").validate();
  if($("#crownGemSequenceGGSSForm").valid()) {
    GetSpreadsheetData("crowngemsequence", $("#crownGemSequenceGGSSUrl").val());
  }
})

// tvRoyaleGGSSForm
$("#tvRoyaleGGSSForm").submit(function() {
  $("#tvRoyaleGGSSForm").validate();
  if($("#tvRoyaleGGSSForm").valid()) {
    GetSpreadsheetData("tvroyale", $("#tvRoyaleGGSSUrl").val());
  }
})

// towerLevelGGSSForm
$("#towerLevelGGSSForm").submit(function() {
  $("#towerLevelGGSSForm").validate();
  if($("#towerLevelGGSSForm").valid()) {
    GetSpreadsheetData("towerlevel", $("#towerLevelGGSSUrl").val());
  }
})

// shopCardPriceGGSSForm
$("#shopCardPriceGGSSForm").submit(function() {
  $("#shopCardPriceGGSSForm").validate();
  if($("#shopCardPriceGGSSForm").valid()) {
    GetSpreadsheetData("shopcardprice", $("#shopCardPriceGGSSUrl").val());
  }
})

// shopCardPriceGGSSForm
$("#unitEffectGGSSForm").submit(function() {
  $("#unitEffectGGSSForm").validate();
  if($("#unitEffectGGSSForm").valid()) {
    GetSpreadsheetData("uniteffect", $("#unitEffectGGSSUrl").val());
  }
})

// unitSoundFXGGSSForm
$("#unitSoundFXGGSSForm").submit(function() {
  $("#unitSoundFXGGSSForm").validate();
  if($("#unitSoundFXGGSSForm").valid()) {
    GetSpreadsheetData("unitsoundfx", $("#unitSoundFXGGSSUrl").val());
  }
})


function ExportFile(exportType, section) {
  var dataObj = {};
  dataObj["exportType"] = exportType;
  $.ajax({
    url: "exportgamedata/" + section,
    method: "POST",
    data: dataObj
  })
  .done(function(resData) {
    console.log(resData);
    var fileName = "test_download_file";
    saveFile(resData, fileName);
  })
  .fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}

function GetTableData(table) {
	var section = "";
	var tempSectionWrap;
	switch (table) {
		case arenaReferenceTable:
			section = "arenareference";
			tempSectionWrap = "arenaReferenceWrap";
			break;
		case cardBuildingTable:
			section = "cardbuilding";
			tempSectionWrap = "cardBuildingWrap";
			break;
		case cardBuildingLevelTable:
			section = "cardbuildinglevel";
			tempSectionWrap = "cardBuildingLevelWrap";
			break;
		case cardTroopTable:
			section = "cardtroop";
			tempSectionWrap = "cardTroopWrap";
			break;
		case cardTroopLevelTable:
			section = "cardtrooplevel";
			tempSectionWrap = "cardTroopLevelWrap";
			break;
		case cardSpellTable:
			section = "cardspell";
			tempSectionWrap = "cardSpellWrap";
			break;
		case cardSpellLevelTable:
			section = "cardspelllevel";
			tempSectionWrap = "cardSpellLevelWrap";
			break;
		case buildingTable:
			section = "building";
			tempSectionWrap = "buildingWrap";
			break;
		case troopTable:
			section = "troop";
			tempSectionWrap = "troopWrap";
			break;
		case spellTable:
			section = "spell";
			tempSectionWrap = "spellWrap";
			break;
		case buildingLevelTable:
			section = "buildinglevel";
			tempSectionWrap = "buildingLevelWrap";
			break;
		case troopLevelTable:
			section = "trooplevel";
			tempSectionWrap = "troopLevelWrap";
			break;
		case spellLevelTable:
			section = "spelllevel";
			tempSectionWrap = "spellLevelWrap";
			break;
    case chestSequenceTable:
      section = "chestsequence";
      tempSectionWrap = "chestSequenceWrap";
      break;
    case achievementTable:
      section = "achievement";
      tempSectionWrap = "achievementWrap";
      break;
    case donationTable:
      section = "donation";
      tempSectionWrap = "donationWrap";
      break;
    case requestTable:
      section = "request";
      tempSectionWrap = "requestWrap";
      break;
    case chestDataTable:
      section = "chestdata";
      tempSectionWrap = "chestDataWrap";
      break;
    case tribeDaggerRankTable:
      section = "tribedaggerrank";
      tempSectionWrap = "tribeDaggerRankWrap";
      break;
    case dataConstantTable:
      section = "dataconstant";
      tempSectionWrap = "dataConstantWrap";
      break;
    case chestProbabilityTable:
      section = "chestprobability";
      tempSectionWrap = "chestProbabilityWrap";
      break;
    case loserDaggerModifierTable:
      section = "loserdaggermodifier";
      tempSectionWrap = "loserDaggerModifierWrap";
      break;
    case freeGemSequenceTable:
      section = "freegemsequence";
      tempSectionWrap = "freeGemSequenceWrap";
      break;
    case crownGemSequenceTable:
      section = "crowngemsequence";
      tempSectionWrap = "crownGemSequenceWrap";
      break;
    case tvRoyaleTable:
      section = "tvroyale";
      tempSectionWrap = "tvRoyaleWrap";
      break;
    case towerLevelTable:
      section = "towerlevel";
      tempSectionWrap = "towerLevelWrap";
      break;
    case shopCardPriceTable:
      section = "shopcardprice";
      tempSectionWrap = "shopCardPriceWrap";
      break;
    case unitEffectTable:
      section = "uniteffect";
      tempSectionWrap = "unitEffectWrap";
      break;
    case unitSoundFXTable:
      section = "unitsoundfx";
      tempSectionWrap = "unitSoundFXWrap";
      break;
	}
	$.ajax({
		url: "getdata/" + section,
		method: "GET"
	})
	.done(function(resData) {
		var data = JSON.parse(resData).data;
		AddDataToDBTable(table, data);
		ShowSection(tempSectionWrap);
	})
	.fail(function(xhr, status, error) {
		showLoadingBar(100);
  	toastr.error(status, "Error", opts);
	})
}

function AddDataToDBTable(table, data) {
  var dataArr = data.split("\n");
  var tableData = [];
  for (var i = 1; i < dataArr.length; i++){        //i = 0 -> headertext
    var tdDataArr = dataArr[i].split("\t");
    if (tdDataArr.length > 1){                         // prevent null array ([""])
      tableData.push(tdDataArr);
    }
  }
  table.fnClearTable();
  table.fnAddData(tableData);
}

function ShowSection(sectionName) {
  for (var i = 0; i < sections.length; i++) {
  		if (sections[i] == sectionName) {
  			$("#"+sections[i]).show();
  		} else {
  			$("#"+sections[i]).hide();
  		} 
  }
}

function GetSpreadsheetData(sectionName, spreadsheetUrl) {
  var table;
  var ggssSection;
  var dataObj = {};
  switch (sectionName) {
    case "arenareference":
      table = arenaReferenceGGSSTbl;
      ggssSection = "arenaReferenceGGSS";
      break;
    case "cardbuilding":
      table = cardBuildingGGSSTbl;
      ggssSection = "cardBuildingGGSS";
      break;
    case "cardbuildinglevel":
      table = cardBuildingLevelGGSSTbl;
      ggssSection = "cardBuildingLevelGGSS";
      break;
    case "cardtroop":
      table = cardTroopGGSSTbl;
      ggssSection = "cardTroopGGSS";
      break;
    case "cardtrooplevel":
      table = cardTroopLevelGGSSTbl;
      ggssSection = "cardTroopLevelGGSS";
      break;
    case "cardspell":
      table = cardSpellGGSSTbl;
      ggssSection = "cardSpellGGSS";
      break;
    case "cardspelllevel":
      table = cardSpellLevelGGSSTbl;
      ggssSection = "cardSpellLevelGGSS";
      break;
    case "building":
      table = buildingGGSSTbl;
      ggssSection = "buildingGGSS";
      break;
    case "buildinglevel":
      table = buildingLevelGGSSTbl;
      ggssSection = "buildingLevelGGSS";
      break;
    case "troop":
      table = troopGGSSTbl;
      ggssSection = "troopGGSS";
      break;
    case "trooplevel":
      table = troopLevelGGSSTbl;
      ggssSection = "troopLevelGGSS";
      break;
    case "spell":
      table = spellGGSSTbl;
      ggssSection = "spellGGSS";
      break;
    case "spelllevel":
      table = spellLevelGGSSTbl;
      ggssSection = "spellLevelGGSS";
      break;
    case "chestsequence":
      table = chestSequenceGGSSTbl;
      ggssSection = "chestSequenceGGSS";
      break;
    case "achievement":
      table = achievementGGSSTbl;
      ggssSection = "achievementGGSS";
      break;
    case "donation":
      table = donationGGSSTbl;
      ggssSection = "donationGGSS";
      break;
    case "request":
      table = requestGGSSTbl;
      ggssSection = "requestGGSS";
      break;
    case "chestdata":
      table = chestDataGGSSTbl;
      ggssSection = "chestDataGGSS";
      break;
    case "tribedaggerrank":
      table = tribeDaggerRankGGSSTbl;
      ggssSection = "tribeDaggerRankGGSS";
      break;
    case "dataconstant":
      table = dataConstantGGSSTbl;
      ggssSection = "dataConstantGGSS";
      break;
    case "chestprobability":
      table = chestProbabilityGGSSTbl;
      ggssSection = "chestProbabilityGGSS";
      break;
    case "loserdaggermodifier":
      table = loserDaggerModifierGGSSTbl;
      ggssSection = "loserDaggerModifierGGSS";
      break;
    case "freegemsequence":
      table = freeGemSequenceGGSSTbl;
      ggssSection = "freeGemSequenceGGSS";
      break;
    case "crowngemsequence":
      table = crownGemSequenceGGSSTbl;
      ggssSection = "crownGemSequenceGGSS";
      break;
    case "tvroyale":
      table = tvRoyaleGGSSTbl;
      ggssSection = "tvRoyaleGGSS";
      break;
    case "towerlevel":
      table = towerLevelGGSSTbl;
      ggssSection = "towerLevelGGSS";
      break;
    case "shopcardprice":
      table = shopCardPriceGGSSTbl;
      ggssSection = "shopCardPriceGGSS";
      break;
    case "uniteffect":
      table = unitEffectGGSSTbl;
      ggssSection = "unitEffectGGSS";
      break;
    case "unitsoundfx":
      table = unitSoundFXGGSSTbl;
      ggssSection = "unitSoundFXGGSS";
      break;
  }
  dataObj["spreadsheetUrl"] = spreadsheetUrl;
  $.ajax({
    url: 'viewspreadsheetdata/' + sectionName,
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData){
    showLoadingBar(100);
    AddDataToGGSSTable(table, resData);
    console.log(resData);
    $(document).scrollTop( $("#"+ggssSection).offset().top );
  }).
  fail(function(xhr, status, error){
    toastr.error(status, "Error", opts);
    showLoadingBar(100);
  })
}

function AddDataToGGSSTable(table, resData) {
  console.log(resData);
  var dataArr = resData.split("\n");
  var tableData = [];
  for(var i = 0; i <= dataArr.length -1; i++){
    var tdDataArr = dataArr[i].split("\t");
    if(tdDataArr.length > 1){                         // prevent null array ([""])
      tableData.push(tdDataArr);
    }
  }
  table.fnClearTable();
  table.fnAddData(tableData);
  // $(".publishBtn").unbind('click');
  // $(".publishBtn").click(function(event) {
  //    var table = getTableFromPublishBtn(this.id);
  //    var tableData = getDataFromGGSSTbl(table);
  //    publishGGSSToServer(table, tableData);
  // })
}