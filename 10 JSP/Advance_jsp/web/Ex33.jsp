<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%= "Welcome " + (String)session.getAttribute("email") %>
        </h1>
        
        <a href="Ex11.jsp">Go Back</a>
    </body>
</html>
