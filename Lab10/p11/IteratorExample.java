package Lab10.p11;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        // for(String item: list){
        //     list.remove(2);
        // }
        System.out.println(list);
        for(int i =0;i<list.size();i++){
            list.remove(2);
        }
        System.out.println(list);


    }
}
