<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String address = request.getParameter("address");

        out.print("<br>Username : "+username);
        out.print("<br>email: "+email);
        out.print("<br>address : "+address);

        %>
        
    </body>
</html>
