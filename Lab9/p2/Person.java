package Lab9.p2;
abstract public class Person { // abstract class
    String name = "";
    Person(){
        name = "unknwon";
    }
    public String getName() {
        return name;
    }
    abstract int getAge();
}