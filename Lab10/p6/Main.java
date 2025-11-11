package Lab10.p6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        list.add(new Apple());
        list.add(new Apple());
        list.add(new Orange());
        list.add(new Apple());
        List<Apple> apples = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();
        for(Fruit f : list){
            if (f instanceof Apple){
                apples.add((Apple) f);
            }else if ( f instanceof Orange) {
                oranges.add((Orange) f);
            }
        }
        for(Apple a: apples){
            a.print();
        }
        for(Orange o: oranges){
            o.print();
        }
        System.out.println(apples);
        System.out.println(oranges);
    }
}
