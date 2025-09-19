import java.lang.Math;
public class CreatingMethod {
    static int intMethod(){
        System.out.println("we are inside of intMethod");
        return (int) (Math.random()*101);
    }
    static void voidMethod(String name){
        System.out.println(name);
        if (name.equals("Li"))return;
        System.out.println("this is extra code");
    }
    public static void main(String[] args) {
        int returnValue = intMethod();
        System.out.println(returnValue);
        voidMethod("Li");
        voidMethod("xx");
        // System.out.print(name);
    }
}
