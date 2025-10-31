package Lab9.p2;

public class Main {
    public static void main(String[] args) {
        // Person person1 = new Person();
        // System.out.println(person1.getName());
        Student student1 = new Student();
        // System.out.println(student1.getName());
        // System.out.println(student1.getAge());
        Professor professor1 = new Professor();
        // System.out.println(professor1.getName());
        // System.out.println(professor1.getAge());
        Person p = student1;
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
