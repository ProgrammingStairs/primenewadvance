package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
                Cookie cks[] = request.getCookies();
                if(cks!=null){
                        for(Cookie c : cks){
                            if(c.getName().equals("email")){
                                    c.setMaxAge(0);
                                    response.addCookie(c);
                                    RequestDispatcher rd = request.getRequestDispatcher("login.html");
                                    rd.include(request, response);
                                    out.println("<center><h2>Logout Successfully</h2></center>");                                    
                            }
                        }
                }else{
                    RequestDispatcher rd = request.getRequestDispatcher("login.html");
                    rd.include(request, response);
                    out.println("<center><h2>Please Login First</h2></center>");
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
