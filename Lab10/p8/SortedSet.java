import java.util.*;

public class SortedSet {
    public static void main(String[] args) {
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s1 = new TreeSet<>();
        Set<String> s3 = new HashSet<>();
        Set<String> s4 = new TreeSet<>();
        // s1.add(10);
        // s2.add(10);
        // s1.add(5);
        // s2.add(5);
        // s1.add(7);
        // s2.add(7);
        // System.out.println(s1);
        // System.out.println(s2);
        s3.add("Hello");
        s4.add("Hello");
        s3.add("Java");
        s4.add("Java");
        System.out.println(s3);
        System.out.println(s4);

    }
}
