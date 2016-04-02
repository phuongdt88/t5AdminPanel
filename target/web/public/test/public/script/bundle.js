jQuery(document).ready(function($) {
  if(gameVersionSelected()){
    getBundle();
    bundleDBTbl = $("#bundleDBTbl").dataTable({
       "bSort" : false,
       "aLengthMenu": [
        [25, 50, 100, -1], [25, 50, 100, "All"]
      ]
    });
  }
})

function getBundle() {
  var gameVersion = getCookie("gameVersion");
  var dataObj = {};
  dataObj["gameVersion"] = gameVersion;
  $.ajax({
    url: "getbundle",
    method: "POST",
    data: dataObj,
    beforeSend: function() {
      showLoadingBar(70);
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    addDataToBundleTable(resData);
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}

function addDataToBundleTable(resData) {
  var dataArr = resData.split("\n");
  var tableData = [];
  for(var i = 0; i <= dataArr.length - 1; i++) {
    var tdData = dataArr[i].split("=");
    if(tdData.length > 1) {
      tableData.push(tdData);
    }
  }
  bundleDBTbl.fnClearTable();
  bundleDBTbl.fnAddData(tableData);

  editBundleTableContent();
  $("#saveBundleBtn").click(function(e) {
    saveBundleTableContent();
  })
}

function editBundleTableContent() {
  var table = bundleDBTbl;
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

function saveBundleTableContent() {
  var table = bundleDBTbl;

  /* get section to send to sever */
  var section;


  /* get table data */
  var dataStr = "";
  var entriesNum = table.fnGetData().length;
  var colNum = table.fnSettings().aoColumns.length;
  var tableData = table.fnGetData();
  for(i = 0; i < entriesNum; i++) {
    var rowData = "";
    for(j = 0; j < colNum; j++) {
      if(j < colNum - 1){
        rowData += table.fnGetData()[i][j] + "=";
      } else {
        rowData += table.fnGetData()[i][j];
      }
    }
    dataStr += rowData + "\\n";
  }

  /* send data to server */
  var dataObj = {};
  dataObj["dataStr"] = dataStr;

  $.ajax({
    url: 'savebundledata',
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