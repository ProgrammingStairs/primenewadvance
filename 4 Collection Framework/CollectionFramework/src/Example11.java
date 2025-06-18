import java.util.ArrayList;
import java.util.List;
public class Example11 
{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(400);
        list2.add(500);
        list2.add(600);
        list2.add(700);
        list2.add(800);
        
//        list1.removeAll(list2);
//        System.out.println("List1 : "+list1);

//        list1.addAll(list2);
//        System.out.println("List1 : "+list1);

        list1.retainAll(list2);
        System.out.println("List1 : "+list1);

    }
}
