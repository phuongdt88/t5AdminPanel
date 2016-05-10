var opts = {
  "closeButton": true,
  "debug": false,
  "positionClass": "toast-top-full-width",
  "onclick": null,
  "showDuration": "300",
  "hideDuration": "1000",
  "timeOut": "5000",
  "extendedTimeOut": "1000",
  "showEasing": "swing",
  "hideEasing": "linear",
  "showMethod": "fadeIn",
  "hideMethod": "fadeOut"
};
var campaignGGSSTbl;
var combatUnitsGGSSTbl;
var unitLevelsGGSSTbl;
var defensiveBuildingsGGSSTbl;
var defensiveBuildingLevelGGSSTbl;
var resourceBuildingsGGSSTbl;
var armyBuildingsGGSSTbl;
var otherBuildingsGGSSTbl;
var townHallLevelGGSSTbl;
var decorationsGGSSTbl;
var spellsGGSSTbl;
var spellLevelsGGSSTbl;
var obstaclesGGSSTbl;
var trophyGGSSTbl;
var achievementsGGSSTbl;
var textStringGGSSTbl;
var profanityTextGGSSTbl;

function getCookie(cname) {
  var name = cname + "=";
  var ca = document.cookie.split(';');
  for (var i = 0; i < ca.length; i++) {
    var c = ca[i].trim();
    if (c.indexOf(name) == 0) return c.substring(name.length, c.length);
  }
  return "";
}

function setCookie(cname, cvalue) {
  document.cookie = cname + "=" + escape(cvalue);
}

function clearCookie(cname) {
  document.cookie = cname + "=" + "";
}

// function getSpreadsheetData(sectionName, spreadsheetUrl) {
//   var table;
//   var ggssSection;
//   switch(sectionName) {
//     case "Campaign":
//       table = campaignGGSSTbl;
//       ggssSection = "#campaignGGSS";
//       break;
//     case "Combat Units":
//       table = combatUnitsGGSSTbl;
//       ggssSection = "#combatUnitsGGSS";
//       break;
//     case "Unit levels":
//       table = unitLevelsGGSSTbl;
//       ggssSection = "#unitLevelsGGSS";
//       break;
//     case "Defensive Buildings":
//       table = defensiveBuildingsGGSSTbl;
//       ggssSection = "#defensiveBuildingsGGSS";
//       break;
//     case "Defensive Buildings Level":
//       table = defensiveBuildingLevelGGSSTbl;
//       ggssSection = "#defensiveBuildingLevelGGSS";
//       break;
//     case "Resource Building variables":
//       table = resourceBuildingsGGSSTbl;
//       ggssSection = "#resourceBuildingsGGSS";
//       break;
//     case "Army Building":
//       table = armyBuildingsGGSSTbl;
//       ggssSection = "#armyBuildingsGGSS";
//       break;
//     case "Other Buildings":
//       table = otherBuildingsGGSSTbl;
//       ggssSection = "#otherBuildingsGGSS";
//       break;
//     case "Town Hall Level":
//       table = townHallLevelGGSSTbl;
//       ggssSection = "#townHallLevelGGSS";
//       break;
//     case "Decorations":
//       table = decorationsGGSSTbl;
//       ggssSection = "#decorationsGGSS";
//       break;
//     case "Spell":
//       table = spellsGGSSTbl;
//       ggssSection = "#spellsGGSS";
//       break;
//     case "Spell Level":
//       table = spellLevelsGGSSTbl;
//       ggssSection = "#spellLevelsGGSS";
//       break;
//     case "Obstacles":
//       table = obstaclesGGSSTbl;
//       ggssSection = "#obstaclesGGSS";
//       break;
//     case "Trophy":
//       table = trophyGGSSTbl;
//       ggssSection = "#trophyGGSS";
//       break;
//     case "Achievement":
//       table = achievementsGGSSTbl;
//       ggssSection = "#achievementsGGSS";
//       break;
//     case "Text Strings (SGS)":
//       table = textStringGGSSTbl;
//       ggssSection = "#textStringGGSS";
//       break;
//     case "Profanity text":
//       table = profanityTextGGSSTbl;
//       ggssSection = "#profanityGGSS";
//       break;
//   }
//   var dataObj = {};
//   dataObj["spreadsheetUrl"] = spreadsheetUrl;
//   dataObj["sectionName"] = sectionName;
//   $.ajax({
//     url: 'viewspreadsheetdata',
//     method: 'POST',
//     data: dataObj,
//     beforeSend: function() {
//       showLoadingBar(70);
//     }
//   }).
//   done(function(resData){
//     showLoadingBar(100);
//     addDataToGGSSTable(table, resData);
//     $(document).scrollTop( $(ggssSection).offset().top );
//   }).
//   fail(function(xhr, status, error){
//     toastr.error(status, "Error", opts);
//     showLoadingBar(100);
//   })
// }

// function addDataToGGSSTable(table, resData) {
//   var dataArr = resData.split("\n");
//   var tableData = [];
//   for(var i = 0; i <= dataArr.length -1; i++){
//     var tdDataArr = dataArr[i].split("\t");
//     if(tdDataArr.length > 1){                         // prevent null array ([""])
//       tableData.push(tdDataArr);
//     }
//   }
//   table.fnClearTable();
//   table.fnAddData(tableData);
//   console.log(table.fnSettings().aoColumns.length);
//   $(".publishBtn").unbind('click');
//   $(".publishBtn").click(function(event) {
//      var table = getTableFromPublishBtn(this.id);
//      var tableData = getDataFromGGSSTbl(table);
//      publishGGSSToServer(table, tableData);
//   })
// }

function getTableFromPublishBtn(buttonId) {
  console.log(buttonId);
  if(buttonId != null && buttonId != undefined) {
    var table;
    switch(buttonId){
      case "campaignGGSSPublishBtn":
        table = campaignGGSSTbl;
        break;
       case "unitLevelsGGSSPublishBtn":
        table = unitLevelsGGSSTbl;
        break;
       case "combatUnitsGGSSPublishBtn":
        table = combatUnitsGGSSTbl;
        break;
       case "defensiveBuildingsGGSSPublishBtn":
        table = defensiveBuildingsGGSSTbl;
        break;
       case "defensiveBuildingLevelGGSSPublishBtn":
        table = defensiveBuildingLevelGGSSTbl;
        break;
       case "resourceBuildingsGGSSPublishBtn":
        table = resourceBuildingsGGSSTbl;
        break;
       case "armyBuildingsGGSSPublishBtn":
        table = armyBuildingsGGSSTbl;
        break;
       case "otherBuildingsGGSSPublishBtn":
        table = otherBuildingsGGSSTbl;
        break;
       case "townHallLevelGGSSPublishBtn":
        table = townHallLevelGGSSTbl;
        break;
       case "decorationsGGSSPublishBtn":
        table = decorationsGGSSTbl;
        break;
       case "spellsGGSSPublishBtn":
        table = spellsGGSSTbl;
        break;
       case "spellLevelsGGSSPublishBtn":
        table = spellLevelsGGSSTbl;
        break;
       case "obstaclesGGSSPublishBtn":
        table = obstaclesGGSSTbl;
        break;
       case "trophyGGSSPublishBtn":
        table = trophyGGSSTbl;
        break;
       case "achievementsGGSSPublishBtn":
        table = achievementsGGSSTbl;
        break;
       case "profanityGGSSPublishBtn":
        table = profanityTextGGSSTbl;
        break;
       case "textStringGGSSPublishBtn":
        table = textStringGGSSTbl;
        break;
       default:
    }
    return table;
  }
  return null;
}


function getDataFromGGSSTbl(table) {
  var entriesNum = table.fnGetData().length;
  var colNum = table.fnSettings().aoColumns.length;
  var tableData = "";
  for(i = 0; i < entriesNum; i++){
     var rowData = "";
    for(j = 0; j < colNum; j++){

      if(j < colNum - 1){
        rowData += table.fnGetData()[i][j] + "\\t";
      } else {
        rowData += table.fnGetData()[i][j];
      }
    }
    tableData += rowData + "\\n";
  }
  return tableData;
}

function publishGGSSToServer(table, tableData){
  var dataObj = {};
  var section;
  switch(table){
    case campaignGGSSTbl:
      section = "campaign"
      break;
     case unitLevelsGGSSTbl:
      section = "unit levels"
      break;
     case combatUnitsGGSSTbl:
      section = "combat units"
      break;
     case defensiveBuildingsGGSSTbl:
      section = "defensive buildings"
      break;
     case defensiveBuildingLevelGGSSTbl:
      section = "defensive building level"
      break;
     case resourceBuildingsGGSSTbl:
      section = "resource buildings"
      break;
     case armyBuildingsGGSSTbl:
      section = "army buildings"
      break;
     case otherBuildingsGGSSTbl:
      section = "other buildings"
      break;
     case townHallLevelGGSSTbl:
      section = "town hall level"
      break;
     case decorationsGGSSTbl:
      section = "decorations"
      break;
     case spellsGGSSTbl:
      section = "spells"
      break;
     case spellLevelsGGSSTbl:
      section = "spell levels"
      break;
     case obstaclesGGSSTbl:
      section = "obstacles"
      break;
     case trophyGGSSTbl:
      section = "trophy"
      break;
     case achievementsGGSSTbl:
      section = "achievements"
      break;
     case profanityTextGGSSTbl:
      section = "profanity"
      break;
     case textStringGGSSTbl:
      section = "text string"
      break;
     default:
      break;
  }
  dataObj["section"] = section;
  dataObj["tableData"] = tableData;
  $.ajax({
    url: 'publishspeadsheet',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    toastr.success("Updated", "Published Successfully", opts);
    console.log(resData);
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}

function gameVersionSelected() {
/* check cookie 'gameVersion' exists? */
  var gameVersion = getCookie("gameVersion");
  if(gameVersion == "") {
    setCookie("lastState", window.location.hash);
    window.location.hash= "#/app/gameversion";
    return false;
  }
  else {
    /* get current game version */
    if($("#currentGameVersion")[0] != undefined) {
      $("#currentGameVersion")[0].innerHTML = getCookie("gameVersion");
    }
    if($("#gameVersionLink")[0] !=undefined) {
      $("#gameVersionLink").click(function(e) {
        setCookie("lastState", window.location.hash);
      })
    }
    return true;
  }
}

/* Save File */
function saveFile(resData, fileName) {
  csvData = new Blob([resData], { type: 'text/csv' }); //new way
  console.log(csvData);
  var uri = URL.createObjectURL(csvData);
  console.log("begin save file");
  var downloadLink = document.createElement("a");
   downloadLink.href = uri;
   downloadLink.download = fileName;
   document.body.appendChild(downloadLink);
   downloadLink.click();
   document.body.removeChild(downloadLink);
}

function blobToFile(theBlob, fileName){
    //A Blob() is almost a File() - it's just missing the two properties below which we will add
    theBlob.lastModifiedDate = new Date();
    theBlob.name = fileName;
    return theBlob;
}

/*
 * split date range to day by day
 */
function splitDate(startDate, endDate) {
   var startDateTimeStamp  = new Date(startDate).getTime();
   var endDateTimeStamp = new Date(endDate).getTime();
   var a = Math.ceil(endDateTimeStamp - startDateTimeStamp);
   var dateArr = [];

   for(var i = 0; i <= a; i = i + 86400000) {
    var date = new Date(startDateTimeStamp + i);
    dateArr.push(formatDate(date));
   }
   return dateArr;
}

/*
 *format date string to yyyy-mm-dd
 */
function formatDate(date) {
  var year = new Date(date).getFullYear();
  var month = (new Date(date).getMonth() + 1) < 10 ? "0" + (new Date(date).getMonth() + 1) : (new Date(date).getMonth() + 1);
  var day = (new Date(date).getDate()) < 10 ? "0" + (new Date(date).getDate()) : (new Date(date).getDate()) ;
  return year + "-" + month + "-" + day;
}

function splitMonth(startDate, endDate) {
  var month = [ "01", "02", "03", "04", "05", "06",
          "07", "08", "09", "10", "11", "12" ];
  var arr = [];
  var datFrom = new Date(startDate);
  var datTo = new Date(endDate);
  var fromYear =  datFrom.getFullYear();
  var toYear =  datTo.getFullYear();
  var diffYear = (12 * (toYear - fromYear)) + datTo.getMonth();

  for (var i = datFrom.getMonth(); i <= diffYear; i++) {
      arr.push(Math.floor(fromYear+(i/12)) + "-" + month[i%12]);
  }
  return arr;
}

function showGoogleSpreadsheetLink(spreadsheetId) {
  var url = "https://docs.google.com/spreadsheets/d/"+spreadsheetId;
  var htmlStr = "Google Spreadsheet URL: <a href='"+url+"' target = '_blank'>"+url+"</a>";
  $("#resultURL").html(htmlStr);
  $("#resultWrap").show();
  $(document).scrollTop( $(resultWrap).offset().top );
}

function checkValidDate(startDate, endDate) {
  var startDateTimeStamp = new Date(startDate);
  var endDateTimeStamp = new Date(endDate);
  if(endDateTimeStamp < startDateTimeStamp) {
    toastr.error("End Date should be greater or equal Start Date", "Invalid Date", opts);
    return false;
  }
  if(startDate == "" || endDate == "") {
    toastr.error("Please input Start Date and End Date", "Invalid date", opts);
    return false;
  }
  return true;
}

function getRoleName(roleIndex) {
  switch (roleIndex) {
    case 0:
      return "Admin";
      break;
    case 1:
      return "Product Manager";
      break;
    case 2:
      return "Community Manager";
      break;
    case 3:
      return "QA";
      break;
    case 4:
      return "Engineer";
      break;
  }
}


function getTimeZoneString(timezone) {
  if (timezone < 0) {
    return "GMT" + timezone;
  } else {
    return "GMT+" + timezone
  }
}
