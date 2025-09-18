import java.util.Scanner;

public class ReadArrayFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++){
            System.out.println("Please enter int at index " + i);
            //arr[i] = scanner.nextInt();
            int readValue = scanner.nextInt();
            arr[i] = readValue;
        }
        // for loop pirnt array
        for (int i = 0; i < arr.length; i++){
            System.out.println("array index " + i + " value " + arr[i]);
        }
        scanner.close();
    }
}
