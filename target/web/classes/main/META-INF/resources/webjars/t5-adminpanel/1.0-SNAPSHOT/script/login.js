jQuery(document).ready(function($)
  {
    // Reveal Login form
    setTimeout(function(){ $(".fade-in-effect").addClass('in'); }, 1);


    // Validation and Ajax action
    $("form#login").validate({
      rules: {
        username: {
          required: true
        },

        password: {
          required: true
        }
      },

      // Form Processing via AJAX
//      submitHandler: function(form)
//      {
//        showLoadingBar(70); // Fill progress bar to 70% (just a given value)
//
//
//        $.ajax({
//          url: "checklogin",
//          method: 'POST',
//          dataType: 'json',
//          data: {
//            <!--do_login: true,-->
//            username: $(form).find('#username').val(),
//            password: $(form).find('#password').val(),
//          },
//          success: function(resData)
//          {
//            console.log(resData);
//            showLoadingBar({
//              delay: 0.5,
//              pct: 100,
//              finish: function(){
//
//                // Redirect after successful login page (when progress bar reaches 100%)
//                if(resData.result)
//                {
//                  window.location.hash = '#/app/gamestate';
//                }
//                else
//                {
//                  toastr.error("You have entered wrong username or password, please try again.", "Invalid Login!", opts);
//                  $(form).find('#password').select();
//                }
//              }
//            });
//
//          }
//        });
//      }
    });

    // Set Form focus
    $("form#login .form-group:has(.form-control):first .form-control").focus();
  });