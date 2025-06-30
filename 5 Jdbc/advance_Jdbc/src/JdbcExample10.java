import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample10 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection2.getConnect();
            String query = "insert into product(pname,pqty,price) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "Comb");
            ps.setString(2, "100 units");
            ps.setDouble(3, 100);
            ps.executeUpdate();
            System.out.println("Data Inserted successfully");
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
