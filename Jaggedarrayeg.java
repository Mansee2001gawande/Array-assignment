//Q.1 Write a program to make a Jagged Array .
 class Jaggedarrayeg{
    public static void main(String[] args) {
        int a[][]= new int [5][];

        for(int i=0;i<a.length;i++)
        a[i]=new int[i+1];

        int count=0;
        for(int i=0;i<a.length;i++)
        for(int j=0;j<a[i].length;j++)
         a[i][j]=count++;


        // System.out.print(" 1 row 1 ele 2row 2 ele ==");
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();

         }
    }
}