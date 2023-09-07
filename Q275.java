//print fibonnacci series
import java.util.Scanner;
public class Q275 {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no:-");
        int no=sc.nextInt();

        System.out.print(" "+a);
        System.out.print(" "+b);



        while(no!=0){
            c=a+b;
         System.out.print(" "+c);
         a=b;
         b=c;
         no--;

        }

    }
    
}
