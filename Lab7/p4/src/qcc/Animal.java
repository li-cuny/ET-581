package qcc;

public class Animal {
    static {
        System.out.println("Animal static block");
    }
    {
        System.out.println("Animal instant blok");
    }
    Animal(){
        System.out.println("Animal constructor");
    }
    public void sound(){
        System.out.println("Animal sound");
    }
    
}
