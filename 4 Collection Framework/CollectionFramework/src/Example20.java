import java.util.*;
class StudentNew{
    int rno;
    String name;

    public StudentNew(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
    @Override
    public String toString(){
        return rno+" "+name;
    }
}
public class Example20 
{
    public static void main(String[] args) {
        StudentNew s1 = new StudentNew(101, "Andrew Anderson");
        StudentNew s2 = new StudentNew(102, "Mathew Math");
        StudentNew s3 = new StudentNew(101, "Andrew Anderson");
        StudentNew s4 = s1;
        
        HashSet<StudentNew> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        
        for(StudentNew s : set){
            System.out.println(s);            
        }
    }
}
