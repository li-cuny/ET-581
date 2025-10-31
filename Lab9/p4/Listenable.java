package Lab9.p4;

public interface Listenable {
    void listen();

    default void sameName(){
        System.out.println("this is Listenable default method");
    }
}
