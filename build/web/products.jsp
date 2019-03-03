<%-- 
    Document   : index
    Created on : Nov 23, 2018, 3:04:59 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Our Products</title>
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
                <li><a href="index.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>               
                <li><a href="about.jsp"> <i class="fa fa-sign-in"></i> About Us</a></li>
                <li><a href="feed.jsp"> <i class="fa fa-sign-in"></i> Feedback</a></li>
                <li><a href="login.jsp"> <i class="fa fa-sign-in"></i> Login</a></li>
                
            </ul>
        </div>
    </nav>


    <br>
    <div class="container">

    </div>    
</head>

<body>

    <section class="">
            <div class="container">
                <div class="col-md-12">

                </div>
                <div class="clearfix"></div>
                <div class="col-md-12">
                    <div style="margin-top: 30px;">
                        <div style="text-align: center;border-bottom: 1px solid #757575;margin-bottom: 15px;">
                            <h3>Our Products</h3>
                        </div>
                        <table class="table table-striped table-bordered"  cellspacing="0" width="100%" role="grid" style="background-color: #fff;">

                            <tr>
                               
                                <th>Product Name</th>
                                <th>Category</th>
                                <th>Sales Price</th>
                                
                            </tr>

                            <tbody>
                                <%
                                    try {

                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                                        Statement stmt = con.createStatement();
                                        String query = "select pro_name,category,s_price from product order by pro_id asc";
                                        ResultSet rs = stmt.executeQuery(query);%>

                                <%
                                    while (rs.next()) {

                                %>
                                <tr>			
                                    
                                    <td><%=rs.getString("pro_name")%></td>
                                    <td><%=rs.getString("category")%></td>
                                    <td><%=rs.getString("s_price")%></td>
                                   
                                    
                                </tr>
                                <%
                                    }
                                %>



                            </tbody>
                        </table>
                        <%
                                rs.close();
                                stmt.close();
                                con.close();
                            } catch (Exception e) {
                                out.println("error");
                            }
                        %>
                    </div>
                </div>
            </div>
        </section>
                    
<div id="" align=center style="background-color:white;float:center;margin:5px;hight:50% ;text-align:left"> 
<p align=center>
<Marquee direction="right" width=1000>

<img src=images/6.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/7.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/8.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/9.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/10.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/11.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/12.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/13.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/14.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/15.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
<img src=images/16.jpg  width=250 height=150 style="float:left;border-radius:20px; align:center">
</marquee>
</p>
</div>
                 
                <script src="assest/jquery.min.js"></script>
                <script src="assest/jquery.form-validator.min.js"></script>
                <script>
                    $.validate({
                        // modules: 'security'
                    });
                </script>
 </div>  
                    </div> 





        </form>

        </br>
        </br>

       <!-- Footer -->
    <footer class="w3-container w3-cyan navbar-fixed-bottom">
        <div class="container_12">
            <p class="m-0 text-center text-white"> <i>&copy; All Right Reserved (IIT- Group N0 04)</i></p>
        </div>
        <!-- /.container -->
    </footer>





</body>
</html>
