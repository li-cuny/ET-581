import java.util.Arrays;

public class ArrayFill{
    public static void main(String[] args){
        // create array
        int[] arr = new int[3];
        // fill array valure 1 
        System.out.print(Arrays.toString(arr));
        for (int i=0; i<arr.length;i++){
            arr[i] = 1;
        }
        System.out.print(Arrays.toString(arr));
    }
}