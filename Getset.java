 import java.util.Scanner;
 public class Getset {
    private int num;
    public void setNumber(int number){
        if(number <1||number >400){
            throw new IllegalArgumentException();
            }
            num=number;
    }
    public int getNumber(){
        return num;
    }
}
    class Gfg{
        public static void main(String []args){
        Getset obj=new Getset();
        obj.setNumber(399);
        System.out.print(obj.getNumber());
        }
    }
    

