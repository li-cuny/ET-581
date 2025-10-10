public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent("parent");
        // System.out.println(p1.school);
        System.out.println(p1.name);
        Child c1 = new Child();
        System.out.println(c1.name);
        System.out.println(c1.shcool);
        c1.getName(); //visible 
        //c1.callMyName(); // not visible
    }
}
