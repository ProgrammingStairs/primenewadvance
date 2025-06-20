import java.util.*;
public class Example21 
{
    public static void main(String[] args) {
        HashSet<String> fruitstore = new HashSet<>();
        LinkedHashSet<String> fruitmarket = new LinkedHashSet<>();
        TreeSet<String> fruitbuzz = new TreeSet<>();
        
        for(String fruitName : Arrays.asList("Mango","Banana","Apple","Grapes")){
            fruitstore.add(fruitName);
            fruitbuzz.add(fruitName);
            fruitmarket.add(fruitName);
        }
        
        System.out.println("HashSet(No Insertion order) : "+fruitstore);
        System.out.println("LinkedHashSet(Maintain insertion order) : "+fruitmarket);
        System.out.println("TreeSet(ascending order) : "+fruitbuzz);

    }
}
