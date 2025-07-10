package controller;

import dao.StudentDAO;
import dto.StudentDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateFormServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("<center><h2>Servlet CRUD Example</h2></center>");
            out.print("<link href='style.css' rel='stylesheet'>");
            out.print("<div id='demo'><center>");

            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("email");
            StudentDAO studentDao = new StudentDAO();
            StudentDTO student = studentDao.getDetails(email);
//            System.out.println("email : " + email);
            out.print("Welcome " + email + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
            out.print("<a id='astyle' href=''>Update Profile</a>&nbsp;&nbsp;");
            out.print("&nbsp;&nbsp;&nbsp;<a id='astyle' href=''>Logout</a>");
            out.print("</center></div>");

            out.print("<div id='demo1'><center><h2>Update Profile Page</h2>");
            out.print("<form action='UpdateServlet' method='post'>");
            out.print("<input value='"+student.getUsername()+"' type='text' placeholder='Enter Username' id='username' name='username'> <br>");
            out.print("<input readonly value='"+student.getEmail()+"' type='email' placeholder='Enter Email' id='email' name='email'> <br>");
            out.print("<input value='"+student.getPassword()+"' type='password' placeholder='Enter Password' id=password' name='password'> <br>");
            out.print("<textarea placeholder='Enter Address' id='address' name='address'>"+student.getAddress()+"</textarea> <br>");
            out.print("<input type='submit' value='Update'>");
            out.print("<input type='reset' value='Reset'>");
            out.print("</form></center><div>");
        } catch (Exception e) {
            System.out.println("Exception : " + e);
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
