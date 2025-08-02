package dao;

import dbConfig.GetConnection;
import java.util.ArrayList;
import dto.CityDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CityDAO {
    public ArrayList<CityDTO> getCityList(int stateId){
         ArrayList<CityDTO> list = new ArrayList<>(); 
        try {
            Connection con =  GetConnection.getConnect();
            String query = "select * from city where stateid = "+stateId;
            PreparedStatement ps =  con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CityDTO city = new CityDTO();
                city.setCityId(rs.getInt(1));
                city.setStateId(rs.getInt(2));
                city.setCityName(rs.getString(3));
                list.add(city);
            }
        } catch (Exception e) {
            System.out.println("Exception : "+e);
        }
        return list;
    }
}
