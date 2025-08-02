//import java.util.*;
//public class Example26 
//{
//    public static void main(String[] args) {
//        Map map = new HashMap();
//        map.put(1, "Hello");
//      TreeMap<String,Map> map1 = new TreeMap<>();
//       map1.put("Mathew",map);
//
//       for(Map.Entry m : map1.entrySet()){
//         System.out.print("\nKey : "+m.getKey()+" Value : "+m.getValue());
//       }
//    }
//}

import java.util.*;

public class Example26 {
    public static void main(String[] args) {
        String[][] pairArray = {
            {"apple", "red"},
            {"banana", "yellow"},
            {"orange", "orange"}
        };

        Map<String, String> map = new HashMap<>();
        for (String[] pair : pairArray) {
            map.put(pair[0], pair[1]);
        }

        System.out.println(map);
    }
}
