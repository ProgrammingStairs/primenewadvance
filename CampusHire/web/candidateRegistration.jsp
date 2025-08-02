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
                <br>
                <center><h1>Candidate Registration</h1></center>
                <form action="candidateRegistrationDB.jsp" method="post">
                <div id="leftbox">
                    <div id="loginbox" >
                       
                            <input
                                type="text"
                                placeholder="Enter Username"
                                id="username"
                                name="username"
                                required
                                ><br>
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
                                type="text"
                                placeholder="Enter 10-digit Mobile Number"
                                id="contact"
                                name="contact"
                                required
                                ><br>
                            <span style="margin-left: 60px;">Select Gender &nbsp;&nbsp;</span>
                            <input
                                type="radio"
                                id="male"
                                name="gender"
                                value="male"
                                required
                                >&nbsp;&nbsp;Male&nbsp;&nbsp;
                            <input
                                type="radio"
                                id="female"
                                name="gender"
                                value="female"
                                required
                                >&nbsp;&nbsp;Female<br>
                            <input
                                type="text"
                                placeholder="Enter Address"
                                id="address"
                                name="address"
                                required
                                ><br>
                            <input
                                type="date"
                                id="date"
                                name="date"
                                required
                                ><br>
                            <input
                                type="text"
                                placeholder="Enter Qualification"
                                id="qualification"
                                name="qualification"
                                required
                                ><br>
                            <input
                                type="text"
                                placeholder="Enter Percentage"
                                id="percentage"
                                name="percentage"
                                required
                                ><br>

                       
                        <br>

                    </div>
                </div>
                <div id="rightbox">
                    <!--                        <img src="public/images/img1.png">-->


                    <input
                        type="text"
                        placeholder="Enter Experience"
                        id="experience"
                        name="experience"
                        required
                        ><br>
                    <input
                        type="text"
                        placeholder="Enter Expertise"
                        id="expertise"
                        name="expertise"
                        required
                        ><br>
                    <select id="reallocate" name="reallocate" required>
                        <option value="">Are you Reallocate ? </option>
                        <option value="yes">Yes</option>
                        <option value="yes">No</option>  
                    </select>  
                    <br>
                    <textarea
                        placeholder="Enter Career Objective"
                        id="careerObjective"
                        name="careerObjective"
                        required
                        ></textarea><br>
                    <input
                        type="submit"
                        value="Register"
                        ><br>
                    <input
                        type="reset"
                        value="Reset"
                        >
                    <br> <br>
                    <center>
                        <a style="margin-left: -240px;text-decoration: none;font-size:18px;color:#234567" href="candidateLogin.jsp">Already Registered ? Login Here</a>
                    </center>
                </div>
                </form>    
            </div>

        </div>
    </body>
</html>
