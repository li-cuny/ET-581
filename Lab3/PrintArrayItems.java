public class PrintArrayItems {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        int arrSize = intArr.length;
        for(int index=0; index < arrSize; index ++){
            System.out.println("index is: " + index + " value is : "+ intArr[index]);
        }
        System.out.println("==================");

        for(int item : intArr){
            System.out.println(" item value is : " + item);
        }

    }
}
