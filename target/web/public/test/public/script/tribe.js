jQuery(document).ready(function($)
{
  tribeListTbl = $("#tribeListTbl").DataTable({
   "bSort" : false,
    "aLengthMenu": [
      [25, 50, 100, -1], [25, 50, 100, "All"]
    ],
  });

  tribeDetailsTbl = $("#tribeDetailsTbl").DataTable({
   "bSort" : false,
    "aLengthMenu": [
       [25, -1], [25, "All"]
    ]
  });

  $("#tribeList").hide();
  $("#tribeDetails").hide();


  $("#searchTribeByIdForm").submit(function(){
    $("#searchTribeByIdForm").validate();
    var searchTribeByIdFormIsValid = $("#searchTribeByIdForm").valid();
    if(searchTribeByIdFormIsValid){
      searchTribeById($("#searchTribeByIdForm").find('#tribeId').val());
    }
  })

  $("#searchTribeByNameForm").submit(function(){
    $("#searchTribeByNameForm").validate();
    var searchTribeByNameFormIsValid = $("#searchTribeByNameForm").valid();
    if(searchTribeByNameFormIsValid) {
      searchTribeByName($("#searchTribeByNameForm").find('#tribeName').val());
    }
  })


  $("#showTribeList").click(function(){
    $("#tribeDetails").hide();
    var gameVersion = $("#gameVersionSelect").val();
    if(gameVersion == 1){
      showLoadingBar(50);
      $.ajax({
        method: "POST",
        url: "getTribeList",
        data: gameVersion
      })
      .done(function(resData){
        showLoadingBar({
          delay: .5,
          pct: 100,
          finish: function(){
            console.log( "Done: ");
            console.log(JSON.parse(resData).tribeData);
            var tribeDataArr = JSON.parse(resData).tribeData;
            showTribeList(tribeDataArr);
          }
        });
      })
      .fail(function (xhr, error, status) {
        toastr.error(status, "Error", opts);
      })
    }
    else {
      return;
    }
  });

  $("#downloadTribeMsgBtn").click(function() {
    var startDate = $("#startDate").val();
    var endDate = $("#endDate").val();
    var dataObj = {};
    dataObj["startDate"] = startDate;
    dataObj["endDate"] = endDate;
    if(startDate != "" && endDate != ""){
      console.log(startDate + endDate);
      $.ajax({
        url: 'downloadTribeMessage',
        method: 'POST',
        data: dataObj
      })
      .done(function(resData){
        console.log(resData);
      })
      .fail(function(xhr, error, status){
        toastr.error(status, "Error", opts);
      })
    }
    else {
       toastr.error("Please select Start Date and End Date", "Error", opts);
       return;
    }
  })
})

function searchTribeById(tribeId) {
  if(tribeId != ""){
    var dataObj = {};
    dataObj["tribeId"] = tribeId;
    showLoadingBar(70);
    $.ajax({
      method: "POST",
      url: "searchTribeById",
      data: dataObj
    })
    .done(function(resData){
      showLoadingBar(100);
      var resData = JSON.parse(resData);
      console.log(resData.result[0]);
      var result = resData.result[0];
      if(result == true) {
        var tribeDataArr = resData.tribeData;
        showTribeList(tribeDataArr);
      }
      else {
        toastr.error("No tribe found!", "Not Found!", opts);
        $("#searchTribeByIdForm").find('#tribeId').select();
        $("#tribeList").hide();
        $("#tribeDetails").hide();
      }
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  }
  else {
    return;
  }
}

function searchTribeByName(tribeName) {
  if(tribeName != ""){
    var dataObj = {};
    dataObj["tribeName"] = tribeName;
    showLoadingBar(70);
    $.ajax({
      method: "POST",
      url: "searchTribeByName",
      data: dataObj
    })
    .done(function(resData){
      showLoadingBar(100);
      var resData = JSON.parse(resData);
      var result = resData.result[0];
      if(result == true) {
        var tribeDataArr = resData.tribeData;
        showTribeList(tribeDataArr);
      }
      else {
        toastr.error("No tribe found!", "Not Found!", opts);
        $("#searchTribeByNameForm").find('#tribeName').select();
        $("#tribeList").hide();
        $("#tribeDetails").hide();
      }
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  }
  else {
    return;
  }
}

function showTribeList(tribeDataArr) {
  tribeListTbl.clear();
  console.log(tribeDataArr[0]);
  var tribeDataArr = tribeDataArr;
  var id;
  var name;
  var tribeId;
  var membersCount;
  var daggers;
  var buttons;

  if(tribeDataArr.length > 0){
    for (i= 0; i<= (tribeDataArr.length - 1); i++) {
      name = tribeDataArr[i].tribeName;
      id = tribeDataArr[i].id;
      tribeId = tribeDataArr[i].tribeId;
      var tribeIdStr = '"' + tribeId + '"';
      membersCount = tribeDataArr[i].membersCount;
      daggers = tribeDataArr[i].daggers;
      var tribeDataObj = {};
      tribeDataObj["tribeName"] = name;
      tribeDataObj["tribeId"] = tribeId;
      tribeDataObj["daggers"] = daggers;
      tribeDataObj["tribeRank"] = i+1;
      tribeDataPara = JSON.stringify(tribeDataObj)
      buttons = "<button class='tribeDetailsBtn btn btn-orange' id='"+tribeId+"' onclick='getTribeDetails("+tribeIdStr+","+tribeDataPara+");' style='float:left'>Details</button><button class='blockTribeBtn btn btn-red' id='"+tribeId+"' onclick='blockTribe("+tribeIdStr+");' >Block</button>";
      tribeListTbl.row.add([
        id,
        tribeId,
        "<i class='jeditable-activate fa fa-pencil'></i> <span class='editAble' id='"+tribeId+"'>"+name+"</span>",
        membersCount,
        daggers,
        i+1,
        buttons
      ]).draw();
    }

   $('.dataTables_paginate').on('click', function () {
      editTribeNameInline();
    });


  editTribeNameInline();


  $("#tribeList").show();
  }
}

function getTribeDetails(tribeId, tribeDataPara) {
  showLoadingBar(70);
  var tribeId = tribeId;
  var reqData = {};
  reqData["tribeId"] = tribeId;
  console.log(reqData);
  $.ajax({
    method: "POST",
    url: "getTribeDetails",
    data: reqData
  })
  .done(function(resData){
    showLoadingBar({
      delay: .5,
      pct: 100,
      finish: function(){
        console.log(resData);
        var userData = JSON.parse(resData).userData;
        var tribeData = JSON.parse(resData).tribeData;
        if(userData != undefined){
          showMemberList(userData, tribeData, tribeDataPara);
        } else {
          return;
        }
      }
    });
  })
  .fail(function (xhr, error, status) {
    toastr.error(status, "Error", opts);
  })
}

function showMemberList(userData, tribeData, tribeDataPara) {
  tribeDetailsTbl.clear();
  var userId;
  var name;
  var level;
  var dagger;
  var clanRole;
  var clanRoleText;
  if(userData.length > 0){
    for(i = 0; i<=(userData.length -1); i++) {
      userId = userData[i].userId;
      name = userData[i].name;
      level = userData[i].level;
      dagger = userData[i].dagger;
      clanRole = userData[i].clanRole;
      switch(clanRole) {
        case 0:
          clanRoleText = "Leader";
          break;
        case 1:
          clanRoleText = "Elder";
          break;
        case 2:
          clanRoleText = "Member";
          break;
        default:
          clanRoleText = "Member";
          break;
      }
      tribeDetailsTbl.row.add([
        i+1,
        userId,
        name,
        level,
        dagger,
        clanRoleText
      ]).draw();
    }
  }
  $("#tribeNameTitle").html("Member List of Tribe: " + tribeDataPara.tribeName);
  console.log(tribeData);
  var joinPolicy = tribeData[0].joinPolicy;
  var joinPolicyText;
  var tribeDescription = tribeData[0].description;
  if(tribeDescription == undefined) {
    tribeDescription = "";
  }
  switch(joinPolicy){
    case 0:
      joinPolicyText = "Public";
      break;
    case 1:
      joinPolicyText = "Closed";
      break;
    case 2:
      joinPolicyText = "Invite Only";
      break;
    default:
      joinPolicyText = "";
      break;
  };
  var htmlStr = "TribeID: "+tribeDataPara.tribeId+", Total Daggers: "+tribeDataPara.daggers+", Tribe Rank: "+tribeDataPara.tribeRank;
  htmlStr += "<br />";
  htmlStr += "Tribe Policy: " + joinPolicyText;
  htmlStr += "<br />";
  htmlStr += "Tribe Description: " + tribeDescription;
  $("#tribeInfo").html(htmlStr);
  $("#tribeDetails").show();
  $("#tribeList").hide();
}

function editTribeNameInline() {
      $(".editAble").click(function(){
              $(this).prev().hide();
              $(this).tooltip({
                content: "Press Enter to submit"
              }).tooltip("open");
            });
      $(".editAble").editable(function(value, settings){
        var newTribeName = value;
        var tribeId1 = this.id;
        var dataObj = {};
        dataObj["newTribeName"] = newTribeName;
        dataObj["tribeId"] = tribeId1;
        console.log(newTribeName);
        console.log(dataObj);
        $.ajax({
            method: "POST",
            url: "updateTribeName",
            data: dataObj
          })
          .done(function(resData){
            console.log(resData);
          })
          .fail(function (xhr, error, status) {
            toastr.error(status, "Error", opts);
          })
      $(this).tooltip().tooltip("close");
      $(this).prev().show();
      return(value);
      },
      {
       type      : 'text',
//       submit    : 'OK',
//       cancel    : 'Cancel',
       display   : 'inline',
       indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
       tooltip   : 'Click to edit...',
       placeholder: '',
       onblur    : function(value){
         $(this).prev().show();
         this.reset();
        },
     });

     $(".jeditable-activate").click(function(){
          $(this).hide();
          $(this).next().trigger('click');
         })
}

function blockTribe(tribeId) {
  var dataObj = {};
  dataObj["tribeId"] = tribeId;
  $.ajax({
    url: 'blockTribe',
    method: 'POST',
    data: dataObj
  })
  .done(function(resData){
    alert("Blocked this Tribe");
    console.log(resData);
  })
  .fail(function(xhr, error, status){
    toastr.error(status, "Error", opts);
  })
}

