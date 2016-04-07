jQuery(document).ready(function($) {
	GetDashBoardData();
})

$("#platformSelect").change(GetDashBoardData);

function GetDashBoardData() {
	var platform = $("#platformSelect").val();
	var dataObj = {};
	dataObj["platform"] = platform;
	$.ajax({
		url: "getDashboardData",
		method: "POST",
		data: dataObj
	})
	.done(function(resData) {
		console.log(resData);
	})
	.fail(function(xhr, status, error) {
		showLoadingBar(100);
  	toastr.error(status, "Error", opts);
	})
}
