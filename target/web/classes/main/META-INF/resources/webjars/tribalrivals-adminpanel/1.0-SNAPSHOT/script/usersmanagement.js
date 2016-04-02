jQuery(document).ready(function($)
{
  $("#sendEmailSection").hide();
  var resDataStr = $("#resDataInput").val();
  var dataObj = JSON.parse(resDataStr);
  var userInfoArr = dataObj.userInfo;
  var userId;
  var username;
  var email;
  var password;
  var role;
  var tableData = [];

  for(i = 0; i <= (userInfoArr.length -1); i++) {
    userId = userInfoArr[i].userId;
    username = userInfoArr[i].username;
    email = userInfoArr[i].email;
    password = userInfoArr[i].password;
    role = userInfoArr[i].role;
    var rowData = {};
    rowData["DT_RowId"] = userId;
    rowData["id"] = userId;
    rowData["username"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='usernameEditAble'>"+username+"</span>";
    rowData["email"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='emailEditAble'>"+email+"</span>";
    rowData["password"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='passwordEditAble'>"+password+"</span>";
    rowData["role"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='roleEditAble'>"+role+"</span>";
    rowData["action"] = "<a href=''  class='sendEmailBtn btn btn-primary btn-single btn-sm' style='float:left;margin-right:1%'>Send Email</a><button class='deleteAccBtn btn btn-red'>Delete</button>";
    tableData.push(rowData);

   }
   console.log("table data:");
   console.log(tableData);

   adminAccountTbl = $("#adminAccountTbl").DataTable({
    "bSort" : false,
     "aLengthMenu": [
       [25, 50, 100, -1], [25, 50, 100, "All"]
     ],
     "columns": [
       { "data": "id" },
       { "data": "username" },
       { "data": "email" },
       { "data": "password" },
       { "data": "role" },
       { "data": "action" }
     ],
     data: tableData,
   });
   editUsername();
   editEmail();
   editPassword();
   editRole();
    $(".jeditable-activate").click(function(){
     $(this).hide();
     $(this).next().trigger('click');
    })

   $("form#addAdminAccForm").submit(function(){
    var username = $("#username").val();
    var password = $("#password").val();
    var email = $("#email").val();
    var role = $("#roleSelect").val();
    var dataObj = {};
    dataObj["username"] = username;
    dataObj["email"] = email;
    dataObj["password"] = password;
    dataObj["role"] = role;
    $("#addAdminAccForm").validate();
    var isValid = $("form#addAdminAccForm").valid();
    console.log(isValid);
    if(isValid){
      $.ajax({
        method: "POST",
        url: "addAdminAccount",
        data: dataObj
      }).
      done(function(resData){
        console.log(resData);
        var resData = JSON.parse(resData);
        if(resData == "2") {
          $("#addAdminAccForm").trigger('reset');
          toastr.success("Added successfully", "Done", opts);
        }
        else if(resData == "0")
        {
          /*
          * check already exist Username and Email
          */
          $('#username').select();
          $('#username')[0].parentNode.parentNode.className = "form-group validate-has-error";
          $('#username').attr('aria-invalid', true);
          if($('#username-error')[0] == undefined){
            span = document.createElement('span');
            span.className = 'validate-has-error';
            span.id = 'username-error';
            span.style.display = 'inline';
            span.innerHTML = 'Username already existed!';
            $('#username')[0].parentNode.appendChild(span);
          }
          else {
            $('#username-error')[0].style.display = 'inline';
            $('#username-error')[0].innerHTML = 'Username already existed!';
          }
        }
        else if(resData == "1")
        {
          $('#email').select();
          $('#email')[0].parentNode.parentNode.className = "form-group validate-has-error";
          $('#email').attr('aria-invalid', true);
          if($('#email-error')[0] == undefined){
            span = document.createElement('span');
            span.className = 'validate-has-error';
            span.id = 'email-error';
            span.style.display = 'inline';
            span.innerHTML = 'Email already existed!';
            $('#email')[0].parentNode.appendChild(span);
          }
          else {
            $('#email-error')[0].style.display = 'inline';
            $('#email-error')[0].innerHTML = 'Email already existed!';
          }
        }
      }).
      fail(function (xhr, error, status) {
        toastr.error(status, "Error", opts);
      })
    }
   })

   $('.deleteAccBtn').click(function(){
    var userId = $(this).parent().parent()[0].id;
    var dataObj = {};
    dataObj["userId"] = userId;
    $.ajax({
      method: "POST",
      url: "deleteadminacc",
      data: dataObj
    })
    .done(function(resData){
      console.log(resData);
      alert("deleted");
    })
    .fail(function (xhr, error, status) {
      toastr.error(status, "Error", opts);
    })
   })

   $('.sendEmailBtn').click(function(e) {
    var emailCell = $(this).parent().parent().children()[2];
    var emailAddress= emailCell.getElementsByTagName("span")[0].innerHTML;
    $("#receiverEmail")[0].value = emailAddress;
    console.log(emailAddress);
    $("#sendEmailSection").show();
    $(document).scrollTop( $(sendEmailSection).offset().top );
    $("#sendEmailBtn").click(function(e) {
      var receiverEmail = $("#receiverEmail").val();
      var message = $("#message").val();
      var subject = $("#emailSubject").val();
      sendEmail(receiverEmail, subject, message);
    })
   })
});

function editUsername() {
      $(".usernameEditAble").click(function(){
        $(this).prev().hide();
        $(this).tooltip({
          content: "Press Enter to submit"
        }).tooltip("open");
      });
      $(".usernameEditAble").editable(function(value, settings){
        var newUsername = value;
        var userId = $(this).parent().parent()[0].id;
        var dataObj = {};
        dataObj["newUsername"] = newUsername;
        dataObj["userId"] = userId;
        var ajaxUrl = "updateusername";
        accountInfoChangeAjax(ajaxUrl, dataObj);
        $(this).tooltip().tooltip("close");
        $(this).prev().show();
        return(value);
      },
      {
       type      : 'text',
//       submit    : 'OK',
       display   : 'inline',
       indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
       tooltip   : 'Click to edit...',
       placeholder: '',
       onblur    : function(value){
        $(this).prev().show();
        this.reset();
       },
     });
}

function editEmail() {
      $(".emailEditAble").click(function(){
         $(this).prev().hide();
         $(this).tooltip({
           content: "Press Enter to submit"
         }).tooltip("open");
      });
      $(".emailEditAble").editable(function(value, settings){
        var newEmail = value;
        var userId = $(this).parent().parent()[0].id;
        var dataObj = {};
        dataObj["newEmail"] = newEmail;
        dataObj["userId"] = userId;
        var ajaxUrl = "updateemail";
        accountInfoChangeAjax(ajaxUrl, dataObj);
        $(this).tooltip().tooltip("close");
        $(this).prev().show();
        return(value);
      },
      {
       type      : 'text',
//       submit    : 'OK',
       display   : 'inline',
       indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
       tooltip   : 'Click to edit...',
       placeholder: '',
       onblur    : function(value){
         $(this).prev().show();
         this.reset();
        },
     });
}

function editPassword() {
      $(".passwordEditAble").click(function(){
        $(this).prev().hide();
        $(this).tooltip({
          content: "Press Enter to submit"
        }).tooltip("open");
      });
      $(".passwordEditAble").editable(function(value, settings){
        var newPassword = value;
        var userId = $(this).parent().parent()[0].id;
        var dataObj = {};
        dataObj["newPassword"] = newPassword;
        dataObj["userId"] = userId;
        var ajaxUrl = "updatepassword";
        accountInfoChangeAjax(ajaxUrl, dataObj);
        $(this).tooltip().tooltip("close");
        $(this).prev().show();
        return(value);
      },
      {
       type      : 'text',
//       submit    : 'OK',
       display   : 'inline',
       indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
       tooltip   : 'Click to edit...',
       placeholder: '',
       onblur    : function(value){
         $(this).prev().show();
         this.reset();
        },
     });
}

function editRole() {
      $(".roleEditAble").click(function(){
        $(this).prev().hide();
        $(this).tooltip({
          content: "Press Enter to submit"
        }).tooltip("open");
      });
      $(".roleEditAble").editable(function(value, settings){
        console.log($(this).prev());
        var newRole = value;
        var userId = $(this).parent().parent()[0].id;
        var dataObj = {};
        dataObj["newRole"] = newRole;
        dataObj["userId"] = userId;
        var ajaxUrl = "updaterole";
        accountInfoChangeAjax(ajaxUrl, dataObj);
        $(this).tooltip().tooltip("close");
        $(this).prev().show();
        return(value);
      },
      {
       type      : 'text',
//       submit    : 'OK',
       style     : "float:left",
       indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
       tooltip   : 'Click to edit...',
       placeholder: '',
       onblur    : function(value){
        $(this).prev().show();
        this.reset();
       },
     });
}

function accountInfoChangeAjax(ajaxUrl, dataObj) {
  $.ajax({
    method: "POST",
    url: ajaxUrl,
    data: dataObj
  })
  .done(function(resData){
    console.log(resData);
  })
  .fail(function (xhr, error, status) {
    toastr.error(status, "Error", opts);
  })
}

function  sendEmail(email, subject, message) {
  var dataObj = {};
  dataObj['receiverEmail'] = email;
  dataObj['subject'] = subject;
  dataObj['message'] = message;
  $.ajax({
    url: 'sendEmail',
    method: 'POST',
    data: dataObj,
    beforeSend: function(e) {
      showLoadingBar(70);
    }
  }).
  done(function(resData) {
    showLoadingBar(100);
    $("#sendEmailSection").hide();
    alert("Email has been sent");
  }).
  fail(function(xhr, status, error) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}