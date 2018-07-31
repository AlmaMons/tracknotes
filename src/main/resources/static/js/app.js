var app = angular.module('kim',['ngMaterial', 'ngMessages', 'material.svgAssetsCache']);


app.controller('mainCtrl', function($scope,$http){

$scope.bands = [
	// NOTES
	{
		"title": "Naslov",
		"content":"Lorem ipsum dolor sit amet, consectetur adipisaefjkafeljafelefheflefaefkjlaefkjaefkjlaefaefkjaefkjefh jaefhfekhealkfjealfkjeaf   lk;jefl;keajf;lk ejaf;lkea jfle;akf eal;kfjeal;kfjea;lkfjea;lkfjeal;kfjeafljkicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.",
		"note": true, 
		"row":3,
		"col":1	
	},
	// IMAGES
	{
		"img": "http://ultimateclassicrock.com/files/2014/10/Led-Zeppelin1.jpg?w=630",
		"picture": true,
		"row":2,
		"col":1
	},
	// LINK
	{
		"url":"https://www.morrisonhotelgallery.com/images/medium/rh-metallica-blackalbum001.jpg",
		"link":true,
		"row":1,
		"col":1
	},
{
		"title": "Naslov",
		"content":"Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.",
		"note": true,
		"row":2,
		"col":1	
	},
	{
		"title": "Naslov",
		"content":"Lorem ipsum dolor sit amet, consectetur adipisicing elit.",
		"note": true,
		"row":1,
		"col":1	
	},
	{
		"title": "Naslov",
		"content":"Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.",
		"note": true,
		"row":2,
		"col":1	
	}
 ];

$scope.calculateRowSpan = function (object){
	if(!object.hasOwnProperty('content') || object.content.length<210 ){
		return 2;
	}
	console.log("content lenght" + object.content.length + "/ 210 =" + Math.round(object.content.length/210));
	return Math.round(object.content.length/210);
}


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


