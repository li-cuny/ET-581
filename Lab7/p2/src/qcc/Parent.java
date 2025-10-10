public class Parent{
    public String name = "";

    Parent(String name){
        this.name = name;
    }
    Parent() {
        this.name = "unknown";
    }
    public String getName(){
        return this.name;
    }
    private void callMyName(){
        System.out.println("my name is " + this.name);
    }

}