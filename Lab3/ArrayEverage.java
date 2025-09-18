public class ArrayEverage {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8};
        int total =0;
        double average = 0.0;
        for (int i =0; i<arr.length; i++){
            total = total + arr [ i ];
        }
        average = total/ arr.length;
        System.out.println(average);
    }
}
