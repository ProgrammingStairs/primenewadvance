import java.util.*;
public class Example13 
{
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.addElement("Andrew");
        vec.add("Jackson");
        vec.add(2, "Mathew");
        vec.addElement(new String("Peter"));
        String str = new String("Jack");
        vec.add(str);
        
        Enumeration em = vec.elements();
        while(em.hasMoreElements()){
            System.out.println("Element : "+em.nextElement());
        }
        
        ListIterator list = vec.listIterator();
        System.out.println("Forward direction : ");
        while (list.hasNext()) {
            System.out.print("\t"+list.next());
        }
        System.out.println("\nBackward direction : ");
        while (list.hasPrevious()) {
            System.out.print("\t"+list.previous());
        }
        
        System.out.println("\nMinimum : "+Collections.min(vec));
        System.out.println("\nMaximum : "+Collections.max(vec));

    }
}
