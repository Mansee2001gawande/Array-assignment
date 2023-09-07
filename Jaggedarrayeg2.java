public class Jaggedarrayeg2 {
    public static void main(String[] args) {
        int mansi [][]=new int [3][];

        mansi[0]= new int [3];    // 1st row has 3 coloumn
        mansi[1]=new int [2];     // 2nd row has 2 coloumn
        mansi[2]=new int [1];     // 3rd row has 1 coloumn

        int count=0;
        for(int i=0;i<mansi.length;i++)
        for(int j=0;j<mansi[i].length;j++)
        mansi[i][j]=count++;

        System.out.print("array......");
        for(int i=0;i<mansi.length;i++){
        for(int j=0;j<mansi[i].length;j++)
        System.out.print(mansi[i][j]+" ");
       // System.out.println();
        }
    }
}
//array......0 1 2 3 4 5 