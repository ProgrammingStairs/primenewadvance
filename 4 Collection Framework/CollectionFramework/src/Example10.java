import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class StudentNewDemo{
    int rno;
    String name;
    double per;
    StudentNewDemo(int rno,String name,double per){
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
    @Override
    public String toString(){
        return rno+" "+name+" "+per+"\n";
    }
}
class SortByRno implements Comparator<StudentNewDemo>{
    @Override
    public int compare(StudentNewDemo s1, StudentNewDemo s2){
        return s1.rno-s2.rno;
    }
}
class SortByPer implements Comparator<StudentNewDemo>{
    @Override
    public int compare(StudentNewDemo s1, StudentNewDemo s2){
        if(s1.per>s2.per)
            return 1;
        else if(s1.per<s2.per)
            return -1;
        else
            return 0;
    }
}
class SortByName implements Comparator<StudentNewDemo>{
    @Override
    public int compare(StudentNewDemo s1, StudentNewDemo s2){
        return s1.name.compareTo(s2.name);
    }
}

public class Example10 
{
    public static void main(String[] args) {
      StudentNewDemo s1 = new StudentNewDemo(102,"Peter Parker",90.94);
      StudentNewDemo s2 = new StudentNewDemo(101,"Quresh Anderon",49.45);
      StudentNewDemo s3 = new StudentNewDemo(103,"Mathew Math",98.43);

        ArrayList<StudentNewDemo> stud = new ArrayList<>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        //System.out.println("Students : "+stud);
        for(StudentNewDemo s : stud){
            System.out.println(s);
        }
        Collections.sort(stud, new SortByRno());
        System.out.println("Sorting based on Roll Number : ");
        System.out.println(stud);

        Collections.sort(stud, new SortByPer());
        System.out.println("Sorting based on Percentage : ");
        System.out.println(stud);

        Collections.sort(stud, new SortByName());
        System.out.println("Sorting based on Name : ");
        System.out.println(stud);

    }
}
