public class  Privatecons1 {
    private int age;
     private String  name;

    private Privatecons1(int age,String name) {
        this.age = age;
        this. name= name;
    }
    public void Display(){
        System.out.println("age:= "+age+" name:= "+name);
    }
    public static void main(String[] args) {
        Privatecons1 obj=new Privatecons1(5,"mansee");
        obj.Display();
   
    }
}

