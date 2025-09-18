package Lab3;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i==5){
                break;
            }
            System.out.println("i = " + i);
        }
        // arrive here
        System.out.println("this is out of for loop");
    }
}
