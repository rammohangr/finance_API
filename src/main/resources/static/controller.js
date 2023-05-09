var financeApp = angular.module('financeApp', []);

financeApp.controller('financeController', function($scope, $http){
	document.getElementById("companyData").style.visibility = "hidden";
	document.getElementById("errorData").style.visibility = "hidden";
	
	$scope.searchCompany=function(){
		console.log($scope.company);
		var url= "/v1/finance/stockdetails?company=";
		var result = $http.get(url+$scope.company).success(function(data){
			if(data.row.price == "N/A"){
				console.log("Undefined Symbol");
				document.getElementById("errorData").style.visibility = "visible";
				$scope.showData = false;
			}else{
				console.log("Valid Symbol");
				console.log(data.row.symbol);
				document.getElementById("errorData").style.visibility = "hidden";
				document.getElementById("companyData").style.visibility = "visible";
				$scope.showData = true;
				$scope.Symbol = data.row.symbol;
				$scope.Price = data.row.price;
				$scope.Date = data.row.date;
				$scope.Time = data.row.time;
				$scope.Change = data.row.change;
				$scope.PreviousClose = data.row.previousClose;
				$scope.High = data.row.high;
				$scope.Low = data.row.low;
				$scope.Volume = data.row.volume;
			}
		});
	};
});