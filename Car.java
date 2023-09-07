public class Car {
    String brand;
    public Car(){
        this. brand="ford";
    }
    public String getBrand(){
        return brand;
    }
    void run(){
        System.out.println("there are 6 airbag in car");
    }
}
class Sample{
    public static void main(String[] args) {
        Car obj =new Car();
        String brand=obj.getBrand();
        System.out.print(brand);
    }
}
