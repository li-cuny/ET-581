import java.util.Arrays;

public class ArrayWithMethod {
    static void arrayElementUpdate(int e){
        e = 10;
    }
    static void updateArray(int[] arr){
        arr[1] =20;
    }
    public static void main(String[] args) {
        int[] array = new int[3]; // {0,0,0}
        System.out.println(Arrays.toString(array));
        arrayElementUpdate(array[1]); // {0, 10, 0 }
        System.out.println(Arrays.toString(array));
        updateArray(array); // { 0, 20, 0 }
        System.out.println(Arrays.toString(array));
    }
}
