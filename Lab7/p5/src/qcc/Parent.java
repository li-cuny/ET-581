package qcc;

public class Parent {
    final String QCC = "qcc";
    final void print(){
        System.out.println("Prent print method");
    }
    void printNonFinal(){
        System.out.println("Prent nont final print method");
        // this.QCC = "qc";
    }
    
}


Driver has a vehicle
class Driver{
    Vehicle vehicle;
    Car car;
}