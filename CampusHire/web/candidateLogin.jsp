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
            <div id="nav">
                <ul>
                    <li><a href="">Home</a></li>
                    <li><a href="">Sevices</a></li>
                   <li><a href="">About</a></li>
                    <li><a href="">Contact</a></li>
                    <li><a href="candidateLogin.jsp">Login</a></li>
                </ul>
            </div>
                <!--Banner Section-->
            <div id="box">
                <div id="leftbox">
                    <div id="loginbox" >
                        <center><h1>Candidate Login</h1></center> <br>
                        <form action="candidateLoginDB.jsp" method="post">
                            <input
                                type="email"
                                placeholder="Enter Email"
                                id="email"
                                name="email"
                                required
                            ><br>
                            <input
                                type="password"
                                placeholder="Enter Password"
                                id="password"
                                name="password"
                                required
                            ><br>
                            <input
                                type="submit"
                                value="Login"
                            ><br>
                            <input
                                type="reset"
                                value="Reset"
                            >
                        </form>
                        <br>
                        <center>
                            <a style="text-decoration: none;font-size:18px;color:#234567" href="candidateRegistration.jsp">Yet Not Registered ? Register Here</a>
                        </center>
                    </div>
                </div>
                <div id="rightbox">
                        <img src="public/images/img1.png">
                </div>
            </div>
            
        </div>
    </body>
</html>
