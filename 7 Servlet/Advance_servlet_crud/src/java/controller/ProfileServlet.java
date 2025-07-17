package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("<center><h2>Servlet CRUD Example</h2></center>");
            out.print("<link href='style.css' rel='stylesheet'>");
            out.print("<div id='demo'><center>");
            
            HttpSession session = request.getSession();
            String email = (String)session.getAttribute("email");
            System.out.println("email : "+email);
            out.print("Welcome "+email+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
          out.print("<a id='astyle' href='UpdateFormServlet'>Update Profile</a>&nbsp;&nbsp;");
          out.print("<a id='astyle' href='DeActivateUserServlet'>DeActivate Profile</a>&nbsp;&nbsp;");
          out.print("&nbsp;&nbsp;&nbsp;<a id='astyle' href='LogoutServlet'>Logout</a>");
            out.print("</center></div>");  
            out.print("<div style='padding:30px'><h2>Welcome to Profile Page</h2><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit.</p></div>");
        }
        catch(Exception e){
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
