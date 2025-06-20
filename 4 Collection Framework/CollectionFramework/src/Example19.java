import java.util.*;
public class Example19 
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(200);
        
        for(int num : set){
            System.out.println("Elements : "+num);            
        }
    }
}
