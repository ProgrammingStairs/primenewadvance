package dao;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import dto.StudentDTO;
import dbConfig.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

public class StudentDAO {
    public int addStudent(StudentDTO student){
        int i=0;
        try{
            System.out.println("4");
            Connection con = GetConnection.getConnect();
            String query = "insert into student(username,email,password,address) values (?,?,?,?)";
            System.out.println("9");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, student.getUsername());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPassword());
            ps.setString(4, student.getAddress());
            
            i = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Exception : "+e);
            i=2;
        }
        return i;
    }
    
    public boolean checkLogin(String email,String password){
        boolean status=false;
        try{
             Connection con = GetConnection.getConnect();
             String query = "select * from student where email=? and password=?";
             PreparedStatement ps = con.prepareStatement(query);
             ps.setString(1, email);
             ps.setString(2, password);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 status = true;
             }
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return status;
    }
    
    public StudentDTO getDetails(String email){
        StudentDTO student = new StudentDTO();
        try{
                Connection con = GetConnection.getConnect();
                String query = "select * from student where email = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, email);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    student.setUsername(rs.getString(2));
                    student.setEmail(rs.getString(3));
                    student.setPassword(rs.getString(4));
                    student.setAddress(rs.getString(5));    
                }
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return student;
    }
    
    public int updateStudent(StudentDTO student){
        int i=0;
        try{
            System.out.println("4");
            Connection con = GetConnection.getConnect();
            String query = "update student set username=?,password=?,address=? where email=?";
            System.out.println("9");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, student.getUsername());
            ps.setString(2, student.getPassword());
            ps.setString(3, student.getAddress());
            ps.setString(4, student.getEmail());
           
            i = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Exception : "+e);
            i=2;
        }
        return i;
    }
    
        public int deActivateAccount(String email){
        int i=0;
        try{
            System.out.println("4");
            Connection con = GetConnection.getConnect();
            String query = "delete from student where email=?";
            System.out.println("9");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,email);
            i = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Exception : "+e);
            i=2;
        }
        return i;
    }


}
