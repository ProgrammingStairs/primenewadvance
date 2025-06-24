
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample1 {
    public static void main(String[] args) {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            if(con!=null)
                System.out.println("connection established successfully");
            else
                System.out.println("Error while connecting");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
