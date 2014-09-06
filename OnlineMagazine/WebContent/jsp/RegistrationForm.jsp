<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form of the online magazine</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>

<script type="text/javascript">

//------This function is used for the adding the new user-------//
function Signup($scope, $http){
	alert("in create role");
	$scope.addUser = function() {
	var request = $http({
	       method:'POST',
	       url:'http://localhost:8080/OnlineMagazine/api/user/add',
	       Accept:'application/json',
	       data : {
	    	   userData:{
	    	    fName:$scope.user.fName,
	    	    mName:$scope.user.mName,
	    	    lName:$scope.user.lName,
	    	    emailId:$scope.user.emailId
	    	}
	       }
	}).
	success(function(d){
		$scope.status=d;
	});

  }
} 

</script>
</head>
<body>
<div ng-controller="Signup">
<form>
First Name: 
<input data-ng-model="user.fName" type="text" required>
Middle Name: 
<input data-ng-model="user.mName" type="text" required>
Last Name: 
<input data-ng-model="user.lNname" type="text" required>
Email id:
<input data-ng-model="user.emailId" type="email"> 
<button ng-click="addUser()">Submit the data</button>
</form>
</div>
</body>
</html>