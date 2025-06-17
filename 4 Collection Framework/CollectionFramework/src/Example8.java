//generic
import java.util.ArrayList;
import java.util.Collections;
class Student{
    int rno;
    String name;
    double per;
    Student(int rno,String name,double per){
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
    @Override
    public String toString(){
        return rno+" "+name+" "+per+"\n";
    }
}
public class Example8 
{
    public static void main(String[] args) {
        Student s1 = new Student(102,"Peter Parker",49.34);
        Student s2 = new Student(101,"Quresh Anderon",60.45);
        Student s3 = new Student(103,"Mathew Math",98.43);

        ArrayList<Student> stud = new ArrayList<>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        //System.out.println("Students : "+stud);
        for(Student s : stud){
            System.out.println(s);
        }
    }
}
