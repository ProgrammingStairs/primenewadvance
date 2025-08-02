package dao;

import connection.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {
        public int adminLogin(String email,String password){
            int i=0;
            try{
                  Connection con = DbConfig.getConnect();
                  String query = "select * from admin where email=? and password=?";
                  PreparedStatement ps = con.prepareStatement(query);
                  ps.setString(1, email);
                  ps.setString(2, password);
                  
                  ResultSet  rs = ps.executeQuery();
                  if(rs.next())
                        i=1;
            }catch(Exception e){
                System.out.println("Exception occured in adminLogin : "+e);
            }
            return i;
        }
}
