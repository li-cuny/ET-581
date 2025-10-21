package qcc;

public class DogShelter extends AnimalShelter{
    public Dog getAnimal(){
        System.out.println("Dogshelter method is called");
        return new Dog();
    }
    
}
