public class Prostyle {
        public static void main(String[] args) {
            for(char i=68;i>=65;i--){
                for(char j=65;j<=68;j++){

                    if((i== 68 && j>68 && j<65)||(i==67 && j>67 && j<66)
                    ||(i==66 && j>66 && j<67)||(i==65 && j>65 && j<68))
                     System.out.print(" ");
                     else
                    System.out.print((j));
                    for(char k=68;k>=65;k--){
                    System.out.print((k));
                    }
                }
                System.out.println();
            }
        }
        
    }
                   // if((i== 'D'&& j>'D' && j<'F')||(i=='C' && j>'C' && j<'G')
                //||(i=='B' && j>'B' && j<'H')||(i=='A' && j>'A' && j<'I'))

