package dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    private final static String URL = "jdbc:mysql://localhost:3306/city_state";
    private final static String USER = "root";
    private final static String PASSWORD = "root";
    
    public static Connection getConnect(){
            Connection con = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(URL, USER, PASSWORD);
                if(con!=null)
                        System.out.println("Connection established successfully");
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Exception : "+e);
            }
            return con;
    } 
}
