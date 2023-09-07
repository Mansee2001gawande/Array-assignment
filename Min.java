
public class Min {
    public static void main(String[] args) {
    int a[]={4,6,8,9,2};
        int min,i;
        min=a[0];
        for(i=0;i<5;i++){
          if(a[i]<min)
          min=a[i];
        }
        System.out.print(min);
    }
}
