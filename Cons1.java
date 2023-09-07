public class Cons1 {
    Cons1(){
        System.out.println("default constructor is created");
    }
    Cons1(int x,int a, int b,float y){
        System.out.print(a*b*y);
    }
    public static void main(String[] args) {
    Cons1 ob=new Cons1(5,6,7,5.7f);
    //Cons1 ob1=new Cons1(5);
    }
}
