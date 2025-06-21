import java.util.*;
public class Example23 
{
    public static void main(String[] args) {
       HashMap map = new HashMap();
       map.put(101, "STUD1001");
       map.put(102, "STUD1002");
       map.put("STUD1003",103);
       map.put(104, "STUD1004");
       
       Set set = map.entrySet();
       Iterator itr = set.iterator();
       while(itr.hasNext()){
//           System.out.println(""+itr.next());
            Map.Entry m = (Map.Entry)itr.next();
            System.out.println("Key : "+m.getKey()+" Value : "+m.getValue());
       }
    }
}
