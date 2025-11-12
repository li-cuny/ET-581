package Lab10.p10;

public class Student implements Comparable<Student>{
    String name;
    Student(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
    public int compareTo(Student other){
        // return  -1; // current object is lower order
        // return 1; // current object is higher order
        return this.name.compareTo(other.name);
    }
}
