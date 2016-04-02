var sections = ["campaignWrap",
                "unitLevelsWrap",
                "combatUnitsWrap",
                "defensiveBuildingsWrap",
                "defensiveBuildingLevelWrap",
                "resourceBuildingsWrap",
                "armyBuildingsWrap",
                "otherBuildingsWrap",
                "townHallLevelWrap",
                "decorationsWrap",
                "spellsWrap",
                "spellLevelsWrap",
                "obstaclesWrap",
                "trophyWrap",
                "achievementsWrap"]

jQuery(document).ready(function($)
{
 if(gameVersionSelected()){
    campaignDBTbl = $("#campaignDBTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });


      campaignGGSSTbl = $("#campaignGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

      unitLevelsDBTbl = $("#unitLevelsDBTbl").dataTable({
         "bSort" : false,
         "sScrollX":'130%',
         "aLengthMenu": [
           [25, 50, 100, -1], [25, 50, 100, "All"]
         ]
      });

      unitLevelsGGSSTbl = $("#unitLevelsGGSSTbl").dataTable({
         "bSort" : false,
         "sScrollX":'130%',
         "aLengthMenu": [
           [25, 50, 100, -1], [25, 50, 100, "All"]
         ]
      });

      combatUnitsDBTbl = $("#combatUnitsDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'150%'
      });

      combatUnitsGGSSTbl = $("#combatUnitsGGSSTbl").dataTable({
          "bSort" : false,
          "bPaginate": false,
          "sScrollX":'150%'
      });

      defensiveBuildingsDBTbl = $("#defensiveBuildingsDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'150%'
      });

      defensiveBuildingsGGSSTbl = $("#defensiveBuildingsGGSSTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'150%'
      });

       defensiveBuildingLevelDBTbl = $("#defensiveBuildingLevelDBTbl").dataTable({
           "bSort" : false,
           "sScrollX":'200%',
           "aLengthMenu": [
              [25, 50, 100, -1], [25, 50, 100, "All"]
            ]
        });

        defensiveBuildingLevelGGSSTbl = $("#defensiveBuildingLevelGGSSTbl").dataTable({
           "bSort" : false,
           "sScrollX":'200%',
           "aLengthMenu": [
              [25, 50, 100, -1], [25, 50, 100, "All"]
            ]
        });

       resourceBuildingsDBTbl = $("#resourceBuildingsDBTbl").dataTable({
           "bSort" : false,
           "sScrollX":'250%',
           "aLengthMenu": [
             [25, 50, 100, -1], [25, 50, 100, "All"]
           ]
        });

       resourceBuildingsGGSSTbl = $("#resourceBuildingsGGSSTbl").dataTable({
           "bSort" : false,
           "sScrollX":'250%',
           "aLengthMenu": [
             [25, 50, 100, -1], [25, 50, 100, "All"]
           ]
        });

       armyBuildingsDBTbl = $("#armyBuildingsDBTbl").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
           [25, 50, 100, -1], [25, 50, 100, "All"]
         ]
       });

       armyBuildingsGGSSTbl = $("#armyBuildingsGGSSTbl").dataTable({
          "bSort" : false,
          "sScrollX":'200%',
          "aLengthMenu": [
            [25, 50, 100, -1], [25, 50, 100, "All"]
          ]
       });

      otherBuildingsDBTbl = $("#otherBuildingsDBTbl").dataTable({
           "bSort" : false,
           "bPaginate": false,
           "sScrollX":'200%',
        });

      otherBuildingsGGSSTbl = $("#otherBuildingsGGSSTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'200%',
      });

      townHallLevelDBTbl = $("#townHallLevelDBTbl").dataTable({
           "bSort" : false,
           "aLengthMenu": [
             [25, 50, 100, -1], [25, 50, 100, "All"]
           ]
        });

      townHallLevelGGSSTbl = $("#townHallLevelGGSSTbl").dataTable({
         "bSort" : false,
         "aLengthMenu": [
           [25, 50, 100, -1], [25, 50, 100, "All"]
         ]
      });

      decorationsDBTbl = $("#decorationsDBTbl").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

      decorationsGGSSTbl = $("#decorationsGGSSTbl").dataTable({
         "bSort" : false,
         "sScrollX":'200%',
         "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      });

      spellsDBTbl = $("#spellsDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'120%'
      });

      spellsGGSSTbl = $("#spellsGGSSTbl").dataTable({
           "bSort" : false,
           "bPaginate": false,
           "sScrollX":'120%'
        });

      spellLevelsDBTbl = $("#spellLevelsDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'150%'
      });

      spellLevelsGGSSTbl = $("#spellLevelsGGSSTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'150%'
      });

      obstaclesDBTbl = $("#obstaclesDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'150%'
      });

      obstaclesGGSSTbl = $("#obstaclesGGSSTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "sScrollX":'150%'
      });

      trophyDBTbl = $("#trophyDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
      });

      trophyGGSSTbl = $("#trophyGGSSTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
      });

      achievementsDBTbl = $("#achievementsDBTbl").dataTable({
         "bSort" : false,
         "sScrollX": '150%',
         "aLengthMenu": [
           [25, 50, 100, -1], [25, 50, 100, "All"]
         ]
      });

      achievementsGGSSTbl = $("#achievementsGGSSTbl").dataTable({
         "bSort" : false,
         "sScrollX": '150%',
         "aLengthMenu": [
           [25, 50, 100, -1], [25, 50, 100, "All"]
         ]
      });

  //  hideAllSections();

    hideAllSectionsExceptCampaign();
    getSectionFromDB("campaign");
    $("#campaignWrap").show();


    $("ul.navbar-nav").find("li").on('click', function() {
      $("ul.navbar-nav").find(".active")[0].className = "";
      $(this)[0].className = "active";
    })


  //  click on campaign link
    $("#campaignLink").on('click', function() {
      getSectionFromDB("campaign");
    });

  //  click on unit level link
    $("#unitLevelsLink").on('click', function(){
      getSectionFromDB("unitLevels");
    });

  //  click on combat units link
    $("#combatUnitsLink").on('click', function(){
        getSectionFromDB("combatUnits");
      });

  //    click on defensive buildings link
    $("#defensiveBuildingsLink").on('click', function(){
      getSectionFromDB("defensiveBuildings");
    });

  //    click on defensive building level link
    $("#defensiveBuildingLevelLink").on('click', function(){
      getSectionFromDB("defensiveBuildingLevel");
    });

  //    click on resource buildings  link
    $("#resourceBuildingsLink").on('click', function(){
      getSectionFromDB("resourceBuildings");
    });

  //    click on army buildings  link
    $("#armyBuildingsLink").on('click', function(){
      getSectionFromDB("armyBuildings");
    });

  //    click on other buildings  link
    $("#otherBuildingsLink").on('click', function(){
      getSectionFromDB("otherBuildings");
    });

  //    click on town hall level  link
    $("#townHallLevelLink").on('click', function(){
      getSectionFromDB("townHallLevel");
    });

  //    click on decorations  link
    $("#decorationsLink").on('click', function(){
      getSectionFromDB("decorations");
    });

  //    click on spells  link
    $("#spellsLink").on('click', function(){
      getSectionFromDB("spells");
    });

  //    click on spell levels  link
    $("#spellLevelsLink").on('click', function(){
      getSectionFromDB("spellLevels");
    });

  //    click on obstacles  link
    $("#obstaclesLink").on('click', function(){
      getSectionFromDB("obstacles");
    });

  //    click on trophy  link
    $("#trophyLink").on('click', function(){
      getSectionFromDB("trophy");
    });

  //    click on achievements  link
    $("#achievementsLink").on('click', function(){
      getSectionFromDB("achievements");
    });


  //  armyBuildingsGGSSForm
    $("#armyBuildingsGGSSForm").submit(function() {
      $("#armyBuildingsGGSSForm").validate();
      if($("#armyBuildingsGGSSForm").valid()) {
        var spreadsheetUrl = $("#armyBuildingsGGSSUrl").val();
        var sectionName = "Army Building";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  // campaignGGSSForm
    $("#campaignGGSSForm").submit(function() {
      $("#campaignGGSSForm").validate();
      if($("#campaignGGSSForm").valid()) {
        var spreadsheetUrl = $("#campaignGGSSUrl").val();
        var sectionName = "Campaign";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  combatUnitsGGSSForm
    $("#combatUnitsGGSSForm").submit(function() {
      $("#combatUnitsGGSSForm").validate();
      if($("#combatUnitsGGSSForm").valid()){
        var spreadsheetUrl = $("#combatUnitsGGSSUrl").val();
        var sectionName = "Combat Units";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  unitLevelsGGSSForm
    $("#unitLevelsGGSSForm").submit(function() {
      $("#unitLevelsGGSSForm").validate();
      if($("#unitLevelsGGSSForm").valid()){
        var spreadsheetUrl = $("#unitLevelsGGSSUrl").val();
        var sectionName = "Unit levels";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  defensiveBuildingsGGSSForm
    $("#defensiveBuildingsGGSSForm").submit(function() {
      $("#defensiveBuildingsGGSSForm").validate();
      if($("#defensiveBuildingsGGSSForm").valid()){
        var spreadsheetUrl = $("#defensiveBuildingsGGSSUrl").val();
        var sectionName = "Defensive Buildings";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  defensiveBuildingLevelGGSSForm
    $("#defensiveBuildingLevelGGSSForm").submit(function() {
      $("#defensiveBuildingLevelGGSSForm").validate();
      if($("#defensiveBuildingLevelGGSSForm").valid()){
        var spreadsheetUrl = $("#defensiveBuildingLevelGGSSUrl").val();
        var sectionName = "Defensive Buildings Level";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  resourceBuildingsGGSSForm
    $("#resourceBuildingsGGSSForm").submit(function() {
      $("#resourceBuildingsGGSSForm").validate();
      if($("#resourceBuildingsGGSSForm").valid()){
        var spreadsheetUrl = $("#resourceBuildingsGGSSUrl").val();
        var sectionName = "Resource Building variables";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  otherBuildingsGGSSForm
    $("#otherBuildingsGGSSForm").submit(function() {
      $("#otherBuildingsGGSSForm").validate();
      if($("#otherBuildingsGGSSForm").valid()){
        var spreadsheetUrl = $("#otherBuildingsGGSSUrl").val();
        var sectionName = "Other Buildings";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  townHallLevelGGSSForm
    $("#townHallLevelGGSSForm").submit(function() {
      $("#townHallLevelGGSSForm").validate();
      if($("#townHallLevelGGSSForm").valid()){
        var spreadsheetUrl = $("#townHallLevelGGSSUrl").val();
        var sectionName = "Town Hall Level";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  decorationsGGSSForm
    $("#decorationsGGSSForm").submit(function() {
      $("#decorationsGGSSForm").validate();
      if($("#decorationsGGSSForm").valid()){
        var spreadsheetUrl = $("#decorationsGGSSUrl").val();
        var sectionName = "Decorations";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

    //  spellsGGSSForm
    $("#spellsGGSSForm").submit(function() {
      $("#spellsGGSSForm").validate();
      if($("#spellsGGSSForm").valid()){
        var spreadsheetUrl = $("#spellsGGSSUrl").val();
        var sectionName = "Spell";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  spellLevelsGGSSForm
    $("#spellLevelsGGSSForm").submit(function() {
      $("#spellLevelsGGSSForm").validate();
      if($("#spellLevelsGGSSForm").valid()){
        var spreadsheetUrl = $("#spellLevelsGGSSUrl").val();
        var sectionName = "Spell Level";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

    //  obstaclesGGSSForm
    $("#obstaclesGGSSForm").submit(function() {
      $("#obstaclesGGSSForm").validate();
      if($("#obstaclesGGSSForm").valid()){
        var spreadsheetUrl = $("#obstaclesGGSSUrl").val();
        var sectionName = "Obstacles";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  trophyGGSSForm
    $("#trophyGGSSForm").submit(function() {
      $("#trophyGGSSForm").validate();
      if($("#trophyGGSSForm").valid()){
        var spreadsheetUrl = $("#trophyGGSSUrl").val();
        var sectionName = "Trophy";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

  //  achievementsGGSSForm
    $("#achievementsGGSSForm").submit(function() {
      $("#achievementsGGSSForm").validate();
      if($("#achievementsGGSSForm").valid()){
        var spreadsheetUrl = $("#achievementsGGSSUrl").val();
        var sectionName = "Achievement";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })
  }
});

function hideAllSections() {
  for(var i = 0; i <= sections.length - 1; i++) {
      $("#"+sections[i]).hide();
  }
}

function hideAllSectionsExceptCampaign() {
  for(var i = 0; i <= sections.length - 1; i++) {
    if(sections[i] != "campaignWrap")
      $("#"+sections[i]).hide();
  }
}


function getSectionFromDB(sectionName) {
  hideAllSections();
  var gameVersion = getCookie("gameVersion");
  var dataObj = {};
  dataObj["gameVersion"] = gameVersion;
  var table;
  var ajaxUrl;
  var thisSectionWrap;
  switch(sectionName) {
    case "campaign":
      table = campaignDBTbl;
      ajaxUrl = 'campaignreference';
      thisSectionWrap = $("#campaignWrap");
      break;
    case "combatUnits":
      table = combatUnitsDBTbl;
      ajaxUrl = 'combatunits';
      thisSectionWrap = $("#combatUnitsWrap");
      break;
    case "unitLevels":
      table = unitLevelsDBTbl;
      ajaxUrl = 'unitlevels';
      thisSectionWrap = $("#unitLevelsWrap");
      break;
    case "defensiveBuildings":
      table = defensiveBuildingsDBTbl;
      ajaxUrl = 'defensivebuildings';
      thisSectionWrap = $("#defensiveBuildingsWrap");
      break;
    case "defensiveBuildingLevel":
      table = defensiveBuildingLevelDBTbl;
      ajaxUrl = "defensivebuildinglevel";
      thisSectionWrap = $("#defensiveBuildingLevelWrap");
      break;
    case "resourceBuildings":
      table = resourceBuildingsDBTbl;
      ajaxUrl = "resourcebuildings";
      thisSectionWrap = $("#resourceBuildingsWrap");
      break;
    case "armyBuildings":
      table = armyBuildingsDBTbl;
      ajaxUrl = "armybuildings";
      thisSectionWrap = $("#armyBuildingsWrap");
      break;
    case "otherBuildings":
      table = otherBuildingsDBTbl;
      ajaxUrl = "otherbuildings";
      thisSectionWrap = $("#otherBuildingsWrap");
      break;
    case "townHallLevel":
      table = townHallLevelDBTbl;
      ajaxUrl = "townhalllevel";
      thisSectionWrap = $("#townHallLevelWrap");
      break;
    case "decorations":
      table = decorationsDBTbl;
      ajaxUrl = "decorations";
      thisSectionWrap = $("#decorationsWrap");
      break;
    case "spells":
      table = spellsDBTbl;
      ajaxUrl = "spells";
      thisSectionWrap = $("#spellsWrap");
      break;
    case "spellLevels":
      table = spellLevelsDBTbl;
      ajaxUrl = "spelllevels";
      thisSectionWrap = $("#spellLevelsWrap");
      break;
    case "obstacles":
      table = obstaclesDBTbl;
      ajaxUrl = "obstacles";
      thisSectionWrap = $("#obstaclesWrap");
      break;
    case "trophy":
      table = trophyDBTbl;
      ajaxUrl = "trophy";
      thisSectionWrap = $("#trophyWrap");
      break;
    case "achievements":
      table = achievementsDBTbl;
      ajaxUrl = "achievements";
      thisSectionWrap = $("#achievementsWrap");
      break;
  }
  $.ajax({
    url: ajaxUrl,
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    addDataToDBTable(table, resData);
    thisSectionWrap.show();
  }).
  fail(function (xhr, error, status) {
     showLoadingBar(100);
     toastr.error(status, "Error", opts);
   })
}

/* add Data to DB table  */
function addDataToDBTable(table, resData) {
  var dataArr = resData.split("\n");
  var tableData = [];
  for(var i = 1; i <= dataArr.length -1; i++){        //i = 0 -> headertext
    var tdDataArr = dataArr[i].split("\t");
    if(tdDataArr.length > 1){                         // prevent null array ([""])
      tableData.push(tdDataArr);
    }
  }
  table.fnClearTable();
  table.fnAddData(tableData);
}




