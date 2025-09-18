public class ArrayDeclare{
    public static void main(String[] args){
        int[] arr = new int[3];
        double[] doubleArr = new double[3];
        String[] stringArr = new String[3];
        boolean[] booleanArr = new boolean[3];
        for(int index=0; index<arr.length; index++){
            System.out.println(arr[index]);
            System.out.println(doubleArr[index]);
            System.out.println(stringArr[index]);
            System.out.println(booleanArr[index]);
        }

        //
        System.out.println("=======================");
        int[] arr1 = { 1, 2, 3, 4};
        for(int i = 0; i < arr1.length; i++ ){
            System.out.println(arr1[i]);
        }
    }
}