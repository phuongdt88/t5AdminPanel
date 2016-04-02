jQuery(document).ready(function($)
{
  $("#resultWrap").hide();
  if(gameVersionSelected()) {

    /* init dataTable */
    profanityTextDBTbl = $("#profanityTextDBTbl").dataTable({
     "bSort" : false,
      "aLengthMenu": [
        [25, 50, 100, -1], [25, 50, 100, "All"]
      ]
    })

    profanityTextGGSSTbl = $("#profanityTextGGSSTbl").dataTable({
       "bSort" : false,
        "aLengthMenu": [
          [25, 50, 100, -1], [25, 50, 100, "All"]
        ]
      })

    $("#showProfanityTextBtn").click(function(){
      var englishProfanityText;
      var arabProfanityText;
      var gameVersion = getCookie("gameVersion");
      var dataObj = {};
      dataObj["gameVersion"] = gameVersion;
      $.ajax({
        method: 'POST',
        url: 'getprofanitytext',
        data: dataObj,
        beforeSend: function() {
          showLoadingBar(65);
          $("#loadingSttLbl").html("Please wait....")
        }
      }).
      done(function(resData){
        showLoadingBar(100);
        $("#loadingSttLbl").html("");
        englishProfanityText = JSON.parse(resData).englishProfanityText;
        arabProfanityText = JSON.parse(resData).arabProfanityText;
        var eArr = englishProfanityText.split("\n");
        var aArr = arabProfanityText.split("\n");
        console.log(aArr);
        console.log(eArr);
        var aVal;
        var eVal;

        var tableData = [];
        if(eArr.length >= aArr.length){
          for(var i = 0; i <= (eArr.length - 1); i++){
            var rowData = [];
            aVal = (aArr[i] != undefined)  ? aArr[i] : "";
            eVal = eArr[i];
            rowData.push(eVal);
            rowData.push(aVal);
            tableData.push(rowData)
          }
         profanityTextDBTbl.fnClearTable();
         profanityTextDBTbl.fnAddData(tableData);
        } else {
          for(var i = 0; i <= (aArr.length - 1); i++){
            var rowData = [];
            eVal = (eArr[i] != undefined)  ? eArr[i] : "";
            aVal = aArr[i];
            rowData.push(eVal);
            rowData.push(aVal);
            tableData.push(rowData)
          }
          profanityTextDBTbl.fnClearTable();
          profanityTextDBTbl.fnAddData(tableData);
        }
      }).
      fail(function (xhr, error, status) {
        showLoadingBar(100);
        toastr.error(status, "Error", opts);
      })
    })

  //  profanityGGSSForm
    $("#profanityGGSSForm").submit(function() {
      $("#profanityGGSSForm").validate();
      if($("#profanityGGSSForm").valid()) {
        var spreadsheetUrl = $("#profanityGGSSUrl").val();
        var sectionName = "Profanity text";
        getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    });

    $("#profanityExportGGSSBtn").click(function(e) {
      var tableData = getDataFromGGSSTbl(profanityTextDBTbl);
      var exportType = 0;
      profanityExport(tableData, exportType)
    });

    $("#profanityExportCSVBtn").click(function(e) {
      var tableData = getDataFromGGSSTbl(profanityTextDBTbl);
      var exportType = 1;
      profanityExport(tableData, exportType)
    });
   }
});


function profanityExport(tableData, exportType) {
  var dataObj = {};
  dataObj['tableData'] = tableData;
  dataObj['exportType'] = exportType;
  $.ajax({
    url: "exportprofanity",
    method: "POST",
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    if(exportType == 0) {
     showGoogleSpreadsheetLink(resData);
    }
    else {
      var fileName = "Profanity Text_" + new Date().getTime();
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}
