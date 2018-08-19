var app = angular.module('kim',['ngMaterial', 'ngMessages', 'material.svgAssetsCache']);


app.controller('mainCtrl', function($scope, $http,$mdDialog){

$scope.bands = [
// 	// NOTES
// 	{
// 		"title": "Naslov",
// 		"content":"Lorem ipsum dolor sit amet, consectetur adipisaefjkafeljafelefljkoijKALEheflefaefkjlaefkjaefkjlaefaefkjaefkjefh jaefhfekhealkfjealfkjeaf   lk;jefl;keajf;lk ejaf;lkea jfle;akf eal;kfjeal;kfjea;lkfjea;lkfjeal;kfjeafljkicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.",
// 		"note": true, 
// 		"row":3,
// 		"col":1	
// 	},
// 	// IMAGES
// 	{
// 		"img": "http://ultimateclassicrock.com/files/2014/10/Led-Zeppelin1.jpg?w=630",
// 		"picture": true,
// 		"row":2,
// 		"col":1
// 	},
// 	// LINK
// 	{
// 		"url":"https://www.morrisonhotelgallery.com/images/medium/rh-metallica-blackalbum001.jpg",
// 		"link":true,
// 		"row":1,
// 		"col":1
// 	},
// {
// 		"title": "Naslov",
// 		"content":"Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.",
// 		"note": true,
// 		"row":2,
// 		"col":1	
// 	},
// 	{
// 		"title": "Naslov",
// 		"content":"Lorem ipsum dolor sit amet, consectetur adipisicing elit.",
// 		"note": true,
// 		"row":1,
// 		"col":1	
// 	},
// 	{
// 		"title": "Naslov",
// 		"content":"Lorem ipsum dolor sit amet.Lorem ipsum dolor sit amet.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus, delectus.Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat repellendus consectetur sapiente temporibus, doloremque aliquid nesciunt minima in voluptas quasi adipisci. Enim excepturi a ratione iste, fugit laborum temporibus harum minus ut sunt officia quas eligendi asperiores voluptas tempora dolor.",
// 		"note": true,
// 		"row":2,
// 		"col":1	
// 	}

 ];

$scope.calculateRowSpan = function (object){
	if(!object.hasOwnProperty('content') || object.content.length<210 ){
		return 2;
	}
	console.log("content lenght" + object.content.length + "/ 210 =" + Math.round(object.content.length/210));
	return Math.round(object.content.length/210);
}


$scope.getAll=function(){ }


$scope.getImages=function(){

	$http({
		method : "get",
		url : "http://localhost:8080/api/image"
	}).then(function (result){
		// console.log(result.data);
		var res = result.data;
		res.forEach(function(entry) {
   			 entry.img = true;
			});
		return res;		
	}, 
	function(error){
		console.log(error);
	}) }

$scope.getLinks=function(){
	$http({
		method : "get",
		url : "http://localhost:8080/api/link"
	}).then(function (result){
		// console.log(result.data);
		var res = result.data;
		res.forEach(function(entry) {
   			 entry.link = true;
			});
		return res;		
	}, 
	function(error){
		console.log(error);
	}) }

	
$scope.getNotes=function(){	
	$http({
		method : "get",
		url : "http://localhost:8080/api/note"
	}).then(function (result){
		// console.log(result.data);
		var res = result.data;
		res.forEach(function(entry) {
   			 entry.note = true;
			});
		return res;		
	}, 
	function(error){
		console.log(error);
	})
	console.log($scope.bands);

}





 $scope.modalInputText = 'note';

$scope.getAll=function(){ 

	var res1= $scope.getNotes();
	var res2= $scope.getLinks();
	var res3= $scope.getImages();

	$scope.bands= [].concat.apply([], [res1, res2, res3]);


}




// $scope.openModal= function (){
// 	console.log("dugme radi");
// }


 $scope.showPrerenderedDialog = function(ev) {
    $mdDialog.show({
      contentElement: '#myDialog',
      parent: angular.element(document.body),
      targetEvent: ev,
      clickOutsideToClose: true
    });
  };

   $scope.showPrerenderedDialog2 = function(ev1) {
    $mdDialog.show({
      contentElement: '#myDialog2',
      parent: angular.element(document.body),
      targetEvent: ev1,
      clickOutsideToClose: true
    });
  };

})






