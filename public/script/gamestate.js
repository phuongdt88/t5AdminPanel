jQuery(document).ready(function($)
{

  /* init datatable */
  $("#example-2,#example-3").dataTable({
   "bSort" : false,
    "aLengthMenu": [
      [10, 25, 50, 100, -1], [10, 25, 50, 100, "All"]
    ]
  });

  $("#userListTbl").dataTable({
     "bFilter":false,
     "bSort" : false,
     "bPaginate": false,
     "bInfo": false
  });
  $("#purchaseHistoryTbl").dataTable({
    "sScrollX":'100%',
    "bSort" : false,
    "aLengthMenu": [
      [10, 25, 50, 100, -1], [10, 25, 50, 100, "All"]
    ]
  });

  defenseLogTbl = $("#defenseLogTbl").DataTable({
    "sScrollX":'100%',
    "bSort" : false,
    "aLengthMenu": [
      [10, 25, 50, 100, -1], [10, 25, 50, 100, "All"]
    ]
  });

  attackLogTbl = $("#attackLogTbl").DataTable({
      "sScrollX":'100%',
      "bSort" : false,
      "aLengthMenu": [
        [10, 25, 50, 100, -1], [10, 25, 50, 100, "All"]
      ]
    });


  $("#lumbaLogTbl").dataTable({
    "sScrollX":'500%',
    "bSort" : false,
    "aLengthMenu": [
      [10, 25, 50, 100, -1], [10, 25, 50, 100, "All"]
    ]
  });


  $("#userList").hide();
  $("#gameStateResult").hide();

  // Validation and Ajax action
  $("#searchByUserIdForm").submit(function(){
    $("#searchByUserIdForm").validate();
    var searchByUserIdFormIsValid = $("form#searchByUserIdForm").valid();
    if(searchByUserIdFormIsValid) {
        searchUserById ($("#searchByUserIdForm").find('#userId').val());
      }
  });

  $("#searchUserByNameForm").submit(function(){
    $("#searchUserByNameForm").validate();
    var searchUserByNameFormIsValid = $("form#searchUserByNameForm").valid();
    if(searchUserByNameFormIsValid) {
        var searchType = 1;
        getUserList($("#searchUserByNameForm").find('#name').val(), searchType);
      }
  });

  $("#searchUserByEmailForm").submit(function(){
    $("#searchUserByEmailForm").validate();
    var searchUserByEmailFormIsValid = $("form#searchUserByEmailForm").valid();
    if(searchUserByEmailFormIsValid) {
        var searchType = 2;
        getUserList($("#searchUserByEmailForm").find('#email').val(), searchType);
      }
  });

  $("#searchUserByDaggerForm").submit(function(){
    $("#searchUserByDaggerForm").validate();
    var searchUserByDaggerFormIsValid = $("form#searchUserByDaggerForm").valid();
    if(searchUserByDaggerFormIsValid) {
        var searchType = 3;
        getUserList($("#searchUserByDaggerForm").find('#dagger').val(), searchType);
      }
  });

  var selectValues = initTurnOnShieldTime();
  $.each(selectValues, function(key, value) {
      $('#turnOnShieldTime').append($("<option/>", {
          value: key,
          text: value
      }));
  });

  $("#form1").submit(function(){
    $("#form1").validate();
    var isValid = $("#form1").valid();
    if(isValid) {
      $.ajax({
        method: "POST",
        url: "updateUserData",
        data: getNewValues()
      })
      .done(function(msg){
        alert("Data saved");
      })
      .fail(function (xhr, error, status) {
        toastr.error(status, "Error", opts);
      })
    }
  })
  $("#noteForUserBtn").click(function(){
    var comment = $("#noteForUserTextarea").val();
    var dataObj = {};
    dataObj["comment"] = comment;
    $.ajax({
      method: "POST",
      url: "noteForUser",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#deleteUser").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "deleteUser",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#fakeUser").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "fakeUser",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#downloadBattleLog").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "downloadBattleLog",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
  })
  $("#turnOffShield").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "turnOffShield",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#turnOnShield").click(function(){
    var dataObj = {};
    var time = $("#turnOnShieldTime").val();
    dataObj["userId"] = $("#userIdVal").html();
    dataObj["time"] = time;
    $.ajax({
      method: "POST",
      url: "turnOnShield",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
  })
  $("#blockLeaderBoard").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "blockLeaderBoard",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#blockTribe").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "blockTribe",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#blockSearching").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "blockSearching",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#blockGlobalChat").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "blockGlobalChat",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
  $("#blockAttack").click(function(){
    var dataObj = {};
    dataObj["userId"] = $("#userIdVal").html();
    $.ajax({
      method: "POST",
      url: "blockAttack",
      data: dataObj
    })
    .done(function(msg){
      alert("Data saved: "+ msg)
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
  })
});

function searchUserById (userId) {
  showLoadingBar(70);
  $.ajax({
    url: "searchByUserId",
    method: 'POST',
    dataType: 'json',
    data: {
      userId: userId
    },
    success: function(resData)
    {
      console.log(resData);
      showLoadingBar({
        delay: 0.5,
        pct: 100,
        finish: function(){
          if(resData.resp.result)
          {
            var userGameStateObj = resData.userGameStateObj;
            var hInfo = null;
            var expPoints = null;
            var gold = null;
            var water = null;
            var oil = null;
            var pearls = null;
            var diwanLvl = null;
            var dagger = null;
            var music = null;
            var sound = null;
            var onlineStatus;
            if (resData.userData.lastOnlineTime > resData.userData.lastOfflineTime) {
              onlineStatus = "Online";
            }
            else {
              onlineStatus = "Offline";
            }
            if(userGameStateObj != undefined && !$.isEmptyObject(userGameStateObj)) {
              hInfo = userGameStateObj.HUD.hInfo;
              expPoints = hInfo[1];
              gold = hInfo[2];
              water = hInfo[3];
              oil = hInfo[4];
              pearls = hInfo[5];
              diwanLvl = hInfo[6];
              music = userGameStateObj.Settings.music;
              sound = userGameStateObj.Settings.sound;
            }
            var tribe = resData.tribe;

            var inboxMessages = JSON.parse(resData.userData.inboxMessages);
            console.log("inboxMessage");

            var messageArr = inboxMessages.list;


            var battleLogObj = JSON.parse(resData.userData.battleLog)
            var defenseArr = battleLogObj.defense;
            var attackArr = battleLogObj.attack;

            $('#onlineStatusVal').html(onlineStatus);
            $('#userIdVal').html(resData.userData.userId);
            $('#nameVal').html(resData.userData.name);
            $('#emailVal').html(resData.userData.email);
            $('#passwordVal').html(resData.userData.password);
            $('#localeVal').html(resData.userData.locale);
            $('#levelVal').html(resData.userData.level);
            $('#createdAtVal').html(resData.userData.createdAt);
            $('#isFakeVal').html(resData.userData.isFake);
            $('#sfsVersionVal').html(resData.userData.sfsVersion);
            $('#expPointsVal').html(expPoints);
            $('#goldVal').html(gold);
            $('#waterVal').html(water);
            $('#oilVal').html(oil);
            $('#pearlsVal').html(pearls);
            $('#diwanLvlVal').html(diwanLvl);
            $('#daggerVal').html(resData.userData.dagger);
            $('#tribeVal').html(tribe.clanName);
            $('#tribeIdVal').html(tribe.clanId);
            $('#musicVal').html(music);
            $('#soundVal').html(sound);
            $("#userList").hide();

            getBattleLog(defenseArr, 2);

            getBattleLog(attackArr, 1);
            $('#inboxMessage').html(showInboxMessage(messageArr));
            $("#gameStateResult").show();
          }
          else
          {
            $("#gameStateResult").hide();
            toastr.error("No user found!", "Not Found!", opts);
            $("#searchByUserIdForm").find('#userId').select();
          }
        }
      });
    }
  });
}

function getUserList(value, searchType) {
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
    var url;
    if(searchType == 1){
      url = "searchUserByName";
      data = {
      name: value,
      searchType: 1
      };
    }
    else if(searchType == 2) {
      url = "searchUserByEmail";
      data = {
        email: value,
        searchType: 2
       };
    }
    else if(searchType == 3) {
      url = "searchUserByDagger";
      data = {
        dagger: value,
        searchType: 3
       };
    }
    $.ajax({
      url: url,
      method: 'POST',
      dataType: 'json',
      data: data,
      beforeSend: function(e) {
        showLoadingBar(70)
      },
      success: function(resData)
      {
        showLoadingBar({
          delay: 0.5,
          pct: 100,
          finish: function(){
            if(resData.resp.result)
            {
              $("#userListResult").html(showUserList(resData.userInfo));
              $("#userList").show();
              $("#gameStateResult").hide();
            }
            else
            {
              $("#gameStateResult").hide();
              $("#userList").hide();
              toastr.error("No user found!", "Not Found!", opts);
              $("#searchUserByNameForm").find('#name').select();
            }
           }
        });
      }
    }).
    fail(function(xhr, status, error) {
      showLoadingBar(100);
      toastr.error(status, "Error", opts);
    })
    ;
}

function abc(number) {
  alert(number);
}

function showUserList(userData) {
  var html ="";
  $.each(userData, function(key, value) {
    var userId = '"' + value.userId + '"';
    html += "<tr>"
    html += "<td>"+ value.userId +"</td>";
    html += "<td>"+ value.name +"</td>";
    html += "<td>"+ value.email +"</td>";
    html += "<td>"+ value.dagger +"</td>";
    html += "<td><button class='userDetails btn btn-orange btn-icon btn-icon-standalone' id="+value.userId+" onclick='searchUserById("+userId+");'><i class='fa-pencil'></i><span>Details</span></button></td>";
    html += "</tr>"
  });
  return html;
}

function getBattleLog(battleArr, battleType) {
  attackLogTbl.clear();
  defenseLogTbl.clear();
  var shieldTime;
  var dataString;
  var dataObj;
  if(battleArr.length > 0){
    if(battleType == 1) {
      for(i=0; i <=(battleArr.length - 1); i++) {
        dataString = battleArr[i].data;
        dataObj = JSON.parse(dataString);
        switch(dataObj.numStars) {
          case 1:
            shieldTime = 8 + " Hours";
            break;
          case 2:
            shieldTime = 12 + " Hours";
            break;
          case 3:
            shieldTime = 16 + " Hours";
            break;
          default:
            shieldTime = 0;
            break;
        }
        attackLogTbl.row.add([
         dataObj.username,
         dataObj.opponentId,
         dataObj.gainedTrophy,
         dataObj.opponentName,
         dataObj.lootTrophy,
         dataObj.numStars,
         dataObj.percentDamage,
         dataObj.userClanId,
         dataObj.userClanName,
         dataObj.opponentClanId,
         dataObj.opponentClanName,
         formatTime(battleArr[i].created_at),
         shieldTime
       ]).draw();
      }
    }
    else if(battleType == 2) {
      for(i=0; i <= (battleArr.length -1); i++) {
        dataString = battleArr[i].data;
        dataObj = JSON.parse(dataString);
        switch(dataObj.numStars) {
          case 1:
            shieldTime = 8 + " Hours";
            break;
          case 2:
            shieldTime = 12 + " Hours";
            break;
          case 3:
            shieldTime = 16 + " Hours";
            break;
          default:
            shieldTime = 0;
            break;
        }
        defenseLogTbl.row.add([
          dataObj.username,
          dataObj.userId,
          dataObj.gainedTrophy,
          dataObj.opponentName,
          dataObj.lootTrophy,
          dataObj.numStars,
          dataObj.percentDamage,
          dataObj.userClanId,
          dataObj.userClanName,
          dataObj.opponentClanId,
          dataObj.opponentClanName,
          formatTime(battleArr[i].created_at),
          shieldTime
        ]).draw();
      }
    }
  }
}

function showInboxMessage(messageArr) {
  var html = "";
  if(messageArr.length > 0) {
    for(i = 0; i <= (messageArr.length - 1); i++) {
      var dataObj = messageArr[i];
      html += "<tr>";
      html += "<td><span>"+ dataObj.username +"</span></td>";
      html += "<td><span>"+ dataObj.userId +"</span></td>";
      html += "<td><span>"+ dataObj.clanName +"</span></td>";
      html += "<td><span>"+ dataObj.text +"</span></td>";
      html += "<td><span>"+ dataObj.serverTime +"</span></td>";
      html += "</tr>";
    }
  }
  return html;
}

formatTime = function(timeStamp) {
    var a = new Date(timeStamp);
//    var months = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
    var year = a.getFullYear();
    var month = a.getMonth() + 1;
    var date = a.getDate();
    var hour = a.getHours();
    var min = a.getMinutes();
    var sec = a.getSeconds();
    var time = year + '/' + month + '/' + date + ' ' + hour + ':' + min + ':' + sec ;
    return time;
}

getNewValues = function() {
  var dataObj = {};
  $(".newValueInput").each(function(key, value){
    if(this.value !== "") {
      dataObj[this.name] = this.value;
    }
  });
  $(".changeReasonInput").each(function(key, value){
    if(this.value !== "") {
      dataObj[this.name] = this.value;
    }
  })
  return dataObj;
}

function initTurnOnShieldTime() {
  var timeObj = {};
  for(i = 1; i<=100; i++){
    timeObj[i] = i + ' Hour(s)';
  }
  return timeObj;
}