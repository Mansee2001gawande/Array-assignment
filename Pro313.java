import java.util.Scanner;
public class Pro313 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of an array");
        int length=sc.nextInt();
        int a[]=new int [length];
        System.out.print("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            System.out.println("no is even: "+a[i]);
        }
        else
        System.out.println("no is odd: "+a[i]);
        }

    }
    
}
