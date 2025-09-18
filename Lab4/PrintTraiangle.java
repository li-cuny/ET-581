public class PrintTraiangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("---------------------");
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0;i<n-2;i++){
            System.out.print("* ");
        }
        System.out.println();
        System.out.println("---------------------");
        for(int j=0;j<n;j++){ // changing number of star
            for(int i=0;i<n-j;i++){ // print single row of stars
                System.out.print("* ");
            }
             System.out.println();
        }
       
    
    }
}