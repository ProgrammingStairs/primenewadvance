package dbConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class GetConnection {
    public static Connection getConnect(){
        Connection con = null;
        try{
            System.out.println("5");
            Class.forName(GetDetails.DRIVER_CLASS);
            con = DriverManager.getConnection(GetDetails.URL, GetDetails.USER, GetDetails.PASSWORD);
            System.out.println("---------------con : "+con);
                    
            if(con!=null)
                System.out.println("Connection established successfully");
            
            System.out.println("6");
            String query = "create database if not exists primeadvdb";
            Statement stmt = con.createStatement();
            stmt.execute(query);
            System.out.println("7");
           String query1 = "use primeadvdb";
            Statement stmt1 = con.createStatement();
            stmt1.execute(query1);
    String tableQuery = "create table if not exists student(sid int primary key auto_increment,username varchar(45) not null,email varchar(45) not null unique,password varchar(45) not null, address varchar(45) not null)";
    stmt.execute(tableQuery);
    System.out.println("8");
        System.out.println("You can proceed further..");
            
        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
        return con;
    } 
}
