var app = angular.module('kim',['ngMaterial', 'ngMessages', 'material.svgAssetsCache']);



app.controller('mainCtrl', function($scope,$http){

$scope.bands = [{"title": "abc", "content": "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Culpa at qui eligendi maxime corporis autem quos vel laboriosam pariatur eveniet distinctio voluptate, sint quidem, nobis maiores aperiam id consectetur. Autem culpa error fugit eaque ut accusamus labore in, earum ratione?", "note": true, "color":"gray", "row" :3 , "col":2}, 
				{"title": "slika", "content": "http://ultimateclassicrock.com/files/2014/10/Led-Zeppelin1.jpg?w=630", "picture": true,"color":"blue", "row" :1 , "col":1},
				{"title": "https://www.morrisonhotelgallery.com/images/medium/rh-metallica-blackalbum001.jpg", "content": "", "link": true, "color":"red", "row" :2 , "col":1} ];


// $http({
// 	method : "get",
// 	url : "https://danilovesovic.github.io/bands/bands.json"
// }).then(function (result){
// 	// console.log(result.data);
// 	$scope.bands = result.data;

// }, 
// function(error){
// 	console.log(error);
// })

// $scope.display=function(){
// 	console.log("radi dugme");
// }



})


