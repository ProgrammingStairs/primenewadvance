//generic
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Example5 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println("List : "+list);
    }
}
