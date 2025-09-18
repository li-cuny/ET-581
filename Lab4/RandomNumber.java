import java.lang.Math;
public class RandomNumber {
    public static void main(String[] args) {
        double rDouble = Math.random(); // 0,0 --0.9999
        System.out.println(rDouble);
        int rInt = (int) (Math.random() * 10); // 0 --9 
        System.out.println(rInt);
        int intTo100 = (int) (Math.random()*101); // 0 --100
    }
}
