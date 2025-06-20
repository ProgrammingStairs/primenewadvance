import java.util.*;
public class Example18 
{
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(100);
        queue.add(200);
        queue.offer(300);
        queue.offer(400);
        queue.offerFirst(1);
        queue.offerLast(2);
        
        System.out.println("Elements : "+queue);
        
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println("Element : "+itr.next());
        }
        
        System.out.println("Minimum : "+Collections.min(queue));
//        System.out.println("removeFirst : "+queue.removeFirst());
//        System.out.println("removeLast: "+queue.removeLast());
//        System.out.println("Elements : "+queue);
//        System.out.println("pollFirst : "+queue.pollFirst());
//        System.out.println("pollLast: "+queue.pollLast());
//System.out.println("Elements : "+queue);
        System.out.println("peekFirst : "+queue.peekFirst());
        System.out.println("peekLast: "+queue.peekLast()); 
System.out.println("Elements : "+queue);
    }
}
