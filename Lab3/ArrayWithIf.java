public class ArrayWithIf {
    public static void main(String[] args) {
        int[] arr = new int[20];
        // for(int i=0; i<arr.length;i++){
        //     if(i %2 ==0 )arr[i] = 1;
        // }
        //init
        int j=0;
        //condition
        while(j<arr.length){
            //statement
             if(j %2 ==0 )arr[j] = 1;
            //update
            j++;
        }
        
        
        //
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
