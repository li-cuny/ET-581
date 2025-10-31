package Lab8.p5;
public class CommonCon{
    public int x;
    {
        System.out.println("instance block");
        x =10;
    }

    public CommonCon(){
        this(10);
        System.out.println("default constructor");
        //this.x = 10;
        //this(10);
        
    }
    public CommonCon(int x){
        System.out.println("param constructor");
        this.x = x;
    }
    public static void main(String[] args) {
        CommonCon c = new CommonCon();
        System.out.println(c.x);

    }
}