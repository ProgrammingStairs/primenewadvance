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

public class DeActivateUserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("email");
            StudentDAO studentDao = new StudentDAO();
            int i = studentDao.deActivateAccount(email);
            if(i>0){
                    session.setAttribute("email", null);
                    session.invalidate();
                    out.print("<script>alert('Logout Successfully')</script>");
                    response.sendRedirect("index.html");
            }else{
                
            }
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
