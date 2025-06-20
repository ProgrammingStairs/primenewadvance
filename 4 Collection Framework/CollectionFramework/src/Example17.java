import java.util.*;
public class Example17 
{
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        /*
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        */
        // if element not found it will gives you exception
//        System.out.println("element(): "+queue.element());
//        System.out.println("Elements : "+queue);
        
        // if element not found it will gives you null
//        System.out.println("peek(): "+queue.peek());
//        System.out.println("Elements : "+queue);

 // if element not found it will gives you exception
//        System.out.println("remove(): "+queue.remove());
//        System.out.println("Elements : "+queue);

 // if element not found it will gives you null
        System.out.println("poll(): "+queue.poll());
        System.out.println("Elements : "+queue);

    }
}
