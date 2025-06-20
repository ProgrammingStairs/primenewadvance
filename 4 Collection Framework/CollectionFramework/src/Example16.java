import java.util.*;
public class Example16 
{
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(200);
        queue.offer(300);
        queue.offer(400);
        
        System.out.println("Elements : "+queue);
        
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println("Element : "+itr.next());
        }
        
        System.out.println("Minimum : "+Collections.min(queue));
    }
}
