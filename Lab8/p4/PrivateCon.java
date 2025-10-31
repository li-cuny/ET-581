public class PrivateCon{
    private static PrivateCon obj = new PrivateCon();
    // public static int x;
    // public static String y;

    // default constructor
    private PrivateCon(){
       
    }
    static public PrivateCon getInstance(){
       // return new PrivateCon();
       return PrivateCon.obj;
    }

    public static void main(String[] args) {
        PrivateCon p1 = new PrivateCon();
        PrivateCon p2 = new PrivateCon();
        System.out.println(p1== p2);
    }
}