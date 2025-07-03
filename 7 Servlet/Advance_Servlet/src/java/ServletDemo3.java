
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/PrintServlet","/TryServlet"})
//@WebServlet("/PrintServlet")
public class ServletDemo3 extends GenericServlet{
    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("Example of creating servlet by extending GenericServlet class");
    } 
}
