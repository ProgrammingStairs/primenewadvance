<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="dto.UserDTO"></jsp:useBean>
        <jsp:setProperty name="obj" property="*"></jsp:setProperty>
        
        <h2>Show Details : </h2>
        Roll Number : <jsp:getProperty name="obj" property="rno" ></jsp:getProperty> <br>
        Username :  <jsp:getProperty name="obj" property="name" ></jsp:getProperty> <br>
        Address : <jsp:getProperty name="obj" property="address" ></jsp:getProperty>
    </body>
</html>
