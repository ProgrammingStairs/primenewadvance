import java.sql.*;

public class JdbcExample12 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection3.getConnect();
            String query = "delete from product where pid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 1);
            ps.executeUpdate();
            System.out.println("Data deleted successfully");
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
