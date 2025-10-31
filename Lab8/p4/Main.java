public class Main {
    public static void main(String[] args) {
        PrivateCon p1 = PrivateCon.getInstance();
        PrivateCon p2 = PrivateCon.getInstance();
        System.out.println(p1== p2);
    }
    
}
