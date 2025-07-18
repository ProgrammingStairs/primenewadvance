<%@page contentType="text/html" errorPage="errorPage.jsp" pageEncoding="UTF-8"%>
<%@include  file="number1.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                int num1 = Integer.parseInt(request.getParameter("num1"));
                int num2 = Integer.parseInt(request.getParameter("num2"));
                
                int res = num1/num2;
                out.print("Result : "+res);
        %>
    </body>
</html>
