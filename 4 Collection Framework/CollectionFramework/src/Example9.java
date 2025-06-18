//generic
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
class StudentDemo implements Comparable<StudentDemo>{
    int rno;
    String name;
    double per;
    StudentDemo(int rno,String name,double per){
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
//    @Override
//    public int compareTo(StudentDemo s){
////        return rno-s.rno;
//          return s.rno-rno;
//    } 
       
    @Override
    public int compareTo(StudentDemo s){
       if(per>s.per)
           return 1;
       else if(per<s.per)
           return -1;
       else
           return 0;
    }

//    @Override
//    public int compareTo(StudentDemo s){
//        return name.compareTo(s.name);
//    }
    
    @Override
    public String toString(){
        return rno+" "+name+" "+per+"\n";
    }
}
public class Example9 
{
    public static void main(String[] args) {
      StudentDemo s1 = new StudentDemo(102,"Peter Parker",49.94);
      StudentDemo s2 = new StudentDemo(101,"Quresh Anderon",49.45);
      StudentDemo s3 = new StudentDemo(103,"Mathew Math",98.43);

        ArrayList<StudentDemo> stud = new ArrayList<>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        //System.out.println("Students : "+stud);
        for(StudentDemo s : stud){
            System.out.println(s);
        }
        Collections.sort(stud);
    //    System.out.println("Sorting based on Roll Number : ");
//        System.out.println("Sorting based on Percentage : ");
        System.out.println("Sorting based on Name : ");

System.out.println(stud);
    }
}
