import java.util.*;
public class Example22 
{
    public static void main(String[] args) {
        Set<Integer> num;
        long startTime,endTime;
        
        num = new HashSet<>();
        startTime = System.nanoTime();
        for(int i=1;i<=100;i++){
            num.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by HashSet : "+(endTime-startTime));
        
        num = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for(int i=1;i<=100;i++){
            num.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by LinkedHashSet : "+(endTime-startTime));
        
        num = new TreeSet<>();
        startTime = System.nanoTime();
        for(int i=1;i<=100;i++){
            num.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by TreeSet : "+(endTime-startTime));
    }
}
