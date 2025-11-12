package Lab10.p10;

import java.util.*;


public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(5);
        l1.add(8);
        l1.add(7);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);

        List<Student> students = new ArrayList<>();
        students.add(new Student("sony"));
        students.add(new Student("Alice"));
        students.add(new Student("bob"));
        students.add(new Student("max"));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    
    }
}
