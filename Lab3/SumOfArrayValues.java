public class SumOfArrayValues {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for( int i =0; i < arr.length; i ++){
            int value = arr[i];
            sum = sum + value;
            System.out.println("index is: "+ i + " value is: " + value + " current sum is: " + sum);
        }
        System.out.println("final result is : " + sum);
    }
}
