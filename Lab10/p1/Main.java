import java.util.*;

class Main{
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<String>();
        System.out.println(c1.size());
        System.out.println(c1.isEmpty());
        System.out.println(c1.contains("Orange"));
        System.out.println(c1);
        System.out.println(c1.remove("Mango"));
        System.out.println("=================");
        c1.add("Apple");
        c1.add("Orange");
        c1.add("Mango");
        System.out.println(c1.size());
        System.out.println(c1.isEmpty());
        System.out.println(c1.contains("Orange"));
        System.out.println(c1);
        c1.remove("Mango");
        System.out.println(c1);
        c1.clear();
        System.out.println(c1);
    
    }
}