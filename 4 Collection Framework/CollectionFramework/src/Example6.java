//generic
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Example6 
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
        // Method-1
        //System.out.println("List : "+list);
   
        // Method-2
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println("element : "+itr.next());
//        }
        
        // Method-3
//        for(Iterator itr = list.iterator();itr.hasNext();){
//            System.out.println("element : "+itr.next());
//        }

        //Method-4
//        ListIterator itr = list.listIterator();
//        System.out.println("Forward Direction");
//        while(itr.hasNext()){
//            System.out.print("\t"+itr.next());
//        }
//        System.out.println("\nBackward Direction");
//        while(itr.hasPrevious()){
//            System.out.print("\t"+itr.previous());
//        }
//        System.out.println("\nsize : "+list.size());

        // Method-5
        for(int element : list){
            System.out.println("element : "+element);
        }
    }
}
