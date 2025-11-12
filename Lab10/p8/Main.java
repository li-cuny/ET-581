import java.util.*;

public class Main{
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        Collection<String> c1 = new ArrayList<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s2.add("B");
        s2.add("C");
        s2.add("D");
        c1.add("E");
        System.out.println(s1);
        System.out.println(s2);
        s1.add("B");
        s1.addAll(s2);
        s1.addAll(c1);
        
        System.out.println(s1);

    }

}