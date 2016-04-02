jQuery(document).ready(function($) {
  $("#resultWrap").hide();
  $("#iapIOSBtn").click(function(e) {
    var startDate = $("#startDate").val();
    var endDate = $("#endDate").val();
    var exportType = $("#exportTypeSelect").val();
    var purchaseType = $("#purchaseTypeSelect").val();
    if(checkValidDate(startDate, endDate)){
      var platform = 'ios';
      iapPlatform(platform, startDate, endDate, purchaseType, exportType);
    }
  })

  $("#iapAndroidBtn").click(function(e) {
    var startDate = $("#startDate").val();
    var endDate = $("#endDate").val();
    var exportType = $("#exportTypeSelect").val();
    var purchaseType = $("#purchaseTypeSelect").val();
    if(checkValidDate(startDate, endDate)){
      var platform = 'android';
      iapPlatform(platform, startDate, endDate, purchaseType, exportType);
    }
  })
  $("#totalValidPurchaseBtn").click(function(e) {
    var startDate = $("#startDate").val();
    var endDate = $("#endDate").val();
    var exportType = $("#exportTypeSelect").val();
    if(checkValidDate(startDate, endDate)){
      iapValid(startDate, endDate, exportType);
    }
  })

  $("#uniquePayingUserBtn").click(function(e) {
     var startDate = $("#startDate").val();
     var endDate = $("#endDate").val();
     var exportType = $("#exportTypeSelect").val();
     if(checkValidDate(startDate, endDate)){
       getUniquePayingUsers(startDate, endDate, exportType);
     }
  })

  $("#newPayingUserBtn").click(function(e) {
    var startDate = $("#startDate").val();
    var endDate = $("#endDate").val();
    var exportType = $("#exportTypeSelect").val();
    if(checkValidDate(startDate, endDate)){
      getNewPayingUsers(startDate, endDate, exportType);
    }
  })

})

function iapPlatform(platform, startDate, endDate, purchaseType, exportType) {
  var ajaxUrl;
  var fileNamePrefix
  switch (platform) {
    case 'ios':
      ajaxUrl = 'iapios';
      fileNamePrefix = 'In-App_Purchase iOS_';
      break;
    case 'android':
      ajaxUrl = 'iapandroid';
      fileNamePrefix = 'In-App_Purchase Android_';
      break;
    default:
  }
  var dataObj = {};
  dataObj["startDate"] = startDate;
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;
  dataObj["purchaseType"] = purchaseType;

  /* iap  ajax */
  $.ajax({
    url: ajaxUrl,
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
      var fileName = fileNamePrefix + startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}


function iapValid(startDate, endDate, exportType) {
  var dataObj = {};
  dataObj["startDate"] = startDate;
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;

  /* iap ios ajax */
  $.ajax({
    url: 'iapvalid',
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
      var fileName = "In-App_Purchase Valid_"+startDate+"_"+endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getUniquePayingUsers(startDate, endDate, exportType) {
  var date = splitDate(startDate, endDate).toString();
  var dataObj = {};
  dataObj["date"] = date;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'uniquepayingusers',
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
      var fileName = "Unique Paying Users_"+startDate+"_"+endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

function getNewPayingUsers(startDate, endDate, exportType) {
  var date = splitDate(startDate, endDate).toString();
  var dataObj = {};
  dataObj["date"] = date;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'newpayingusers',
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
      var fileName = "New Paying Users_"+startDate+"_"+endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}

