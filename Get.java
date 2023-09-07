import java.util.Scanner;
public class Get {
    private int num;
    public void setNumber(int number){
        if(number >1||number<400){
            throw new IllegalArgumentException();
        }
        num=number;
    }
    public int getNumber(){
        return num;
    }
 }
 class Mansi{
    public static void main(String []args){
        Get obj=new Get();
        obj.setNumber(300);
        System.out.print(obj.getNumber());
        }
 }
