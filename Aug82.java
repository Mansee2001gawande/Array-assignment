public class Aug82{
    public static void main(String[] args) {
        String str= "java is simple";
        String word[]=str.split(" ");
        String blank="";

        for(int i=0;i<word.length;i++){
            char ch[]=word[i].toCharArray();
            if (ch[0]>=95){
               ch[0]= (char)(int)(ch[0]-32);
               word[i]=new String (ch);
            }
        blank=blank+word[i];
        }
        System.out.print(blank);
    }
}