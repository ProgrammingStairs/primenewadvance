import java.sql.*;

public class JdbcExample17 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection3.getConnect();
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("DriverName : "+dbmd.getDriverName());
            System.out.println("DriverVersion : "+dbmd.getDriverVersion());
            System.out.println("DatabaseProductName : "+dbmd.getDatabaseProductName());
            System.out.println("DatabaseProductVersion : "+dbmd.getDatabaseProductVersion());

            String query = "select * from product";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("ColumnCount : "+rsmd.getColumnCount());
            System.out.println("ColumnName : "+rsmd.getColumnName(2));
          System.out.println("ColumnTypeName : "+rsmd.getColumnTypeName(2));
 
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
