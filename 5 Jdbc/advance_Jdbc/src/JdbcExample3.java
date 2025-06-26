
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample3 {
    public static void main(String[] args) {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/primedb", "root", "root");
            if(con!=null)
                System.out.println("connection established successfully");
            else
                System.out.println("Error while connecting");
            
            Statement stmt = con.createStatement();
            String query = "create table student(rno int primary key auto_increment,name varchar(45) not null, email varchar(45) not null,per double default 0)";
            stmt.execute(query);
            System.out.println("Table created successfully");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
