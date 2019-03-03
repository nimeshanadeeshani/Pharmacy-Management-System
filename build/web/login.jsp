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
        <title>Login</title>
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
                <li><a href="index.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>               
                <li><a href="about.jsp"> <i class="fa fa-sign-in"></i> About Us</a></li>
                <li><a href="products.jsp"> <i class="fa fa-sign-in"></i>Products</a></li>
                <li><a href="feed.jsp"> <i class="fa fa-sign-in"></i>Feedback</a></li>

            </ul>
        </div>
    </nav>

    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading"><h2>LOGIN</h2></div>
            <div class="panel-body">

                <div id="contents">
                    <form name="form1"  method="POST">
                        <table  class="table">
                            <tbody>
                                <tr>
                                    <td>Username</td>
                                    <td><input type="text" name="username" value="" size="33" /></td>
                                </tr>
                                <tr>
                                    <td>Password</td>
                                    <td><input type="password" name="password" value="" size="33" /></td>
                                </tr>

                                <tr>
                                    <td></td>
                                    <td style="text-align: right"><input type="submit" value="Sign In" name="btn1" /></td>
                                </tr>

                            </tbody>
                        </table>

                    </form>
                    </head>

                    <body>
                        <br>

                        <%
                            try {
                                String username = request.getParameter("username");
                                String password = request.getParameter("password");

                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                                Statement stmt = con.createStatement();
                                String query = "select * from login where username ='" + username + "'and password = '" + password + "'";

                                ResultSet rs = stmt.executeQuery(query);
                                if (rs.next()) {
                                    //session.setAttribute("uid", rs.getString("log_Id"));
                                    String ty = rs.getString("type");
                                    String lu = rs.getString("username");

                                    // response.sendRedirect("search.jsp?user="+rs.getString("type")); 
                                    if (ty.equals("admin")) {
                                        session.setAttribute("uid", rs.getString("username"));
                                        response.sendRedirect("admin.jsp?user=" + lu);

                                    } else if (ty.equals("supplier")) {
                                        session.setAttribute("uname", rs.getString("username"));

                                        response.sendRedirect("supplier.jsp?user=" + lu);
                                    }

                                } else {
                                    //out.println("<p> Invalid Login, Try with Correct Username and Password </p>");
                                }

                            } catch (Exception e) {
                                out.println("<p> ERROR: " + e.getMessage() + "</p>");
                            }

                        %>



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
