/*var myApp=angular.module('magazineApp',[]);
alert("efeff");
$scope.newEmployee = {}; 
myApp.controller('AddUsers',function($scope,$http) {
	alert("insiderrrrr");
	console.log($scope.newEmployee.fName);
    	$scope.insertUsers=$http({
	       method:'POST',
	       url:'http://localhost:8080/OnlineMagazine/api/user/add',
	       Accept:'application/json',
	       data : 
	       {
	    	   "userData":{
	    	   "fName":$scope.newEmployee.fName,
	    	   "mName":$scope.newEmployee.mName,
	    	   "lName":$scope.newEmployee.lName,
	    	   "emailId":$scope.newEmployee.emailId
	    	   
	    	   
	    	   "userData":{
		    	   "fName":"Koontal",
		    	   "mName":"Kumar",
		    	   "lName":"Ghosh",
		    	   "emailId":"koontalnsec89@gmail.com"
	    	}
    	}
	}).
	success(function(data){
		$scope.status=data;
	});
    });


function AddUsers($scope, $http) {
    var authToken;

    $http.get('/auth.py').success(function(data, status, headers) {
      authToken = headers('A-Token');
      $scope.user = data;
    });

    $scope.insertUsers = function(message) {
     // var headers = { 'Authorization': authToken };
      $scope.status = 'Saving...';

      $http.post('/add-msg.py', message, { headers: headers } ).success(function(response) {
        $scope.status = '';
      }).error(function() {
        $scope.status = 'ERROR!';
      });
    };
  

*/

/*
var myApp=angular.module('magazineApp',[]);
alert("efeff");
$scope.user = {};

myApp.controller('AddUsers',function(){};){
	
}*/






$scope.insertUsers=function(){  $http({
	       method:'POST',
	       url:'http://localhost:8080/OnlineMagazine/api/user/add',
	       Accept:'application/json',
	       data : 
	       {
	    	   "userData":{
	    	   "fName":$scope.user.fName,
	    	   "mName":$scope.user.mName,
	    	   "lName":$scope.user.lName,
	    	   "emailId":$scope.user.emailId

	    	}
    	}
	}).
	success(function(data){
		$scope.status=data;
	}); }; 