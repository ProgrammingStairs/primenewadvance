import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet{
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.print("This is an example of creating servlet by extending HttpServlet class");
   }
}
