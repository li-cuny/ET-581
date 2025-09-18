public class SubStringExample {
    public static void main(String[] args) {
        String str1= "Hello New York City";
        //print "New York" using .subString(startIndex, endIndex);
        System.out.println("Print out New York using .subString()");
        System.out.println(str1.substring(6,14));

        // print out index of "New" using indexOf(String x);
        int index = str1.indexOf("New");
        System.out.println(index);
        // print substring from index 6;
        System.out.println(str1.substring(index));

    }
}
