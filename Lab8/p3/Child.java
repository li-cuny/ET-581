package Lab8.p3;
import Lab8.p2.Parent;
public class Child extends Parent{
    int z = 3;
    public static void main(String[] args) {
        Child p = new Child();
        System.out.println(p.x);
    }
}
