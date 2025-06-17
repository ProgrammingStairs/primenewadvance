//generic
import java.util.ArrayList;
import java.util.Collections;
public class Example7 
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(89);
        list.add(123);
        list.add(2);
        list.add(273);
        System.out.println("List : "+list);
    System.out.println("Minimum Element : "+Collections.min(list));
    System.out.println("Maximum Element : "+Collections.max(list));
    Collections.shuffle(list);
    System.out.println("Shuffle : "+list);
    Collections.sort(list);
    System.out.println("Sort : "+list);
    Collections.reverse(list);
    System.out.println("Reverse : "+list);
    
    }
}
