
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo1 implements Servlet {
    ServletConfig config = null;
    @Override
    public void init(ServletConfig config) throws ServletException{}

    @Override
    public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("This is a <h1>servlet created by implementing</h1> servlet interface");
    }
    
    @Override
    public void destroy(){}
    
    @Override 
    public String getServletInfo(){
        return "This is my servlet";
    }
    
    @Override
    public ServletConfig getServletConfig(){
        return config;
    }
}
