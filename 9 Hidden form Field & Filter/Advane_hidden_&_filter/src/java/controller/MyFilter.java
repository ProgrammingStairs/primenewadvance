package controller;

import java.io.*;
import javax.servlet.*;

public class MyFilter implements Filter {
    
    public MyFilter() {}    
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        try {
            PrintWriter out = response.getWriter();
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            if(email.equals("admin@gmail.com") && password.equals("admin@123"))
                      chain.doFilter(request, response);
            else{
                RequestDispatcher rd = request.getRequestDispatcher("home.html");
                rd.include(request, response);
                out.println("<center><h3>Login InSuccessfull</h3></center>");
            }
        } catch (Throwable t) {
            System.out.println("Exception : "+t);
        }
    }

    public void destroy() {}
    public void init(FilterConfig filterConfig) {}
}
