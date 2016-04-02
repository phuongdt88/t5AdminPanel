jQuery(document).ready(function($) {

  $("#resultWrap").hide();
  $("#dauBtn").click(function(e) {
     var startDate = $("#auStartDate").val();
     var endDate = $("#auEndDate").val();
     if(checkValidDate(startDate, endDate)){
       getDAU(startDate, endDate);
     }
  })

  $("#mauBtn").click(function(e) {
    var startDate = $("#auStartDate").val();
    var endDate = $("#auEndDate").val();
    if(checkValidDate(startDate, endDate)){
      getMAU(startDate, endDate);
    }

  })
  $("#newPlayingUserBtn").click(function(e) {
      var startDate = $("#auStartDate").val();
      var endDate = $("#auEndDate").val();
      if(checkValidDate(startDate, endDate)){
        getNewPlayingUsers(startDate, endDate);
      }
  })

  $("#ccuBtn").click(function(e) {
     var startDate = $("#ccuStartDate").val();
     var endDate = $("#ccuEndDate").val();
      var exportType = $("#ccuExportTypeSelect").val();
     if(checkValidDate(startDate, endDate)){
      getCCU(startDate, endDate, exportType);
     }
  })

  $("#globalChatBtn").click(function(e) {
     var startDate = $("#chatStartDate").val();
     var endDate = $("#chatEndDate").val();
     var exportType = $("#chatExportTypeSelect").val();
     if(checkValidDate(startDate, endDate)){
      getGlobalChat(startDate, endDate, exportType);
     }
  })

  $("#tribeChatBtn").click(function(e) {
       var startDate = $("#chatStartDate").val();
       var endDate = $("#chatEndDate").val();
       var exportType = $("#chatExportTypeSelect").val();
       if(checkValidDate(startDate, endDate)){
       getTribeChat(startDate, endDate, exportType);
     }
  })

  $("#inoutBtn").click(function(e) {
      var startDate = $("#inoutStartDate").val();
      var endDate = $("#inoutEndDate").val();
      var exportType = $("#inoutExportTypeSelect").val();
      if(checkValidDate(startDate, endDate)){
      getLoginLogoutTime(startDate, endDate, exportType);
    }
  })

  $("#uniqueUsersBtn").click(function(e) {
     var endDate = $("#uniqueUsersEndDate").val();
     var exportType = $("#uniqueUsersExportTypeSelect").val();
     if(endDate == "") {
       toastr.error("Please input End Date", "Invalid date", opts);
       return false;
     }
     getUniqueUserNumber(endDate, exportType);
  })

})

function getDAU(startDate, endDate) {
  var date = splitDate(startDate, endDate).toString();
  var exportType = $("#exportTypeSelect").val();
  var platform = $("#platformSelect").val();
  var platformTxt = $("#platformSelect option:selected").text();
  var dataObj = {};
  dataObj["date"] = date;
  dataObj["exportType"] = exportType;
  dataObj["platform"] = platform;
  $.ajax({
    url: 'dau',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
      showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Daily Active Users_" + platformTxt + "_" + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getMAU(startDate, endDate) {
  var month = splitMonth(startDate, endDate).toString();
  var exportType = $("#exportTypeSelect").val();
  var platform = $("#platformSelect").val();
  var platformTxt = $("#platformSelect option:selected").text();
  var dataObj = {};
  dataObj["month"] = month;
  dataObj["exportType"] = exportType;
  dataObj["platform"] = platform;
  $.ajax({
    url: 'mau',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Monthly Active Users_" + platformTxt + "_" + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getNewPlayingUsers(startDate, endDate) {
  var month = splitMonth(startDate, endDate).toString();
  var exportType = $("#exportTypeSelect").val();
  var platform = $("#platformSelect").val();
  var platformTxt = $("#platformSelect option:selected").text();
  var dataObj = {};
  dataObj["month"] = month;
  dataObj["exportType"] = exportType;
  dataObj["platform"] = platform;
  $.ajax({
    url: 'newplayingusers',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "New Playing Users_" + platformTxt + "_" + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getCCU(startDate, endDate, exportType) {
  var dataObj = {};
  dataObj["startDate"] = startDate;
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'getccu',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Concurrent Users_" + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getGlobalChat(startDate, endDate, exportType) {
  var dataObj = {};
  dataObj["startDate"] = startDate;
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'globalchat',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Global Chat_" + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getTribeChat(startDate, endDate, exportType) {
  var dataObj = {};
  dataObj["startDate"] = startDate;
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'tribechat',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Tribe Chat_" + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getLoginLogoutTime(startDate, endDate, exportType) {
  var dataObj = {};
  dataObj["startDate"] = startDate;
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'loginlogout',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Login - Logout Time_" + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getUniqueUserNumber(endDate, exportType) {
  var dataObj = {};
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'uniqueusersnumber',
    method: 'POST',
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
      $("#resultWrap").hide();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Number of Unique Users_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}



