public class Main {
    public static void main(String[] args) {
        // Fruit f = new Fruit();
        // Apple a = new Apple();
        // System.out.println(f instanceof Fruit);
        // System.out.println(a instanceof Apple);
        // Fruit f1 = a;
        // String s1 = new String("hello");
        // System.out.println(f1 instanceof Apple);
        // System.out.println(s1 instanceof Apple);
        Orange o = new Orange();
        Fruit[] listOFruits = new Fruit[5];
        listOFruits[0] = new Apple();
        listOFruits[1] = new Orange();
        listOFruits[2] = new Apple();
        listOFruits[3] = new Orange();
        listOFruits[4] = new Orange();
        Apple[] apples = new Apple[2];
        Orange[] oranges = new Orange[3];
        int appleIndex =0;
        int orangeIndex = 0;
        for(int i=0;i<listOFruits.length;i++){
            Fruit f = listOFruits[i];
            if (f instanceof Apple){
                System.out.println("inex" + i + " Apple");
                apples[appleIndex] = (Apple) f;
                appleIndex ++;
            }else if ( f instanceof Orange){
                System.out.println("inex" + i + " Orange");
                oranges[orangeIndex] = (Orange) f;
                orangeIndex++;
            }
        }
        System.out.println("apples has " + appleIndex + " orange has "+ orangeIndex);
    }
}
