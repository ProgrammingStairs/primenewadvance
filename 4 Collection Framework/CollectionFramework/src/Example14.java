


import java.util.*;
public class Example14 
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("isEmpty : "+stack.empty());
        System.out.println(stack);
        stack.add(100);
        System.out.println(stack);
        stack.add(200);
        System.out.println(stack);
        stack.add(300);
        System.out.println(stack);
        stack.add(400);
        System.out.println(stack);
        stack.add(500);
        System.out.println(stack);
        System.out.println("isEmpty : "+stack.empty());
        System.out.println("search : "+stack.search(1000));
        
//        Iterator itr = stack.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next()); 
//        }
//        
//        System.out.println("peek : "+stack.peek());
//        System.out.println("elements : "+stack);
//        System.out.println("pop : "+stack.pop());
//        System.out.println("elements : "+stack);
//        stack.push(900);
//        System.out.println("elements : "+stack);
        

    }
}
