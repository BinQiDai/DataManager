<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script src="https://cdn.staticfile.org/angular.js/1.6.3/angular.min.js"></script>
</head>
<body>

<div ng-app="myApp" ng-controller="siteCtrl">

    <ul>
        <li ng-repeat="x in names">
            {{ x.Name + ', ' + x.Country }}
        </li>
    </ul>

</div>

<script>
    var app = angular.module('myApp', []);

    app.controller('siteCtrl', function($scope, $http) {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/DataManager/queryAll'
        }).then(function successCallback(response) {
            $scope.names = response.data.sites;
        }, function errorCallback(response) {
            // 请求失败执行代码
        });

    });
</script>

</body>
</html>