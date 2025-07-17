package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewDataServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                String username = request.getParameter("username");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String address = request.getParameter("address");
                
                out.print("<center><h2>Example of Hidden Form Field</h2>");
                out.print("<hr width='300'>");
                out.print("<a href='index.html'>Home</a>");
                out.print("<hr width='300'>");
                out.print("<h3>Registration Form Details</h3>");
                
                out.print("<br>Username : "+username);
                out.print("<br>Email : "+email);
                out.print("<br>Password : "+password);
                out.print("<br>Address : "+address);
                
                
                out.print("<form action='index.html'>");
                out.print("<input type='submit' value='Return to Main Page'");
                out.print("</form");
                
                out.print("</center>");
                
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
