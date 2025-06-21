import java.util.*;
public class Example24 
{
    public static void main(String[] args) {
       HashMap<Integer,String> map = new HashMap<>();
       map.put(101, "STUD1001");
       map.put(102, "STUD1002");
       map.put(103, "STUD1003");
       map.put(104, "STUD1004");

       for(Map.Entry m : map.entrySet()){
         System.out.print("\nKey : "+m.getKey()+" Value : "+m.getValue());
         if(m.getKey().equals(new Integer(102)))
               System.out.print("-------Ranker------");
       }
    }
}
