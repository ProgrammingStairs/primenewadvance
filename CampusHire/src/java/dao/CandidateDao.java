package dao;

import connection.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dto.CandidateDto;

public class CandidateDao {
    public int addCandidate(CandidateDto candidate){
            int i=0;
            try{
                  Connection con = DbConfig.getConnect();
                  String query = "insert into candidate(username,email,password,contact,gender,address,date,qualification,percentage,experience,expertise,reallocate,careerObjective) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement ps = con.prepareStatement(query);
                  ps.setString(1, candidate.getUsername());
                  ps.setString(2, candidate.getEmail());
                  ps.setString(3, candidate.getPassword());
                  ps.setString(4, candidate.getContact());
                  ps.setString(5, candidate.getGender());
                  ps.setString(6, candidate.getAddress());
                  ps.setString(7, candidate.getDate());
                  ps.setString(8, candidate.getQualification());
                  ps.setString(9, candidate.getPercentage());
                  ps.setString(10, candidate.getExperience());
                  ps.setString(11, candidate.getExpertise());
                  ps.setString(12, candidate.getReallocate());
                  ps.setString(13, candidate.getCareerObjective());
                    i = ps.executeUpdate();
                 }catch(Exception e){
                System.out.println("Exception occured in adminLogin : "+e);
            }
            return i;
        }
    
    public int candidateLogin(String email,String password){
            int i=0;
            try{
                  Connection con = DbConfig.getConnect();
                  String query = "select * from candidate where email=? and password=?";
                  PreparedStatement ps = con.prepareStatement(query);
                  ps.setString(1, email);
                  ps.setString(2, password);
                  
                  ResultSet  rs = ps.executeQuery();
                  if(rs.next())
                        i=1;
            }catch(Exception e){
                System.out.println("Exception occured in candidateLogin : "+e);
            }
            return i;
        }
}
