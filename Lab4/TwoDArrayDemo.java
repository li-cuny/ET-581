public class TwoDArrayDemo{
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {7, 8, 9, 10}
        }; // 3 rows, 4 columns

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print("row " + i + " col " + j + " value " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}