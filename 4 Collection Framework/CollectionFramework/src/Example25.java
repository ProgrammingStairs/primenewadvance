import java.util.*;
public class Example25 
{
    public static void main(String[] args) {
      LinkedHashMap<String,String> map = new LinkedHashMap<>();
       map.put("26/01/2025","Republic Day");
       map.put("15/08/2025","Independence Day");
       map.put("2/10/2025","Gandhi Jayanti");

       for(Map.Entry m : map.entrySet()){
         System.out.print("\nKey : "+m.getKey()+" Value : "+m.getValue());
       }
    }
}
