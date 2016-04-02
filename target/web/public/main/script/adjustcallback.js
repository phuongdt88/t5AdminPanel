jQuery(document).ready(function($) {

  $("#resultWrap").hide();

  /* init datatable */
  adjustCallbackDataTbl = $("#adjustCallbackDataTbl").dataTable({
     "bSort" : false,
     "aLengthMenu": [
      [25, 50, 100, -1], [25, 50, 100, "All"]
    ],
      "sScrollX":'200%'
  });

  /* ajax to server to get data */
  $.ajax({
    url: "getalladjustcallbackdata",
    method: "POST",
    beforeSend: function() {
       showLoadingBar(70);
       adjustCallbackDataTbl.fnClearTable();
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    var acDataArr = JSON.parse(resData).acData;
    adjustCallbackDataTbl.fnAddData(acDataArr);
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })

  $("#exportBtn").click(function (e) {
    var startDate = $("#startDate").val();
    var endDate = $("#endDate").val();
    var exportType = $("#exportTypeSelect").val();
    if(checkValidDate(startDate, endDate)) {
      getAdjustCallbackData(startDate, endDate, exportType);
    }
  })
})

/* get data by date, time to export */
function getAdjustCallbackData(startDate, endDate, exportType) {
  var dataObj = {};
  dataObj["startDate"] = startDate;
  dataObj["endDate"] = endDate;
  dataObj["exportType"] = exportType;
  $.ajax({
    url: 'getadjustcallbackdata',
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
      var fileName = "Adjust Callback Data_"+ startDate + "_" + endDate;
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(xhr, "Error", opts);
  })
}