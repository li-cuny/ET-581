package Lab10.p5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        ListIterator<String> listIterator = l1.listIterator();
        Iterator<String> regularIterator = l1.iterator();
        while(listIterator.hasNext()){
            String elment = listIterator.next();
            if (elment.equals("C")){
                listIterator.add("X");
            }
            System.out.println(elment);
        }
        System.out.println(l1);
        // while(listIterator.hasPrevious()){
        //     String elment = listIterator.previous();
        //     System.out.println(elment);
        // }
    }
}
