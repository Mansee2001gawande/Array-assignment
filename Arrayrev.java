import java.util.Scanner;
public class Arrayrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array length:=");
        int length=sc.nextInt();
        int a[]=new int [length];
        System.out.print("enter array elements:=");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }

         for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);

         }
     }
    
}
