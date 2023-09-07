import java.util.Scanner;
public class Onedarrayeg {
    public static void main(String[] args){
        int len;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        len=sc.nextInt();
        int a[]=new int[len];
        System.out.print("enter "+len+" elements to store in array");
        for(int i=0;i<len;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("elements in array are");
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }
    }

}

