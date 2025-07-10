package controller;

import dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            System.out.println("email : "+email);
            System.out.println("password: "+password);
            
            StudentDAO studentDao = new StudentDAO();
            boolean status = studentDao.checkLogin(email,password);
            System.out.println("status login : "+status);
            if(status){
//            out.print("<center><h2>Servlet CRUD Example</h2></center>");
//            out.print("<h2>Login Successfull</h2>");
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
              RequestDispatcher rd = request.getRequestDispatcher("ProfileServlet");
              rd.forward(request, response);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
                rd.include(request, response);
                out.print("<center><h2>Incorrect Email Id or Password</h2></center>");
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
