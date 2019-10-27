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

</head>
<body ng-app="myApp" ng-controller="myCtrl">

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
app.controller("myCtrl", function($scope) {
    $scope.kotas = ${Kotas};
    $scope.drinks = ${Drinks};
    $scope.others = ${Others};
});
</script>
                                <!-- <h5><a href="#" class="btn-primaryc plr-25"><b>SEE TODAYS MENU</b></a></h5> -->
                        </div><!-- dplay-tbl-cell -->
                </div><!-- dplay-tbl -->
        </div><!-- container -->
</section>

<section>
        <div class="container">
                <div class="heading">
                        <!-- <img class="heading-img" src="Lib/img/heading_logo.png" alt=""> -->
                        <h2>Our Menu</h2>
                </div>

                <div class="row">
                        <div class="col-sm-12">
                                <ul class="selecton brdr-b-primary mb-70">
                                        <li><a class="active" href="#" data-select="*"><b>ALL</b></a></li>
                                        <li><a href="#" data-select="kotas"><b>KOTAS</b></a></li>
                                        <li><a href="#" data-select="drinks"><b>DRINKS</b></a></li>
                                        <li><a href="#" data-select="others"><b>OTHERS</b></a></li>
                                </ul>
                        </div><!--col-sm-12-->
                </div><!--row-->

                <div class="row">
                        <div class="col-md-6 food-menu kotas" ng-repeat="k in kotas">
                                <div class="sided-90x mb-30 ">
                                        <div class="s-left"><img class="br-3" src="Lib/img/menu-1-120x120.jpg" alt="Menu Image"></div><!--s-left-->
                                        <div class="s-right">
                                                <h5 class="mb-10"><b>{{k.name}}</b><b class="color-primary float-right">R {{k.price}}</b></h5>
                                                <p class="pr-70">Maecenas fermentum tortor id fringilla molestie. In hac habitasse platea dictumst. </p>
                                        </div><!--s-right-->
                                </div><!-- sided-90x -->
                        </div><!-- food-menu -->

                        <div class="col-md-6 food-menu drinks"  ng-repeat="d in drinks">
                                <div class="sided-90x mb-30 ">
                                        <div class="s-left"><img class="br-3" src="Lib/img/menu-2-120x120.jpg" alt="Menu Image"></div><!--s-left-->
                                        <div class="s-right">
                                                <h5 class="mb-10"><b>{{d.name}}</b><b class="color-primary float-right">R {{d.price}}</b></h5>
                                                <p class="pr-70">Proin dictum viverra varius. Etiam vulputate libero dui, at pretium elit elementum quis. </p>
                                        </div><!--s-right-->
                                </div><!-- sided-90x -->
                        </div><!-- food-menu -->

                        <div class="col-md-6 food-menu others"  ng-repeat="o in others">
                                <div class="sided-90x mb-30 ">
                                        <div class="s-left"><img class="br-3" src="Lib/img/menu-3-120x120.jpg" alt="Menu Image"></div><!--s-left-->
                                        <div class="s-right">
                                                <h5 class="mb-10"><b>{{o.name}}</b><b class="color-primary float-right">R {{o.price}}</b></h5>
                                                <p class="pr-70">Maecenas fermentum tortor id fringilla molestie. In hac habitasse platea dictumst. </p>
                                        </div><!--s-right-->
                                </div><!-- sided-90x -->
                        </div><!-- food-menu -->

                </div><!-- row -->

                <!-- <h6 class="center-text mt-40 mt-sm-20 mb-30"><a href="#" class="btn-primaryc plr-25"><b>SEE TODAYS MENU</b></a></h6> -->
        </div><!-- container -->
</section>


<section class="story-area bg-seller color-white pos-relative">
        <div class="pos-bottom triangle-up"></div>
        <div class="pos-top triangle-bottom"></div>
        <div class="container">
                <div class="heading">
                        <!-- <img class="heading-img" src="Lib/img/heading_logo.png" alt=""> -->
                        <h2>Today's Special</h2>
                </div>

                <div class="row">
                        <div class="col-lg-3 col-md-4  col-sm-6 ">
                                <div class="center-text mb-30">
                                        <div class="ïmg-200x mlr-auto pos-relative">
                                                <h6 class="ribbon-cont"><div class="ribbon primary"></div><b>OFFER</b></h6>
                                                <img src="Lib/img/seller-2-200x200.png" alt="">
                                        </div>
                                        <h5 class="mt-20">Pizza Margherita</h5>
                                        <h4 class="mt-5"><b>$11.90</b></h4>
                                        <h6 class="mt-20"><a href="#" class="btn-brdr-primary plr-25"><b>Order Now</b></a></h6>
                                </div><!--text-center-->
                        </div><!-- col-md-3 -->

                        <div class="col-lg-3 col-md-4  col-sm-6 ">
                                <div class="center-text mb-30">
                                        <div class="ïmg-200x mlr-auto pos-relative"><img src="Lib/img/seller-2-200x200.png" alt=""></div>
                                        <h5 class="mt-20">Pizza Margherita</h5>
                                        <h4 class="mt-5"><b>$11.90</b></h4>
                                        <h6 class="mt-20"><a href="#" class="btn-brdr-primary plr-25"><b>Order Now</b></a></h6>
                                </div><!--text-center-->
                        </div><!-- col-md-3 -->

                        <div class="col-lg-3 col-md-4  col-sm-6 ">
                                <div class="center-text mb-30">
                                        <div class="ïmg-200x mlr-auto pos-relative"><img src="Lib/img/seller-2-200x200.png" alt=""></div>
                                        <h5 class="mt-20">Pizza Margherita</h5>
                                        <h4 class="mt-5"><b>$11.90</b></h4>
                                        <h6 class="mt-20"><a href="#" class="btn-brdr-primary plr-25"><b>Order Now</b></a></h6>
                                </div><!--text-center-->
                        </div><!-- col-md-3 -->

                </div><!-- row -->

                <!-- <h6 class="center-text mt-40 mt-sm-20 mb-30"><a href="#" class="btn-primaryc plr-25"><b>SEE TODAYS MENU</b></a></h6> -->
        </div><!-- container -->
</section>


<section class="story-area left-text center-sm-text pos-relative">
        <div class="abs-tbl bg-2 w-20 z--1 dplay-md-none"></div>
        <div class="abs-tbr bg-3 w-20 z--1 dplay-md-none"></div>
        <div class="container">
                <div class="heading">
                       <!-- <img class="heading-img" src="Lib/img/heading_logo.png" alt=""> -->
                        <h2>Our Story</h2>
                </div>

                <div class="row">
                        <div class="col-md-6">
                                <p class="mb-30">Maecenas fermentum tortor id fringilla molestie. In hac habitasse
                                        platea dictumst. Morbi maximus
                                        lobortis ipsum, ut blandit augue ullamcorper vitae.
                                        Nulla dignissim leo felis, eget cursus elit aliquet ut. Curabitur vel convallis
                                        massa. Morbi tellus
                                        tortor, luctus et lacinia non, tincidunt in lacus.
                                        Vivamus sed ligula imperdiet, feugiat magna vitae, blandit ex. Vestibulum id
                                        dapibus dolor, ac
                                        cursus nulla. </p>
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