import java.sql.*;

public class JdbcExample15 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection3.getConnect();
            String query = "select * from product";
            PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
            rs.absolute(3);
//rs.first();
//rs.beforeFirst();
//rs.last();
//rs.afterLast();
            while(rs.previous()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
            }
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
