<%-- 
    Document   : vieworder_sup.jsp
    Created on : Nov 25, 2018, 2:24:06 PM
    Author     : Windows
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="assest/bootstrap.min.css">
        <script src="assest\jquery-3.2.1.js"></script>
        <script src="assest/bootstrap.min.js"></script>
         <link rel="stylesheet" href="assest/w3.css">
           <link rel="stylesheet" href="assest/font-awesome-4.7.0/css/font-awesome.min.css">


    </head>
    <body>


        <nav class="w3-bar w3-cyan" style="background-color:light brown">

            <div class="container-fluid">
                <div class="navbar-header" >
                    <a class="navbar-brand" href="#">Pharmacy</a >
                </div>
                 <ul class="nav navbar-nav navbar-right">
                <li><a href="supplier.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>
                <li><a href="logout.jsp"> <i class="fa fa-sign-in"></i>Log Out</a></li>  
                 
                
            </ul>
            </div>
        </nav>
            <script>
            
    function smessage(){
        
            
    alert("Order Accepted");

       
        
    }
     function rmessage(){
        
            
    alert("Order Rejected");

       
        
    }

        </script>         
                    
        <div class="container">
            <div class="panel panel-default">
                <div class="panel-heading" align="left"><h2> Manage Orders</h2></div>
                <div class="panel-body">
                    <table  border='1' class="table">
                        
                        
                
                        <tr><th>Product Name</th><th>Qty</th><th>Order Date</th><th>Expected Date</th><th colspan="2">Action</th></tr>
                         <%
                            
                             String uname = session.getAttribute("uname").toString();
                             
                             
                          
                            try {

                                Class.forName("com.mysql.jdbc.Driver");

                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                                Statement stmt = con.createStatement();
                                String state="pending";
                                String query1 = "SELECT * FROM supplier where username='"+uname+"' ";
                                ResultSet rs1 = stmt.executeQuery(query1);
                                
                                while (rs1.next()) {
                                    String uid=rs1.getString(1);
                                String query = "SELECT * FROM orders where sup_id='"+uid+"' AND state='"+state+"' ";
                                ResultSet rs = stmt.executeQuery(query);


                        %>
                        <%            while (rs.next()) {
                        %>
                        <tr>
                            <td>  <%=rs.getString(3)%>     </td>
                            <td>  <%=rs.getString(4)%>  </td>
                            <td> <%=rs.getString(7)%> </td>
                            <td> <%=rs.getString(8)%> </td>
                              
                            <td> <a href="accept.jsp?id=<%out.println(rs.getString(1));%>" onclick="smessage()"style="background-color:#49743D;font-weight:bold;color:#ffffff;">Accept</a></td>
                            <td> <a href="reject.jsp?id=<%out.println(rs.getString(1));%>" onclick="rmessage()"style="background-color:#ff0000;font-weight:bold;color:#ffffff;" >Reject</a></td>
                           
                            
                            
                            
                          
                            
                            
                            
                            
                         
                        </tr>

                        <%    }}

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
