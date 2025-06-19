import java.util.*;
public class Example12 
{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(700); // works with respect to addFirst, comes after addFirst irrespective of add method
        list.add(100);
        list.addFirst(200);
        list.add(400);
        list.add(null);
        list.add(200);
      
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("Element : "+itr.next()); 
        }
        System.out.println("Size : "+list.size());
    }
}
