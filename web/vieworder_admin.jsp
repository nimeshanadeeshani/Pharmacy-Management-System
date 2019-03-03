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
        <title>Admin</title>
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
                <li><a href="admin.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>               
                <li><a href="viewpro.jsp"> <i class="fa fa-sign-in"></i>Products</a></li>
                <li><a href="view_sup.jsp"> <i class="fa fa-sign-in"></i>Suppliers</a></li> 
                <li><a href="order.jsp"> <i class="fa fa-sign-in"></i>Orders</a></li>
                <li><a href="view_feed.jsp"> <i class="fa fa-sign-in"></i> View Feedback</a></li>
                <li><a href="logout.jsp"> <i class="fa fa-sign-in"></i>Log Out</a></li>  
            
            </ul>
        </div>
    </nav>
<div class="container">
            <div class="panel panel-default">
                <div class="panel-heading" align="left"><h2> View Orders</h2></div>
                <div class="panel-body"
                     <h2><a href="order.jsp">Place New Order</a></h2>
                    <table  border='1' class="table">



                        <tr><th>Order ID</th><th>Product Name</th><th>Qty</th><th>Supplier Name</th><th>Order Date</th><th>Expected Date</th><th>State</th></tr>
                          <%
                           
                            try {

                                Class.forName("com.mysql.jdbc.Driver");

                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                                Statement stmt = con.createStatement();
                               // 
                                String query = "SELECT * FROM orders";
                                ResultSet rs = stmt.executeQuery(query);


                        %>
                        <%            while (rs.next()) {
                        %>
                        <tr>
                            <td>  <%=rs.getString(1)%>     </td>
                            <td>  <%=rs.getString(3)%>  </td>
                            <td> <%=rs.getString(4)%> </td>
                            <td> <%=rs.getString(6)%> </td>
                            <td> <%=rs.getString(7)%> </td>
                            <td> <%=rs.getString(8)%> </td>
                            <td> <%=rs.getString(9)%> </td>
                            
                            
                            
                          
                            
                            
                            
                            
                         
                        </tr>

                        <%    }

                            } catch (Exception e) {

                            }%>




                    </table>



                </div>
            </div>  
        </div>  
        <!-- Footer -->
        <footer class="w3-container w3-cyan navbar-fixed-bottom">
            <div class="container_12">
                <p class="m-0 text-center text-white">Copyright &copy;RAD GROUP-G-2017</p>
            </div>
            <!-- /.container -->
        </footer> 


    </body>
</html>