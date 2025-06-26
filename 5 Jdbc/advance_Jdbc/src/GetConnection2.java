import java.sql.Connection;
import java.sql.DriverManager;
public class GetConnection2 {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/primedb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    
    public static Connection getConnect(){
        Connection con=null;
        try{
            Class.forName(DRIVER_NAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
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
