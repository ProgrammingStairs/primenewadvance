<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="public/css/style.css" >

    </head>
    <body>
        <div id="container">
            <!--Header section-->
            <div id="header">
                <img src="public/images/logo.png" alt="logo" id="logo">
                <span id="heading">CampusHire | Candidate Panel</span>
            </div>
            
            <!-- Navbar section-->
            <%
                String email = (String)session.getAttribute("email");
            %>
            <div id="nav">
                <ul>
                    <li><a href="">Welcome  <%=email%></a></li>
                   <li><a href="">Logout</a></li>
                </ul>
            </div>
                <!--Banner Section-->
            <div id="box">
                <div id="leftbox">
                    <div id="loginbox" >
                    </div>
                </div>
                <div id="rightbox">
                        <img src="public/images/img1.png">
                </div>
            </div>
            
        </div>
    </body>
</html>
