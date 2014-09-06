<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html data-ng-app="magazineApp">
<title>Sign up form Made By Koontal</title>
<head>
<script type="text/javascript" src="WEB-INF/Angular/js/angular/angular.min.js"></script>
<script type="text/javascript" src="WEB-INF/Angular/js/angular/AddEmployeeController.js"></script>
</head>
<body>
<div data-ng-controller="AddEmployee">
First Name: 
<input data-ng-model="newEmployee.name" type="text">
Phone Number:
<input data-ng-model="newEmployee.phone" type="text"> 
<!-- <button ng-click="insertEmployee()" type="button">Add Employee</button> -->
<input type="button" value="Add Employee" ng-click="insertEmployee()" /></br>
<br>
{{status.status}}
</div>
</body>
</html>