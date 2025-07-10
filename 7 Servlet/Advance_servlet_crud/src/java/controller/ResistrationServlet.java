package controller;

import dto.StudentDTO;
import dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResistrationServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("1");
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            
            StudentDTO student = new StudentDTO();
            System.out.println("2");
            student.setUsername(username);
            student.setEmail(email);
            student.setPassword(password);
            student.setAddress(address);
            
            StudentDAO studDao = new StudentDAO();
            System.out.println("3");
            int i = studDao.addStudent(student);
            if(i==1){
                System.out.println("Registration Succcessfull");
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
                rd.include(request, response);
                out.print("<center><h2>Registration Successfull</h2></center>");
            }else if (i==2){
                System.out.println("Duplicate Entry");
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.include(request, response);
                out.print("Duplicate Entry | Please Try Again");
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
