<%-- 
    Document   : adddoc
    Created on : 13-Nov-2017, 01:41:30
    Author     : Hasanka
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="assest/bootstrap.min.css">
        <script src="assest\jquery-3.2.1.js"></script>
        <script src="assest/bootstrap.min.js"></script>
           <link rel="stylesheet" href="assest/font-awesome-4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="assest/jquery-ui-1.12.1.custom/jquery-ui.css">
      <link rel="stylesheet" href="assest/w3.css">
        <script src="assest/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker();
                $("#datepicker").datepicker("option", "dateFormat", "DD, dd-mm-yy");
            });
        </script>


    </head>
    <body>

<nav class="w3-bar w3-cyan" style="background-color:light brown">

        <div class="container-fluid">
            <div class="navbar-header" >
                <a class="navbar-brand" href="#">Pharmacy</a>
            </div>
            <ul class="nav navbar-nav">

            </ul>
            <ul class="nav navbar-nav navbar-right">
               <li><a href="admin.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>               
                <li><a href="viewpro.jsp"> <i class="fa fa-sign-in"></i>Products</a></li>
                <li><a href="view_sup.jsp"> <i class="fa fa-sign-in"></i>Suppliers</a></li> 
                <li><a href="vieworder_admin.jsp"> <i class="fa fa-sign-in"></i>Orders</a></li>
                <li><a href="view_feed.jsp"> <i class="fa fa-sign-in"></i> View Feedback</a></li>
                <li><a href="logout.jsp"> <i class="fa fa-sign-in"></i>Log Out</a></li> 
            </ul>
        </div>
    </nav>


    <br>
    <div class="container">

    </div>    
</head>

<body>


    <div class="panel-heading"><h2>ORDER FORM</h2></div>
    <div class="panel-body">

        <form action="order.jsp" method="POST">
          
                  <div class="form-group row 	col-sm-10">
                <label class="control-label col-sm-2" >Product Name:</label>
                <div class="col-sm-8">
                    <select class="form-control" name="productname" id="productname">
                        <%
                    Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root","");
    Statement s = con.createStatement();

ResultSet re = s.executeQuery("select * from product");
while(re.next())
{
String un=re.getString("pro_name");


%>
<option value="<%= un%>"><%= un%></option>

 
<% 
}
%>
                    </select>
                </div>
            </div>
                   
                  
            <div class="form-group row 	col-sm-10">
                <label class="control-label col-sm-2" >Qty:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="qty" data-validation="required"  >
                </div>
            </div>

          
            <div class="form-group row 	col-sm-10">
                <label class="control-label col-sm-2" >Supplier Name</label>
                <div class="col-sm-8">
                    <select class="form-control"name="supname" id="supname">
                        <%
                    

ResultSet re2 = s.executeQuery("select * from supplier");
while(re2.next())
{
    
    
String un=re2.getString("name");
     
 
 
 
%>
<option value="<%= un%>"><%= un%></option>



<% 
}
%>
                    </select>
                </div>
            </div>
                    
                
                    
             <div class="form-group row col-sm-10">
                <label class="control-label col-sm-2"for="spe">Select Date:</label>
               <div class="col-sm-8">
                                <input type="text" class="form-control" id="datepicker" name="edate" data-validation="required">
                            </div>   
            </div>
                                
                                  <div class="form-group row col-sm-10">        
                <div class="col-sm-offset-2 col-sm-10">

                                 <button type="submit" value="submit" name="submit" class="btn btn-default">order</button>

                            </div>
                        </div>




                    </div>

                             </form>

 
                        

        <%
                               if (request.getParameter("submit")  != null) {
                                 
       
        String proname=request.getParameter("productname");
        String qty=request.getParameter("qty");
       
        String sname=request.getParameter("supname");
        String edate=request.getParameter("edate");

        
        Date date1 = new Date();
      
String today = new String("");
SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
today = format.format(date1);


          

    
    try{
        String sid="";
        String pid="";
    
    
 ResultSet re3 = s.executeQuery("select * from product where pro_name='"+proname+"'");
while(re3.next())
{
    
    
 pid=re3.getString("pro_id");
}
 ResultSet re4 = s.executeQuery("select * from supplier where name='"+sname+"'");
while(re4.next())
{
    
    
sid=re4.getString("sup_id");

}   
    
    String query = "INSERT INTO orders(pro_id,pro_name,qty,sup_id,sup_name,expected_date,order_date)VALUES('"+pid+"','"+proname+"','"+qty+"','"+sid+"','"+sname+"','"+edate+"','"+today+"')";
    
   int a= s.executeUpdate(query);
            
    if(a>0)
    {
         %>
        <script>
            
    alert("Successfully oredered");

        </script>
    <%
    
    }
    
    
   } 
    
    
    catch(Exception e){
        out.println("Error:"+ e.getMessage());
    }
                               }
                                 
    
    %>
                         <script src="assest/jquery.form-validator.min.js"></script>
                <script>
            $.validate({
                // modules: 'security'
            });
            
            
            
                </script>
                
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
