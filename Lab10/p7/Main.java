package Lab10.p7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i< 10; i++){
            list.add(i);
            list2.add( i %4);
        }
        System.out.println(list);
        System.out.println(list2);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            result.add(list.get(i));
            result.add(list2.get(i));
        }
        List<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(Boolean.valueOf(1<2));
        booleans.add(1<2);
        booleans.add(result.isEmpty());
        System.out.println(booleans);
        Boolean b = booleans.get(0);
        boolean b1 = b.booleanValue();

    }
}
