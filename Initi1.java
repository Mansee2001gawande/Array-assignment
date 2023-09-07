class Initi1{
    public static void method(){
        System.out.println("static 1 executed");
    }
    public Initi1(){
        System.out.println("1 cons called");
    }
    {
        System.out.println(" 1 initiallizer block");
    }
}
class B extends Initi1{
    public static void method(){
        System.out.println("static 2 executed");
    }
    public B(){
    System.out.println("2 cons called");
    }
    {
        System.out.println("2 initiallizer called");
    }
}
     class Main{
    public static void main(String[] args) {
     // Initi1  obj=new B();
        /* 1 initiallizer block
           1 cons called
           2 initiallizer called
           2 cons called
        */
        Initi1 obj=new Initi1();   //1 class  constructor call 
        /*  1 initiallizer block
             1 cons called
        */
        
}
     }