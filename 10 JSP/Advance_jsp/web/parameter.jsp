<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:forward page="viewData.jsp">
            <jsp:param name="username" value="Andrew Anderson"></jsp:param>
            <jsp:param name="email" value="andrew@gmail.com"></jsp:param>
            <jsp:param name="address" value="Indore, India"></jsp:param>
        </jsp:forward>
    </body>
</html>
