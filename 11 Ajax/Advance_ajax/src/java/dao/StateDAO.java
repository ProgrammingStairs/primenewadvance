package dao;

import dbConfig.GetConnection;
import java.util.ArrayList;
import dto.StateDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StateDAO {
    public ArrayList<StateDTO> getStateList(){
         ArrayList<StateDTO> list = new ArrayList<>(); 
        try {
            Connection con =  GetConnection.getConnect();
            String query = "select * from state";
            PreparedStatement ps =  con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                StateDTO state = new StateDTO();
                state.setStateId(rs.getInt(1));
                state.setStateName(rs.getString(2));
                list.add(state);
            }
        } catch (Exception e) {
            System.out.println("Exception : "+e);
        }
        return list;
    }
}
