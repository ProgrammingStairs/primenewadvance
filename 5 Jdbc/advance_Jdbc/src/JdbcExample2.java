
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample2 {
    public static void main(String[] args) {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            if(con!=null)
                System.out.println("connection established successfully");
            else
                System.out.println("Error while connecting");
            
            Statement stmt = con.createStatement();
            String query = "create database if not exists primedb";
            stmt.execute(query);
            System.out.println("Database created successfully");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
