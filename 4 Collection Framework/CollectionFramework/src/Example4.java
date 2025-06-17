//generic
import java.util.ArrayList;
import java.util.List;
public class Example4 
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println("List : "+list);
        list.set(2, 250);
        System.out.println("List : "+list);
        list.remove(2);
        System.out.println("List : "+list);
        list.remove(new Integer(400));
        System.out.println("List : "+list);
        System.out.println("Element : "+list.get(2));
    }
}
