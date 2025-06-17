// non generic
import java.util.ArrayList;
public class Example1 
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(10.560);
        list.add("100");
        list.add('A');
        list.add(true);
        list.add(-234);
        System.out.println("List : "+list);
    }
}
