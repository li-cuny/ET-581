package qcc;

public class Student {
    Address address;
    Address[] multiAddresses;
    Student(){
        address = new Address();
        multiAddresses = new Address[5];
        for(int i=0;i<5;i++){
            multiAddresses[i] = new Address();
        }
    }
}
