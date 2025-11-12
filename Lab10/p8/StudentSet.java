import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Alice"));
        set.add(new Student("Bob"));
        Iterator<Student> studentIt = set.iterator();
        while(studentIt.hasNext()){
            Student s = studentIt.next();
            System.out.println(s);
        }
        for (Student s: set){
            System.out.println(s);
        }
        System.out.println(set);
    }
}
