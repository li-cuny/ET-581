package qcc;

public class Dog extends Animal{
    static {
        System.out.println("Dog static block");
    }
    {
        System.out.println("Dog instant block");
    }
    Dog(){
        //super();
        System.out.println("Dog constructor");
    }

    public void sound(){ // overriding happens between classs parent and child
        System.out.println("Dog bark");
    }
    public void sound(int i){  // overloading happens in same class
        System.out.println("dog bark "+ i);
    }
}
