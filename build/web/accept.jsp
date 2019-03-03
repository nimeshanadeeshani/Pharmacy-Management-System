<%-- 
    Document   : accept
    Created on : Nov 25, 2018, 7:16:55 PM
    Author     : Isuru
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
try {
    String ide = request.getParameter("id");
    int num = Integer.parseInt(ide);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
        Statement stmt = con.createStatement();

        
        String state="accepted";
        int a = stmt.executeUpdate("UPDATE orders SET state='" +state+ "' WHERE order_id='" +num+ "'");
        if (a > 0) {
 
        response.sendRedirect("vieworder_sup.jsp");

        }

    } catch (Exception e) {
        out.println("unsuccess");
        System.out.println(e.getMessage());
    }
%>