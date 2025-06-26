import java.sql.Connection;
import java.sql.DriverManager;
public class GetConnection3 {
    
    public static Connection getConnect(){
        Connection con=null;
        try{
            Class.forName(GetDetails.DRIVER_NAME);
            con = DriverManager.getConnection(GetDetails.URL, GetDetails.USERNAME, GetDetails.PASSWORD);
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
