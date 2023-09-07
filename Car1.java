public class Car1 {
    String carname;
    int carprice;
    Car1(String name, int price){
        this.carname=name;
        this.carprice=price;
    }
}
class Simple{
    public static void main(String[] args) {
        Car1 ob=new Car1("Thar",1900000);
        Car1 ob2=new Car1("Corolla",2500000);

        System.out.println(ob.carname+" "+ob.carprice);
        System.out.println(ob2.carname+" "+ob2.carprice);
    }
}
