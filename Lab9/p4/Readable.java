package Lab9.p4;

public interface Readable {
    public static final int x = 5; // static final ==> constant
    void read();
    default void read2(){
        System.out.println("this is read2 default method");
    }
    static void read3(){
        System.out.println("this is static method in Readable");
    }

     default void sameName(){
        System.out.println("this is Readable default method");
    }
}
