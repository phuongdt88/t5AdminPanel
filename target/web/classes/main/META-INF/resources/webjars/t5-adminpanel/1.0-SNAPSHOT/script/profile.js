jQuery(document).ready(function($)
{
  var username = getCookie("username");
  var dataObj = {};
  dataObj["username"] = username;
  $.ajax({
    url: 'getprofile',
    method: 'POST',
    data: dataObj,
    beforeSend: function(e) {
       showLoadingBar(70);
    }
  }).
  done(function(resData) {
     showLoadingBar(100);
     console.log(resData);
     var userInfo = JSON.parse(resData).userInfo;
     $("#username").val(userInfo.username);
     $("#password").val(userInfo.password);
     $("#email").val(userInfo.email);
     var roleName;
     switch(userInfo.role) {
        case 0:
          roleName = 'Root Admin';
          break;
        case 1:
          roleName = 'Customer Agent';
          break;
        case 2:
          roleName = 'Investigating QA';
          break;
        case 3:
          roleName = 'Analysis';
          break;
        case 4:
          roleName = 'Designer';
          break;
        case 5:
          roleName = 'Engineer';
          break;
        default:
          roleName = 'N/A';
          break;
     }
     $("#role").val(roleName);
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })

  $('#editProfileForm').submit(function(e) {
    $('#editProfileForm').validate();
    if($('#editProfileForm').valid()){
       var username = $("#username").val();
       var password = $("#password").val();
       var email = $("#email").val();
       updateProfile(username, password, email);
    }
  })
});

function updateProfile(username, password, email) {
  var dataObj = {};
  dataObj["username"] = username;
  dataObj["password"] = password;
  dataObj["email"] = email;
  $.ajax({
      url: 'updateprofile',
      method: 'POST',
      data: dataObj,
      beforeSend: function(e) {
         showLoadingBar(70);
      }
    }).
    done(function(resData) {
      showLoadingBar(100);
      if(resData == "0") {
        toastr.error("Username already existed", "Update failed", opts);
        $("#username").focus();
        return;
      } else if(resData == "1") {
        toastr.error("Email already existed", "Update failed", opts);
        $("#email").focus();
        return;
      } else if(resData == "2") {
        toastr.success("Updated successfully", "Done", opts);
      }
    }).
    fail(function(xhr, status, error) {
      showLoadingBar(100);
      toastr.error(status, "Error", opts);
    })
}

