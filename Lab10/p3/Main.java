package Lab10.p3;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<String>();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        Iterator<String> it = c1.iterator();
        while(it.hasNext()){
            String element = it.next();
            if (element.equals("C")){
                break;
            }
            System.out.println(element);
        }
        for(String e: c1){
            System.out.println("for loop print: "+ e);
            if (e.equals("C")){
                c1.remove(e);
            }
        }
       
    }
}
