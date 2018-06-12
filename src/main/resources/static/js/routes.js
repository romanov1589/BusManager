// var app = angular.module('app', []);
//
// app.controller('RoutesController', function ($scope, $http, $location, $window) {
//
//     $scope.routes = [];
//     $http.get('http://localhost:8080/allroutes')
//         .then(function (response) {
//             $scope.routes = response.data;
//             console.log("status:" + response.status);
//         }).catch(function (response) {
//         console.error('Error occurred:', response.status, response.data);
//     }).finally(function () {
//         console.log("Task Finished.");
//     });
//
//     // $scope.deleteFirm = function (firm) {
//     //     var confirmDeleting = $window.confirm('Are you sure you want to delete this firm?');
//     //     if (confirmDeleting) {
//     //         $http.delete('http://localhost:8080/allfirms/' + firm.firmId).then(function () {
//     //             $window.location.href = "/firms";
//     //         }).catch(function () {
//     //             alert("error deleting firm");
//     //         })
//     //     }
//     // };
//     //
//     // $scope.addresses = [];
//     // $http.get('http://localhost:8080/alladdresses')
//     //     .then(function (response) {
//     //         $scope.addresses = response.data;
//     //     }).catch(function (response) {
//     //     console.error('Error occurred:', response.status, response.data);
//     // }).finally(function () {
//     //     console.log("Task Finished.");
//     // });
//     //
//     // $scope.addAddress = function (firm) {
//     //     if ($scope.selectedAddress == null) {
//     //         alert("You should choose an address from List of Addresses");
//     //     }
//     //     var addressId = $scope.selectedAddress.split("-");
//     //     $http.put('http://localhost:8080/firms/' + firm.firmId + '/' + addressId[0]).then(function () {
//     //         alert("Address added to Firm!");
//     //         $window.location.href = "/firms";
//     //     }).catch(function () {
//     //         alert("error adding address to firm");
//     //     });
//     // };
//
// });

function myFunction() {
    document.getElementById("cancel").disabled = true;
}
