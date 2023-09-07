public class Pro311 {
    public static void main(String[] args) {
        for(char i='D';i>='A';i--){
            for(char j='A';j<='I';j++){
                if((i== 'D'&& j>'D' && j<'F')||(i=='C' && j>'C' && j<'G')
                ||(i=='B' && j>'B' && j<'H')||(i=='A' && j>'A' && j<'I'))
                 System.out.print(" ");
                 else
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
