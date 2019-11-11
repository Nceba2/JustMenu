<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Map" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
        <title>Just Menu</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="UTF-8">

        <!-- Font -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600" rel="stylesheet">
        <link rel="stylesheet" href="Lib/css/fonts/beyond_the_mountains-webfont.css" type="text/css"/>

        <!-- Stylesheets -->
        <link href="Lib/plugin-frameworks/bootstrap.min.css" rel="stylesheet">
        <link href="Lib/plugin-frameworks/swiper.css" rel="stylesheet">
        <link href="Lib/fonts/ionicons.css" rel="stylesheet">
        <link href="Lib/common/styles.css" rel="stylesheet">

        <script src="Lib/js/angular.min.js"></script>
        <script src="Lib/js/controllers.js"></script>

</head>
<body ng-app="myApp" ng-controller="cartCtrl">

<header>
        <div class="container">
                <!-- <a class="logo" href="#"><img src="Lib/img/logo-white.png" alt="Logo"></a> -->

                <div class="right-area">
                        <h6><a class="plr-20 color-white btn-fill-primary" href="#">ORDER: +34 685 778 8892</a></h6>
                </div><!-- right-area -->

                <a class="menu-nav-icon" data-menu="#main-menu" href="#"><i class="ion-navicon"></i></a>

                <ul class="main-menu font-mountainsre" id="main-menu">
                        <li><a href="index.html">HOME</a></li>
                        <li><a href="02_about_us.html">ABOUT US</a></li>
                        <li><a href="03_menu.html">SERVICES</a></li>
                        <li><a href="04_blog.html">NEWS</a></li>
                        <li><a href="05_contact.html">CONTACT</a></li>
                </ul>

                <div class="clearfix"></div>
        </div><!-- container -->
</header>


<section class="bg-1 h-900x main-slider pos-relative">
        <div class="triangle-up pos-bottom"></div>
        <div class="container h-100">
                <div class="dplay-tbl">
                        <div class="dplay-tbl-cell center-text color-white">

                                <h5><b>BEST IN TOWN</b></h5>
                                <h1 class="mt-30 mb-15" ><u>Kota King</u></h1>

<script>
var app = angular.module("myApp", []);
app.controller("cartCtrl", function($scope) {
$scope.cartitems = ${cartArray};
$scope.cartprices = ${cartArrayPrices};

console.log("cartArray length: " + $scope.cartitems.length);

    var n = 0;
    var list ="";
    while(n < $scope.cartitems.length){
        list += '<div class="col-md-6">' + $scope.cartitems[n] + "</div>"+'<div class="col-md-6"> R ' + $scope.cartprices[n] + "</div>";
        n++;
    }

        $("#CartList").html(list);
});
</script>
                                <!-- <h5><a href="#" class="btn-primaryc plr-25"><b>SEE TODAYS MENU</b></a></h5> -->
                        </div><!-- dplay-tbl-cell -->
                </div><!-- dplay-tbl -->
        </div><!-- container -->
</section>

<section class="story-area left-text center-sm-text pos-relative">
        <div class="abs-tbl bg-2 w-20 z--1 dplay-md-none"></div>
        <div class="abs-tbr bg-3 w-20 z--1 dplay-md-none"></div>
        <div class="container">
                <div class="heading">
                       <!-- <img class="heading-img" src="Lib/img/heading_logo.png" alt=""> -->
                        <h2>Your Order</h2>
                </div>

                <div class="row">
                        <div class="col-md-6">
                        <h4><u>Items</u></h1>
                        <p>
                        <div class="row" id="CartList">
                        </div>
                        </p>

                        <h4>total: R ${cartArrayTotalPrice}</h4>
                        </div><!-- col-md-6 -->

                        <div class="col-md-6">
                                <p class="mb-30">Maecenas fermentum tortor id fringilla molestie. In hac habitasse platea
                                        dictumst.Morbi maximus lobortis ipsum, ut blandit augue ullamcorper vitae.
                                        Nulla dignissim leo felis, eget cursus elit aliquet ut. Curabitur vel
                                        convallismassa. Morbi tellus tortor, luctus et lacinia non, tincidunt in lacus.
                                        Vivamus sed ligula imperdiet, feugiat magna vitae, blandit ex. Vestibulumidda
                                        pibus dolor, accursus nulla. </p>
                        </div><!-- col-md-6 -->
                </div><!-- row -->
        </div><!-- container -->
</section>

<footer class="pb-50  pt-70 pos-relative">
        <div class="pos-top triangle-bottom"></div>
        <div class="container-fluid">
                <a href="index.html"><img src="Lib/img/logo-white.png" alt="Logo"></a>

                <div class="pt-30">
                        <p class="underline-secondary"><b>Address:</b></p>
                        <p>481 Creekside Lane Avila Beach, CA 93424 </p>
                </div>

                <div class="pt-30">
                        <p class="underline-secondary mb-10"><b>Phone:</b></p>
                        <a href="tel:+53 345 7953 32453 ">+53 345 7953 32453 </a>
                </div>

                <div class="pt-30">
                        <p class="underline-secondary mb-10"><b>Email:</b></p>
                        <a href="mailto:yourmail@gmail.com"> yourmail@gmail.com</a>
                </div>

                <ul class="icon mt-30">
                        <li><a href="#"><i class="ion-social-pinterest"></i></a></li>
                        <li><a href="#"><i class="ion-social-facebook"></i></a></li>
                        <li><a href="#"><i class="ion-social-twitter"></i></a></li>
                        <li><a href="#"><i class="ion-social-dribbble-outline"></i></a></li>
                        <li><a href="#"><i class="ion-social-linkedin"></i></a></li>
                        <li><a href="#"><i class="ion-social-vimeo"></i></a></li>
                </ul>

                <p class="color-light font-9 mt-50 mt-sm-30"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy; <script>document.write(new Date().getFullYear());</script> All rights reserved | Nceba Sobikwa</a>
        </div><!-- container -->
</footer>

<!-- SCIPTS -->
<script src="Lib/plugin-frameworks/jquery-3.2.1.min.js"></script>
<script src="Lib/plugin-frameworks/bootstrap.min.js"></script>
<script src="Lib/plugin-frameworks/swiper.js"></script>
<script src="Lib/common/scripts.js"></script>

</body>
</html>