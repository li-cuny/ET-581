public class Main {
    public static void main(String[] args){
        // Car car1 = new Car();
        // // car1.drive();
        // // car1.color = "red";
        // // car1.year = 2000;
        // car1.drive();

        // Car car2 = new Car("blue");
        // car2.drive();

        // Car car3 = new Car("purple",2001);
        // car3.drive();

        // Car car4 = new Car(1);
        // car4.drive();

        CarWithStatic car1 = new CarWithStatic();
        CarWithStatic car2 = new CarWithStatic();
        CarWithStatic car3 = new CarWithStatic();
        System.out.println(CarWithStatic.count);
        System.out.println(car1.count);
        System.out.println(car1.id);
    }
}
