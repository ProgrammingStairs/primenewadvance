package connection;
import java.sql.*;
public class DbConfig {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/campushire";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static Connection getConnect(){
        Connection con=null;
            try{
                Class.forName(DRIVER_NAME);
                con = DriverManager.getConnection(URL,USER,PASS);
                if(con!=null)
                        System.out.println("Connection established successfully");
            }catch(SQLException | ClassNotFoundException e){
                System.out.println("Exception : "+e);
            }
        return con;
    }
}
