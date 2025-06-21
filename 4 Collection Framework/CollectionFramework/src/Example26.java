import java.util.*;
public class Example26 
{
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Hello");
      TreeMap<String,Map> map1 = new TreeMap<>();
       map1.put("Mathew",map);

       for(Map.Entry m : map1.entrySet()){
         System.out.print("\nKey : "+m.getKey()+" Value : "+m.getValue());
       }
    }
}
