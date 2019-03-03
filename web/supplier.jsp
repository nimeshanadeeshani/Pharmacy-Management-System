<%-- 
    Document   : index
    Created on : Nov 23, 2018, 3:04:59 PM
    Author     : HP
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supplier</title>
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
                <a class="navbar-brand" href="index.jsp">Pharmacy</a>
            </div>
            <ul class="nav navbar-nav">

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="supplier.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>               
               <li><a href="vieworder_sup.jsp"> <i class="fa fa-sign-in"></i>Orders</a></li>
                <li><a href="logout.jsp"> <i class="fa fa-sign-in"></i>Log Out</a></li>  
            
            </ul>
        </div>
    </nav>
    
    <h1 style="color:brown; font-family:verdana; font-size:50px; text-align:center;">Supplier Page</h1>
</head>
 <body>
     
     
           <% if(session.getAttribute("uname") != null){%>
      <h1 style="text-align:center; color:blue;">Hi <%
          
        String test=  session.getAttribute("uname").toString(); out.println(test); }%>!</h1> 
       
    
        
        
        
          <img src="images/man.jpg" alt=""/> 
          
          
</div>

  <!-- Footer -->
    <footer class="w3-container w3-cyan navbar-fixed-bottom">
        <div class="container_12">
            <p class="m-0 text-center text-white"> <i>&copy; All Right Reserved (IIT- Group N0 04)</i></p>
        </div>
        <!-- /.container -->
    </footer>





</body>
</html>
