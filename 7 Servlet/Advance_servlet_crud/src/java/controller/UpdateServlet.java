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

public class UpdateServlet extends HttpServlet {
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
            int i = studDao.updateStudent(student);
            if(i==1){
                System.out.println("Profile Updated Succcessfull");
                RequestDispatcher rd = request.getRequestDispatcher("ProfileServlet");
                out.print("<script>alert('Profile Updated Successfully');</script>");
                rd.include(request, response);
            }else if (i==2){
                System.out.println("Something went wrong");
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                 out.print("<script>alert('Something went wrong');</script>");
                rd.include(request, response);
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
