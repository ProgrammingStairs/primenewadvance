package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            if(email.equals("admin@gmail.com") && password.equals("admin@123")){
                // setting up the cookie
                Cookie cookie = new Cookie("email", email);
                cookie.setMaxAge(60*60*24);
                response.addCookie(cookie);
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.include(request, response);
                out.print("<center><h2>Credential Sets | Now You can Access Profile Servlet</h2></center>");
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
                rd.include(request, response);
                out.print("<center><h2>Invalid EmailId or Password</h2></center>");
            }
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
