var app = angular.module('kim',[]);


app.controller('mainCtrl', function($scope,$http){

// https://danilovesovic.github.io/bands/bands.json

$scope.bands = [];


$http({
	method : "get",
	url : "https://danilovesovic.github.io/bands/bands.json"
}).then(function (result){
	//console.log(result.data);
	$scope.bands = result.data;

}, 
function(error){
	console.log(error);
})





})


