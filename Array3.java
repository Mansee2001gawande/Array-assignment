//name print your class
import java.util.Scanner;
public class Array3 {
 public static void main(String[] args) {
 String a[] = new String [10];
    int i;
    Scanner sc=new Scanner(System.in);
   for(i=0;i<10;i++){
   System.out.println("enter a no");
   a[i]=sc.nextLine();
   }
   a[0]="ABC";
   a[1]="DEF";
   a[2]="IJK";
   a[3]="LMN";
   a[4]="OPQ";
   a[5]="RST";
   a[6]="UVW";
   a[7]="XYZ";
   a[8]="123";
   a[9]="456";
   for(i=0;i<5;i++)
   System.out.println(" Name= "+a[i]);
}
}



    

