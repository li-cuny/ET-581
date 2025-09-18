package Lab3;

public class PrintString {
    public static void main(String[] args) {

        String text = "Hello World";
        int index =0; // init
        while( index < text.length()){ // String.length(); // condition
            System.out.println(text.charAt(index)); // statement
             index = index + 1; // index ++;  // update
        }
    }
    
}
