import java. util.Scanner;
public class Aug83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no");
        int no=sc.nextInt();
        int mult=0,p;

        mult=no*no;
        mult=mult%10;
        if (mult==no){
            System.out.println("no is autoporphic");
         } else
         System.out.println("no is not autoporphic");

        


    }
    
}
