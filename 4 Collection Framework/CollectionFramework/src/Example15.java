import java.util.*;
public class Example15 
{
    static void display(Stack<Integer> stack){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int num = sc.nextInt();
        
        System.out.println("Enter Elements : ");
        System.out.println(stack);
        for(int i=1;i<=num;i++){
            System.out.println("Enter element : ");
            stack.push(sc.nextInt());
            System.out.println(stack);
        }
        System.out.println("popping up the stack elements : ");
        System.out.println(stack);
            
        for(int i=1;i<=num;i++){
            stack.pop();
            System.out.println(stack);
        }
        
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        display(stack);
    }
}
