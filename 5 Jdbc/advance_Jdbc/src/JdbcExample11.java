import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample11 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection3.getConnect();
            String query = "update product set pname=? where pid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "Cream");
            ps.setInt(2, 3);
            ps.executeUpdate();
            System.out.println("Data updated successfully");
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
