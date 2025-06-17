//generic
import java.util.ArrayList;
import java.util.List;
public class Example3 
{
    public static void main(String[] args) {

    List<String> list = new ArrayList<String>();
        list.add("Andrew");
        list.add(new String("Anderson"));
        String str = new String("Jackson");
        list.add(str);
        list.add(String.valueOf(str));
        list.add(null);
        list.add("Andrew");
        System.out.println("List : "+list);
    }
}
