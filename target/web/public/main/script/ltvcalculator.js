jQuery(document).ready(function($) {

	$("#calculateButton").click(CalculateLTV);
	
})

function CalculateLTV() {
	var arpdauTime = $("#ARPDAUSelect").val();
	var retentionTime = $("#retentionSelect").val();
	var arpdauFromDate = $("#ARPDAUFromInput").val();
	var arpdauToDate = $("#ARPDAUToInput").val();
	var retentionFromDate = $("#retentionFromInput").val();
	var retentionToDate = $("#retentionToInput").val();
	var platform = $("#platformSelect").val();
	var dataObj = {};
	dataObj["arpdauTime"] = arpdauTime;
	dataObj["retentionTime"] = retentionTime;
	dataObj["arpdauFromDate"] = arpdauFromDate;
	dataObj["arpdauToDate"] = arpdauToDate;
	dataObj["retentionFromDate"] = retentionFromDate;
	dataObj["retentionToDate"] = retentionToDate;
	dataObj["platform"] = platform;
	$.ajax({
		url: "getltvvalue",
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