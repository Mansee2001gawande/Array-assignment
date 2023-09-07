import java.util.Scanner;
public class Aug81 {
public static void main(String[] args) {
    int t;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the no1:=");
    int no=sc.nextInt();

    int sum=0,mult=1;
    while(no!=0){
        t=no%10;
        sum=sum+t;
        mult=mult*t;
        no=no/10;
    }
    //sum=sum+no;
    //mult=mult+no;


    if(sum==mult) {
     System.out.println("no is spy");

    }

    else
    System.out.println("no is no spy");


}


    
}
