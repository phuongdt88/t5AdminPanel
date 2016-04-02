jQuery(document).ready(function($)
{
  $("#resultWrap").hide();
  if(gameVersionSelected()) {

    /* init dataTable */
    textStringDBTbl = $("#textStringDBTbl").dataTable({
     "bSort" : false,
      "aLengthMenu": [
        [25, 50, 100, -1], [25, 50, 100, "All"]
      ]
    })

    textStringGGSSTbl = $("#textStringGGSSTbl").dataTable({
     "bSort" : false,
      "aLengthMenu": [
        [25, 50, 100, -1], [25, 50, 100, "All"]
      ]
    })

    $("#showTextStringBtn").click(function(){
      var englishTextStr;
      var arabTextStr;
      var gameVersion = getCookie("gameVersion");
      var dataObj = {};
      dataObj["gameVersion"] = gameVersion;
      $.ajax({
        method: 'POST',
        url: 'getTextString',
        data: dataObj,
        beforeSend: function() {
          showLoadingBar(65);
          $("#loadingSttLbl").html("Please wait....")
        }
      }).
      done(function(resData){
        showLoadingBar(100);
        $("#loadingSttLbl").html("")
        englishTextStr = JSON.parse(resData).englishTextStr;
        arabTextStr = JSON.parse(resData).arabTextStr;
        var eArr = englishTextStr.split("\n");
        var aArr = arabTextStr.split("\n");
        var eKey;
        var eVal;
        var aKey;
        var aVal;
        var tableData = [];
        for(var i = 0; i <= (eArr.length - 1); i++)
        {
          var rowData = [];
          eKey = eArr[i].split("=")[0];
          eVal = eArr[i].split("=")[1];
          aKey = aArr[i].split("=")[0];
          aVal = aArr[i].split("=")[1];
          if(eKey != ""){
            if(eKey == aKey){
              rowData.push(eKey);
              rowData.push(aVal);
              rowData.push(eVal);
              tableData.push(rowData);
              textStringDBTbl.fnClearTable();
              textStringDBTbl.fnAddData(tableData);
            } else {
              console.log("code reference not match: english Key:" + eKey +", arab Key:"+aKey + "i:"+i);
              alert("code reference not match: english Key:" + eKey +", arab Key:"+aKey);
            }
          }
        }
      }).
      fail(function (xhr, error, status) {
        showLoadingBar(100);
        toastr.error(status, "Error", opts);
      })
    })

  //  textStringGGSSForm
    $("#textStringGGSSForm").submit(function() {
      $("#textStringGGSSForm").validate();
      if($("#textStringGGSSForm").valid()){
        var spreadsheetUrl = $("#textStringGGSSUrl").val();
        var sectionName = "Text Strings (SGS)"
          getSpreadsheetData(sectionName, spreadsheetUrl);
      }
    })

    $("#textStringExportGGSSBtn").click(function(e) {
      var tableData = getDataFromGGSSTbl(textStringDBTbl);
      var exportType = 0;
      textStringExport(tableData, exportType)
    });

    $("#textStringExportCSVBtn").click(function(e) {
      var tableData = getDataFromGGSSTbl(textStringDBTbl);
      var exportType = 1;
      textStringExport(tableData, exportType)
    });
  }
});

function textStringExport(tableData, exportType) {
  var dataObj = {};
  dataObj['tableData'] = tableData;
  dataObj['exportType'] = exportType;
  $.ajax({
    url: "exporttextstring",
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
      var fileName = "Text String_" + new Date().getTime();
      saveFile(resData, fileName);
    }
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}
