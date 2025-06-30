import java.sql.*;

public class JdbcExample18 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection3.getConnect();
//            String query = "select orders.orderid,customers.custname from orders inner join customers  on orders.custid = customers.custid";

// String query = "select orders.orderid,customers.custname from orders left outer join customers  on orders.custid = customers.custid";

String query = "select orders.orderid,customers.custname from orders right outer join customers  on orders.custid = customers.custid";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("Exception : "+ex);
        }
    }
}
