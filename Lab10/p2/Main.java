import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<String>();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        Collection<String> c2 = new ArrayList<>();
        c2.add("A");
        c2.add("B");
        c2.add("F");
        Collection<String> c3 = new ArrayList<>();
        c3.add("X");
        c3.add("Y");
        c3.add("Z");
        // System.out.println("containsAll: " + c1.containsAll(c2));
        // System.out.println(c1);
        // c1.addAll(c2);
        System.out.println(c1);
        // boolean removeAllResult = c1.removeAll(c2);
        boolean removeAllResult = c1.removeAll(c3);
        System.out.println(c1);
        System.out.println(removeAllResult);

        c1.retainAll(c2);
        System.out.println(c1);
        
    }
}
