//wap to print 5 numbers using array.
import java.util.Scanner;
public class Array2 {
public static void main(String[] args) {
    int a[]=new int[5];
    int i;
    Scanner sc=new Scanner(System.in);
    for(i=0;i<5;i++){
        System.out.println("enter a no");
        a[i]=sc.nextInt();
    }
    for (i=0;i<5;i++){
    System.out.println("numbers"+(a[i]));
    }
    }
}
    

