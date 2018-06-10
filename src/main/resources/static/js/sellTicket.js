var app = angular.module('app', []);
app.controller('SellTicketController', function ($scope, $http, $location, $window) {

    $scope.sellTicket = function () {
        var url = "http://localhost:8080/sellticket";
        var data = {
            "arrivalBusStop": $scope.arrival,
            "departureBusStop": $scope.departure,
            "price": $scope.price,
            "clientFirstName": $scope.firstName,
            "clientLastName": $scope.lastName,
            "clientPhone": $scope.phoneNumber,
            "clientEmail": $scope.clientEmail,
            "status": "sold"

        };
        $http.post(url, data).then(function () {
            $window.location.href = "/routes";
        })
            .catch(function () {
                alert("error adding new ticket");
            });
    };

});