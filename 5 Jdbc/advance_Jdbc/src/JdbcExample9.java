import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample9 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            String query = "create table product(pid int primary key auto_increment,pname varchar(11) not null,pqty varchar(45) not null,price double not null)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();
            System.out.println("Table created successfully");
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
