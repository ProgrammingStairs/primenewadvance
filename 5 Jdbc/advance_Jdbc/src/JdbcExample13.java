import java.sql.*;

public class JdbcExample13 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection3.getConnect();
            String query = "select * from product";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
            }
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
