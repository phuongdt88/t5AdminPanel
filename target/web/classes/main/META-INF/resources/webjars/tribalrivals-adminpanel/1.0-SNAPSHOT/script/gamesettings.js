var sections = ["settingsInfoWrap",
                "versionLoadBalancersWrap",
                "versionSmartfoxWrap",
                "tournamentDurationWrap",
                "daggerSearchRangesWrap",
                "matchLimitWrap",
                "purchasesWrap",
                "otherActionsWrap"]


jQuery(document).ready(function($)
{
  if(gameVersionSelected()) {

    /* init dataTables */
    settingsInfoDBTbl = $("#settingsInfoDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "bInfo": false,
    });

    vlbDBTbl = $("#vlbDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "bInfo": false,
    });

    tournamentDurationDBTbl = $("#tournamentDurationDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "bInfo": false,
    });

    daggerSearchRangesDBTbl = $("#daggerSearchRangesDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "bInfo": false,
    });

    matchLimitDBTbl = $("#matchLimitDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "bInfo": false,
    });

    purchasesDBTbl = $("#purchasesDBTbl").dataTable({
         "bSort" : false,
         "bPaginate": false,
         "bInfo": false,
    });

    /* get page content */
    getSettings();
    showSection("settingsInfoWrap");

    /* top nav bar click function */
    $("ul.navbar-nav").find("li").on('click', function() {
      $("ul.navbar-nav").find(".active")[0].className = "";
      $(this)[0].className = "active";
    })

  //    click on settings Info link
    $("#settingsInfoLink").click(function(e) {
      showSection("settingsInfoWrap");
    })

  //    click on Version Load Balancers link
    $("#versionLoadBalancersLink").click(function(e) {
      showSection("versionLoadBalancersWrap");
    })

  //    click on version Smartfox link
    $("#versionSmartfoxLink").click(function(e) {
      showSection("versionSmartfoxWrap");
    })

  //    click on tournament duration link link
    $("#tournamentDurationLink").click(function(e) {
      showSection("tournamentDurationWrap");
    })

  //    click on dagger search ranges link
    $("#daggerSearchRangesLink").click(function(e) {
      showSection("daggerSearchRangesWrap");
    })

  //    click on match limit link
    $("#matchLimitLink").click(function(e) {
      showSection("matchLimitWrap");
    })

  //    click on purchases link
    $("#purchasesLink").click(function(e) {
      showSection("purchasesWrap");
    })

  //    click on other actions link
    $("#otherActionsLink").click(function(e) {
      showSection("otherActionsWrap");
    })


  //  add version SFS
    $("#addVersionSFSForm").submit(function() {
      $("#addVersionSFSForm").validate();
      var addVersionSFSForm = $("#addVersionSFSForm").valid();
      if(addVersionSFSForm) {
        var dataObj = {};
        var fromVersionSFS = $("#fromVersionSFS").val();
        var toVersionSFS = $("#toVersionSFS").val();
        var updateType = $("#updateType").val();
        var description = $("#description").val();
        var iosNewVersionUrl = $("#iosNewVersionUrl").val();
        var androidNewVersionUrl = $("#androidNewVersionUrl").val();
        dataObj["fromVersionSFS"] = fromVersionSFS;
        dataObj["toVersionSFS"] = toVersionSFS;
        dataObj["updateType"] = updateType;
        dataObj["description"] = description;
        dataObj["iosNewVersionUrl"] = iosNewVersionUrl;
        dataObj["androidNewVersionUrl"] = androidNewVersionUrl;
        $.ajax({
          url: 'addversionsfs',
          method: 'POST',
          data: dataObj,
          beforeSend: function() {
            showLoadingBar(70);
          }
        }).
        done(function(resData) {
          console.log(resData);
          showLoadingBar(100);
          $("#addVersionSFSForm")[0].reset();
          toastr.success("Add SFS Version successfully", "Added", opts);

        }).
        fail(function(xhr, error, status) {
          showLoadingBar(100);
          toastr.error(status, "Error", opts);
        })
      }
    });

    /* delete un-use version */
    $("#deleteUnuseVersionForm").submit(function() {
      $("#deleteUnuseVersionForm").validate();
      if($("#deleteUnuseVersionForm").valid()) {
       var unuseVersion = $("#unuseVersionVal").val();
       var dataObj = {};
       dataObj["unuseVersion"] = unuseVersion;
       $.ajax({
          url: 'deleteunuseversion',
          method: 'POST',
          data: dataObj,
          beforeSend: function() {
            showLoadingBar(70);
          }
       }).
       done(function(resData){
          showLoadingBar(100);
          console.log(resData);
          toastr.success("Deleted", "", opts);
       }).
       fail(function(xhr, status, error) {
          showLoadingBar(100);
          toastr.error(status, "Error", opts);
       })
      }
    })

    /* change game sub version */
    $("#changeGameSubVersionForm").submit(function() {
      $("#changeGameSubVersionForm").validate();
      if($("#changeGameSubVersionForm").valid()) {
       var gameSubVersion = $("#changeGameSubVersionVal").val();
       var dataObj = {};
       dataObj["gameSubVersion"] = gameSubVersion;
       $.ajax({
          url: 'changegamesubversion',
          method: 'POST',
          data: dataObj,
          beforeSend: function() {
            showLoadingBar(70);
          }
       }).
       done(function(resData){
          showLoadingBar(100);
          console.log(resData);
          toastr.success("Changed", "", opts);
       }).
       fail(function(xhr, status, error) {
          showLoadingBar(100);
          toastr.error(status, "Error", opts);
       })
      }
    })
  }
});

function hideAllSections() {
  for(var i = 0; i <= sections.length - 1; i++) {
      $("#"+sections[i]).hide();
  }
}

function showSection(sectionWrap) {
  for(var i = 0; i <= sections.length - 1; i++) {
    if(sections[i] != sectionWrap){
       $("#"+sections[i]).hide();
    } else {
      $("#"+sections[i]).show();
    }

  }
}

function getSettings() {
  var gameVersion = getCookie("gameVersion");
  var dataObj = {};
  dataObj["gameVersion"] = gameVersion;
  $.ajax({
    url: "settings",
    method: "POST",
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData){
    showLoadingBar(100);
    var settingsDataStr = resData.replace(/(?:\r\n|\r|\n)/g,"\\n").replace(/\t/g,"\\t");
//    var settingsData = JSON.parse(settingsDataStr);
//    var settingsInfo = settingsData.settingsInfo;
//    var vlb = settingsData.versionLoadbalancers;
//    var tournamentDuration = settingsData.tournamentDuration;
//    var daggerSearchRanges = settingsData.daggerSearchRanges;
//    var matchLimit = settingsData.matchLimit;
//    var purchases = settingsData.purchases;

    /* add data to settings info table */
    var settingsInfoArr = settingsDataStr.split("\\n");
    var settingsInfoTableData = [];
    for(var i = 1; i <= settingsInfoArr.length -1; i++) {      //i = 0 -> headertext
      var settingsInfoTdDataArr = settingsInfoArr[i].split("\\t");
      if(settingsInfoTdDataArr.length > 1){
         if(settingsInfoTdDataArr.length < 4) {
          var space = 4 - settingsInfoTdDataArr.length;
          for(j = 0; j < space; j++) {
            settingsInfoTdDataArr.push("");
          }
         }
      settingsInfoTableData.push(settingsInfoTdDataArr);
      }
    }
    settingsInfoDBTbl.fnClearTable();
    settingsInfoDBTbl.fnAddData(settingsInfoTableData);

    /* add data to version load balancers table */
//    var vlbTableData = [];
//    var vlbArr = vlb.split("\n");
//    for(var j = 0; j <= vlbArr.length - 1; j++) {
//      var vlbTdArr = vlbArr[j].split("=");
//      if(vlbTdArr.length > 1){
//        vlbTableData.push(vlbTdArr);
//      }
//    }
//    vlbDBTbl.fnClearTable();
//    vlbDBTbl.fnAddData(vlbTableData);
//
//    /* add data to tournament duration table */
//    var tournamentDurationTableData = [];
//    var tournamentDurationArr = tournamentDuration.split("\n");
//    for(var k = 0; k <= tournamentDurationArr.length - 1; k++) {
//      var tournamentDurationTdArr = tournamentDurationArr[k].split("=");
//      if(tournamentDurationTdArr.length > 1) {
//        tournamentDurationTableData.push(tournamentDurationTdArr);
//      }
//    }
//    tournamentDurationDBTbl.fnClearTable();
//    tournamentDurationDBTbl.fnAddData(tournamentDurationTableData);
//
//    /* add data to dagger search ranges table */
//    var daggerSearchRangesTableData = [];
//    var daggerSearchRangesArr = daggerSearchRanges.split("\n");
//    for(var l = 0; l <= daggerSearchRangesArr.length - 1; l++) {
//      var daggerSearchRangesTdArr = daggerSearchRangesArr[l].split("=");
//      if(daggerSearchRangesTdArr.length > 1) {
//        daggerSearchRangesTableData.push(daggerSearchRangesTdArr);
//      }
//    }
//    daggerSearchRangesDBTbl.fnClearTable();
//    daggerSearchRangesDBTbl.fnAddData(daggerSearchRangesTableData);
//
//    /* add data to match limit table */
//    var matchLimitTableData = [];
//    var matchLimitArr = matchLimit.split("\n");
//    for(var m = 0; m <= matchLimitArr.length - 1; m++) {
//      var matchLimitTdArr = matchLimitArr[m].split("=");
//      if(matchLimitTdArr.length > 1) {
//        matchLimitTableData.push(matchLimitTdArr);
//      }
//    }
//    matchLimitDBTbl.fnClearTable();
//    matchLimitDBTbl.fnAddData(matchLimitTableData);
//
//    /* add data to purchases table */
//    var purchasesTableData = [];
//    var purchasesArr = purchases.split("\n");
//    for(var n = 0; n <= purchasesArr.length - 1; n++) {
//      var purchasesTdArr = purchasesArr[n].split("=");
//      if(purchasesTdArr.length > 1) {
//        purchasesTableData.push(purchasesTdArr);
//      }
//    }
//    purchasesDBTbl.fnClearTable();
//    purchasesDBTbl.fnAddData(purchasesTableData);
//
//
//    /* edit and save table content */
    editTableContent(settingsInfoDBTbl);
//    editTableContent(vlbDBTbl);
//    editTableContent(tournamentDurationDBTbl);
//    editTableContent(daggerSearchRangesDBTbl);
//    editTableContent(matchLimitDBTbl);
//    editTableContent(purchasesDBTbl);

    /* save table content */
     $("#saveSettingsInfoBtn").on('click', function(e) {
      saveTableContent(settingsInfoDBTbl)
     });
     $("#saveVersionLoadBalancersBtn").on('click', function(e) {
      saveTableContent(vlbDBTbl)
     });
     $("#saveTournamentDurationBtn").on('click', function(e) {
      saveTableContent(tournamentDurationDBTbl)
     });
     $("#saveDaggerSearchRangesBtn").on('click', function(e) {
      saveTableContent(daggerSearchRangesDBTbl)
     });
     $("#saveMatchLimitBtn").on('click', function(e) {
      saveTableContent(matchLimitDBTbl)
     });
     $("#savePurchasesBtn").on('click', function(e) {
      saveTableContent(purchasesDBTbl)
     });
  }).
  fail(function(xhr, error, status) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}

function editTableContent(table) {
  table.find('tbody td').click( function(e) {
       $(this).tooltip({
        content: "Press Enter to apply"
      }).tooltip("open");
    })
    table.find('tbody td').editable(function(value, settings){
        var rowPos = table.fnGetPosition(this)[0];
        var colPos = table.fnGetPosition(this)[1];
        table.fnUpdate(value, rowPos, colPos);
        return value;
      },
      {
       type      : 'text',
       display   : 'inline',
       indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
       tooltip   : 'Click to edit...',
       onblur    : 'cancel',
        placeholder: ''
     });
}

/* get table data, convert it to string, and send it to server */

function saveTableContent(table) {

  /* get section to send to sever */
  var section;
  switch (table) {
    case settingsInfoDBTbl:
      section = "Settings Info";
      break;
    case vlbDBTbl:
      section = "Version Load Balancers";
      break;
    case tournamentDurationDBTbl:
      section = "Tournament Duration";
      break;
    case daggerSearchRangesDBTbl:
      section = "Dagger Search Ranges";
      break;
    case matchLimitDBTbl:
      section = "Match Limit";
      break;
    case purchasesDBTbl:
      section = "Purchases";
      break;
    default:
  }

  /* get table data */
  var dataStr = "";
  var entriesNum = table.fnGetData().length;
  var colNum = table.fnSettings().aoColumns.length;
  var tableData = table.fnGetData();
  for(i = 0; i < entriesNum; i++) {
    var rowData = "";
    for(j = 0; j < colNum; j++) {
      if(j < colNum - 1){
        rowData += table.fnGetData()[i][j] + "\\t";
      } else {
        rowData += table.fnGetData()[i][j];
      }
    }
    dataStr += rowData + "\\n";
  }

  /* send data to server */
  var dataObj = {};
  dataObj["dataStr"] = dataStr;
  dataObj["section"] = section;

  $.ajax({
    url: 'savesettingsdata',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    console.log(resData);
    toastr.success("Saved", "", opts);
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}
