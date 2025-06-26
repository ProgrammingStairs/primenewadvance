import java.sql.Connection;
import java.sql.DriverManager;
public class GetConnection1 {
    public static Connection getConnect(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/primedb", "root", "root");
            if(con!=null)
                System.out.println("connection established successfully");
            else
                System.out.println("Error while connecting");
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return con;
    }
}
