jQuery(document).ready(function($)
{
   var resData = JSON.parse($("#resData").val());
   var englishNews = resData.englishNews;
   var arabNews = resData.arabNews;

   englishNews = englishNews.replace(/(?:\r\n|\r|\n)/g,"\\r\\n");
   arabNews = arabNews.replace(/(?:\r\n|\r|\n)/g,"\\r\\n");

   englishNewsArr = JSON.parse(englishNews);
   arabNewsArr = JSON.parse(arabNews);
   console.log(arabNewsArr);
   var eTime;
   var eTitle;
   var eImageLink;
   var eContent;
   var eVideoLink;
   var eNewsTblRowData = {};
   var eNewsTblData = [];
   var eIndex;
   for(var i = 0; i <= (englishNewsArr.length -1); i++) {
     eTime = englishNewsArr[i].times;
     eTitle = englishNewsArr[i].title;
     eImageLink = englishNewsArr[i].image;
     eContent = englishNewsArr[i].content;
     eVideoLink = englishNewsArr[i].video;

     eNewsTblRowData["DT_RowId"] = ""+i;
     eNewsTblRowData["eTime"] = eTime;
     eNewsTblRowData["eTitle"] =  "<i class='jeditable-activate fa fa-pencil'></i> <span class='eTitleEditAble'>"+eTitle+"</span>";
     eNewsTblRowData["eImageLink"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='eImageLinkEditAble'>"+eImageLink+"</span>";
     eNewsTblRowData["eContent"] = "<textarea rows='10' cols='50' class='eContentEditAble'>"+eContent+"</textarea><button class='saveEContentBtn btn btn-success'>Save</button>";
     eNewsTblRowData["eVideoLink"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='eVideoLinkEditAble'>"+eVideoLink+"</span>";
     eNewsTblRowData["eDeleteBtn"] = "<button class='eNewsDeleteBtn btn btn-red'>Delete</button>";
     eNewsTblData.push(eNewsTblRowData);
   }
   englishNewsTbl = $("#englishNewsTbl").DataTable({
    "bSort" : false,
     "aLengthMenu": [
       [25, 50, 100, -1], [25, 50, 100, "All"]
     ],
     "columns": [
        { "data": "eTime" },
        { "data": "eTitle" },
        { "data": "eImageLink" },
        { "data": "eContent" },
        { "data": "eVideoLink" },
        { "data": "eDeleteBtn" }
      ],
      data: eNewsTblData
   })
   $(".saveEContentBtn").hide();
   var aTime;
   var aTitle;
   var aImageLink;
   var aContent;
   var aVideoLink;
   var aNewsTblRowData = {};
   var aNewsTblData = [];
   for(var j = 0; j <= (arabNewsArr.length -1); j++) {
     aTime = arabNewsArr[j].times;
     aTitle = arabNewsArr[j].title;
     aImageLink = arabNewsArr[j].image;
     aContent = arabNewsArr[j].content;
     aVideoLink = arabNewsArr[j].video;
     aNewsTblRowData["DT_RowId"] = ""+j;
     aNewsTblRowData["aTime"] = aTime;
     aNewsTblRowData["aTitle"] =  "<i class='jeditable-activate fa fa-pencil'></i> <span class='eTitleEditAble'>"+aTitle+"</span>";
     aNewsTblRowData["aImageLink"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='eImageLinkEditAble'>"+aImageLink+"</span>";
     aNewsTblRowData["aContent"] = "<textarea rows='10' cols='50' class='aContentEditAble'>"+aContent+"</textarea><button class='saveAContentBtn btn btn-success'>Save</button>";
     aNewsTblRowData["aVideoLink"] = "<i class='jeditable-activate fa fa-pencil'></i> <span class='eVideoLinkEditAble'>"+aVideoLink+"</span>";
     aNewsTblRowData["aDeleteBtn"] = "<button class='aNewsDeleteBtn btn btn-red'>Delete</button>";
     aNewsTblData.push(aNewsTblRowData);
   }
   arabNewsTbl = $("#arabNewsTbl").DataTable({
    "bSort" : false,
     "aLengthMenu": [
       [25, 50, 100, -1], [25, 50, 100, "All"]
     ],
     "columns": [
       { "data": "aTime" },
       { "data": "aTitle" },
       { "data": "aImageLink" },
       { "data": "aContent" },
       { "data": "aVideoLink" },
       { "data": "aDeleteBtn" }
     ],
     data: aNewsTblData
   })
   $(".saveAContentBtn").hide();
   editEnglishNewsTitle();
   editEnglishNewsImage();
   editEnglishNewsVideo();
   editArabNewsTitle();
   editArabNewsImage();
   editArabNewsVideo();
   $(".jeditable-activate").click(function(){
    $(this).hide();
    $(this).next().trigger('click');
   })

   $("#addEnglishNewsForm").submit(function(){
      $("#addEnglishNewsForm").validate();
      var addEnglishNewsFormIsValid = $("#addEnglishNewsForm").valid();
      if(addEnglishNewsFormIsValid) {
        var dataObj = {};
        var title = $("#englishNewsTitle").val();
        var image = $("#englishNewsImage").val();
        var content = $("#englishNewsContent").val();
        var video = $("#englishNewsVideo").val();
        dataObj["title"] = title;
        dataObj["image"] = image;
        dataObj["content"] = content;
        dataObj["video"] = video;
        console.log(dataObj);
        addEnglishNews(dataObj);
      }
   });

   $("#addArabNewsForm").submit(function(){
     $("#addArabNewsForm").validate();
     var addArabNewsFormIsValid = $("#addArabNewsForm").valid();
     if(addArabNewsFormIsValid) {
       var dataObj = {};
       var title = $("#arabNewsTitle").val();
       var image = $("#arabNewsImage").val();
       var content = $("#arabNewsContent").val();
       var video = $("#arabNewsVideo").val();
       dataObj["title"] = title;
       dataObj["image"] = image;
       dataObj["content"] = content;
       dataObj["video"] = video;
       console.log(dataObj);
       addArabNews(dataObj);
     }
   });

   $(".eContentEditAble").on('change keyup paste', function(){
      $(this).next().show();
   });
   $(".saveEContentBtn").on('click', function(){
      var thisBtn = $(this);
      var newContent = $(this).prev().val();
      var newsId = parseInt($(this).parent().parent()[0].id);
      var dataObj = {};
      dataObj["newContent"] = newContent;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
        url: 'updateenglishnewscontent',
        method: 'POST',
        data: dataObj,
        beforeSend: function(){
          showLoadingBar(70);
        }
      }).
      done(function(resData){
        showLoadingBar(100);
        console.log(resData);
        console.log($(this));
        thisBtn.hide();
      }).
     fail(function (xhr, error, status) {
        showLoadingBar(100);
        toastr.error(status, "Error", opts);
      })
   });

   $(".eNewsDeleteBtn").on('click', function(){
     var newsId = parseInt($(this).parent().parent()[0].id);
     var dataObj = {};
     dataObj["newsId"] = newsId;
     $.ajax({
       url: 'deleteenglishnews',
       method: 'POST',
       data: dataObj,
       beforeSend: function(){
         showLoadingBar(70);
       }
     }).
     done(function(resData){
       showLoadingBar(100);
       console.log(resData);
     }).
    fail(function (xhr, error, status) {
       showLoadingBar(100);
       toastr.error(status, "Error", opts);
     })
   });


   $(".aContentEditAble").on('change keyup paste', function(){
      $(this).next().show();
   });
   $(".saveAContentBtn").on('click', function(){
      var thisBtn = $(this);
      var newContent = $(this).prev().val();
      var newsId = parseInt($(this).parent().parent()[0].id);
      var dataObj = {};
      dataObj["newContent"] = newContent;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
        url: 'updatearabnewscontent',
        method: 'POST',
        data: dataObj,
        beforeSend: function(){
          showLoadingBar(70);
        }
      }).
      done(function(resData){
        showLoadingBar(100);
        console.log(resData);
        thisBtn.hide();
      }).
     fail(function (xhr, error, status) {
        showLoadingBar(100);
        toastr.error(status, "Error", opts);
      })
   });

   $(".aNewsDeleteBtn").on('click', function(){
     var newsId = parseInt($(this).parent().parent()[0].id);
     var dataObj = {};
     dataObj["newsId"] = newsId;
     $.ajax({
       url: 'deletearabnews',
       method: 'POST',
       data: dataObj,
       beforeSend: function(){
         showLoadingBar(70);
       }
     }).
     done(function(resData){
       showLoadingBar(100);
       console.log(resData);
     }).
    fail(function (xhr, error, status) {
       showLoadingBar(100);
       toastr.error(status, "Error", opts);
     })
   });
});

function addEnglishNews(dataObj) {
  $.ajax({
    url: 'addenglishnews',
    method: 'POST',
    data: dataObj,
    beforeSend: function(){
      showLoadingBar(70);
    }
  }).
  done(function(resData){
    showLoadingBar(100);
    console.log(resData);
    alert("added");
    $("#addEnglishNewsForm")[0].reset();
  }).
 fail(function (xhr, error, status) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}

function addArabNews(dataObj) {
  $.ajax({
    url: 'addarabnews',
    method: 'POST',
    data: dataObj,
    beforeSend: function(){
      showLoadingBar(70);
    }
  }).
  done(function(resData){
    showLoadingBar(100);
    console.log(resData);
    alert("added");
    $("#addArabNewsForm")[0].reset();
  }).
 fail(function (xhr, error, status) {
    showLoadingBar(100);
    toastr.error(status, "Error", opts);
  })
}

function editEnglishNewsTitle() {
    $(".eTitleEditAble").click(function(){
      $(this).prev().hide();
      $(this).tooltip({
        content: "Press Enter to submit"
      }).tooltip("open");
    });
    $(".eTitleEditAble").editable(function(value, settings){
      var newETitle = value;
      var newsId = $(this).parent().parent()[0].id;
      var dataObj = {};
      dataObj["newETitle"] = newETitle;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
          method: "POST",
          url: "updateenglishnewstitle",
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
     display   : 'inline',
     indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
     tooltip   : 'Click to edit...',
     onblur    : function(value){
      $(this).prev().show();
      this.reset();
     },
   });
}

function editEnglishNewsImage() {
    $(".eImageLinkEditAble").click(function(){
      $(this).prev().hide();
      $(this).tooltip({
        content: "Press Enter to submit"
      }).tooltip("open");
    });
    $(".eImageLinkEditAble").editable(function(value, settings){
      var newImage = value;
      var newsId = $(this).parent().parent()[0].id;
      var dataObj = {};
      dataObj["newImage"] = newImage;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
          method: "POST",
          url: "updateenglishnewsimage",
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
     display   : 'inline',
     indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
     tooltip   : 'Click to edit...',
     onblur    : function(value){
      $(this).prev().show();
      this.reset();
     },
   });
}

function editEnglishNewsVideo() {
    $(".eVideoLinkEditAble").click(function(){
      $(this).prev().hide();
      $(this).tooltip({
        content: "Press Enter to submit"
      }).tooltip("open");
    });
    $(".eVideoLinkEditAble").editable(function(value, settings){
      var newVideo = value;
      var newsId = $(this).parent().parent()[0].id;
      var dataObj = {};
      dataObj["newVideo"] = newVideo;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
          method: "POST",
          url: "updateenglishnewsvideo",
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
     display   : 'inline',
     indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
     tooltip   : 'Click to edit...',
     onblur    : function(value){
      $(this).prev().show();
      this.reset();
     },
   });
}

function editArabNewsTitle() {
    $(".aTitleEditAble").click(function(){
      $(this).prev().hide();
      $(this).tooltip({
        content: "Press Enter to submit"
      }).tooltip("open");
    });
    $(".aTitleEditAble").editable(function(value, settings){
      var newATitle = value;
      var newsId = $(this).parent().parent()[0].id;
      var dataObj = {};
      dataObj["newATitle"] = newATitle;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
          method: "POST",
          url: "updatearabnewstitle",
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
     display   : 'inline',
     indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
     tooltip   : 'Click to edit...',
     onblur    : function(value){
      $(this).prev().show();
      this.reset();
     },
   });
}

function editArabNewsImage() {
    $(".aImageLinkEditAble").click(function(){
      $(this).prev().hide();
      $(this).tooltip({
        content: "Press Enter to submit"
      }).tooltip("open");
    });
    $(".aImageLinkEditAble").editable(function(value, settings){
      var newImage = value;
      var newsId = $(this).parent().parent()[0].id;
      var dataObj = {};
      dataObj["newImage"] = newImage;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
          method: "POST",
          url: "updatearabnewsimage",
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
     display   : 'inline',
     indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
     tooltip   : 'Click to edit...',
     onblur    : function(value){
      $(this).prev().show();
      this.reset();
     },
   });
}

function editArabNewsVideo() {
    $(".aVideoLinkEditAble").click(function(){
      $(this).prev().hide();
      $(this).tooltip({
        content: "Press Enter to submit"
      }).tooltip("open");
    });
    $(".aVideoLinkEditAble").editable(function(value, settings){
      var newVideo = value;
      var newsId = $(this).parent().parent()[0].id;
      var dataObj = {};
      dataObj["newVideo"] = newVideo;
      dataObj["newsId"] = newsId;
      console.log(dataObj);
      $.ajax({
          method: "POST",
          url: "updatearabnewsvideo",
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
     display   : 'inline',
     indicator : '<img src="http://classicwhitney.yuku.com/common/bypass/images/indicator.gif">',
     tooltip   : 'Click to edit...',
     onblur    : function(value){
      $(this).prev().show();
      this.reset();
     },
   });
}