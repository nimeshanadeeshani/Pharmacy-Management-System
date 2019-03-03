<%-- 
    Document   : index
    Created on : Nov 23, 2018, 3:04:59 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="assest/bootstrap.min.css">
        <link rel="stylesheet" href="assest/w3.css">
        <link rel="stylesheet" href="assest/font-awesome-4.7.0/css/font-awesome.min.css">
        <script src="assest/bootstrap.min.js"></script>


        <script src="assest/jquery-3.2.1.js"></script>
        <script src="assest/bootstrap.min.js"></script>
    <nav class="w3-bar w3-cyan" style="background-color:light brown">

        <div class="container-fluid">
            <div class="navbar-header" >
                <a class="navbar-brand" href="#">Pharmacy</a>
            </div>
            <ul class="nav navbar-nav">

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="selected"><a href="index.jsp"> <i class="fa fa-home"></i>Home</a></li>               
                <li><a href="about.jsp"> <i class="fa fa-sign-in"></i> About Us</a></li>
                <li><a href="login.jsp"> <i class="fa fa-sign-in"></i> Login</a></li>
                <li><a href="products.jsp"> <i class="fa fa-flag"></i>Products</a></li>
                <li><a href="feed.jsp"> <i class="fa fa-comments-o"></i>Feedback</a></li>
            </ul>
        </div>
    </nav>


    <br>
    <div class="container">
        <div id="carousel-example" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carousel-example" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example" data-slide-to="1"></li>
                <li data-target="#carousel-example" data-slide-to="2"></li>
            </ol>

            <div class="carousel-inner">
                <div class="item active">
                    <a href="#"><img src="images/1.jpg" height="50%" width="100%"/></a>
                    <div class="carousel-caption">
                        <h3 style="color:black"> Welcome to SUWA SEWANA Pharmacy </h3>
                    </div>
                </div>
                <div class="item">
                    <a href="#"><img src="images/2.jpg"  height="30%" width="100%"/></a>
                    <div class="carousel-caption">
                        <h3 style="color:black" >Healthy and Wellness</h3>

                    </div>
                </div>
                <div class="item">
                    <a href="#"><img src="images/3.jpg" height="30%" width="100%" /></a>
                    <div class="carousel-caption">
                        <h3 style="color:black">Take care Your selves</h3>

                    </div>
                </div>
                
                     <div class="item">
                    <a href="#"><img src="images/4.jpg"  height="30%" width="100%"/></a>
                    <div class="carousel-caption">
                        <h3 style="color:black"> Welcome to SUWA SEWANA Pharmacy </h3>

                    </div>
                </div>
               
            </div>

            <a class="left carousel-control" href="#carousel-example" data-slide="prev">
                <i class="fa fa-arrow-left"></i>
            </a>
            <a class="right carousel-control" href="#carousel-example" data-slide="next">
                <i class="fa fa-arrow-right"></i>
            </a>
        </div>
    </div>    
</head>

<body>
    <br>



    <!-- Footer -->
    <footer class="w3-container w3-cyan navbar-fixed-bottom">
        <div class="container_12">
            <p class="m-0 text-center text-white"> <i>&copy; All Right Reserved (IIT- Group N0 04)</i></p>
        </div>
        <!-- /.container -->
    </footer>





</body>
</html>
