
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample4 {
    public static void main(String[] args) {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/primedb", "root", "root");
            if(con!=null)
                System.out.println("connection established successfully");
            else
                System.out.println("Error while connecting");
            
            Statement stmt = con.createStatement();
            String query = "insert into student(name,email,per) values('Mathew Math','mathew@gmail.com',67)";
            stmt.execute(query);
            System.out.println("Data inserted successfully");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
