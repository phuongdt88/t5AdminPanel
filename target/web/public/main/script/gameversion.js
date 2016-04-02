jQuery(document).ready(function($)
{
  var gameVersionInfoArr = JSON.parse($("#gameVersionInfo").val()).gameVersionInfo;
  var htmlStr = "";
  for(var i = 0; i <= gameVersionInfoArr.length -1; i++) {
    htmlStr += "<option value="+gameVersionInfoArr[i].gameVersion+">"+gameVersionInfoArr[i].gameVersion+"</option>"
  }
  console.log(htmlStr);
  $("#gameVersionSelect").append(htmlStr);

  /* selectGameVersionForm action */
  $("#selectGameVersionForm").submit(function() {
    $("#selectGameVersionForm").validate();
    if($("#selectGameVersionForm").valid()) {
      var gameVersion = $("#gameVersionSelect").val();
      setCookie("gameVersion",gameVersion);
      toastr.success("","Switched to Version "+gameVersion, opts);
      var lastState = getCookie("lastState");
      if(lastState != "") {
        window.location.href = decodeURIComponent(lastState);
      }
    }
  })
})