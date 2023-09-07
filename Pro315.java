import java.util.Scanner;
public class Pro315 {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of an array");
        int length=sc.nextInt();
        int a[]=new int [length];
        System.out.print("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter the no you want to search");
        int search=sc.nextInt();


        for(int i=0;i<a.length;i++){
            if(a[i]==search)
            flag=true;
            break;
        }
        for(int i=0;i<a.length;i++){
        if(flag=true)
            System.out.println("element is found"+search);
         
         else
         System.out.println("ELEMENT NOT FOUND");

        }

    }
}