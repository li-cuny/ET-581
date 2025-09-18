package Lab3;

public class PrintStringWithForLoop {
    public static void main(String[] args) {
        String text = "Hello World";
        for (int index = 0; index < text.length(); index++){
            System.out.println(text.charAt(index));
        }
    }
}
