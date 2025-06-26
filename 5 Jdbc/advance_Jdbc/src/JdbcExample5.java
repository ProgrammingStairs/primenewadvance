import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter name : ");
        String name = sc.nextLine();
    
        System.out.println("Enter Email : ");
        String email = sc.nextLine();
        
        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/primedb", "root", "root");
            if(con!=null)
                System.out.println("connection established successfully");
            else
                System.out.println("Error while connecting");
            
            Statement stmt = con.createStatement();
            String query = "insert into student(name,email,per) values('"+name+"','"+email+"',"+per+")";
            int i = stmt.executeUpdate(query);
            if(i>0)
                System.out.println("Data inserted successfully");
            else
                System.out.println("Data not inserted");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
