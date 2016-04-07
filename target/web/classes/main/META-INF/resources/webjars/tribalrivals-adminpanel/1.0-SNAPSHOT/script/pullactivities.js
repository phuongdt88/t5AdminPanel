jQuery(document).ready(function($) {
	$("#generateReportButton").click(GenerateReport);
})

function GenerateReport() {
	var platform = $("#platformSelect").val();
	var metric = $("#metricSelect").val();
	var fromDate = $("#fromDate").val();
	var toDate = $("#toDate").val();
	var exportType = $("#exportTypeSelect").val();
	var dataObj = {};
	dataObj["platform"] = platform;
	dataObj["metric"] = metric;
	dataObj["fromDate"] = fromDate;
	dataObj["toDate"] = toDate;
	dataObj["exportType"] = exportType;

	$.ajax({
		url: "createreport",
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