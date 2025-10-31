package Lab9.p4;

public class Book implements Readable,Listenable{

    @Override
    public void listen() {
       System.out.println("we are listening.");
    }

    @Override
    public void read() {
        System.out.println("we are reading.");
    }
    public void sameName(){
       System.out.println("this is book method");
       Readable.super.sameName();
       Listenable.super.sameName();
    }
    
}
