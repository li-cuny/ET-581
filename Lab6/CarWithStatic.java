public class CarWithStatic {
    static int count = 0;
    int id = 0;
    static {
        System.out.println("this is static block.");
    }
    {
        System.out.println("this is instance block");
    }
}
