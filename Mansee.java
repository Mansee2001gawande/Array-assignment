public class Mansee {
    int age;
    int dob;
    String surname;

    Mansee(int a,int d,String s){
        this.age=a;
        this.dob=d;
        this.surname=s;
    }
}
class see{
    public static void main(String[] args) {
    Mansee ob1=new Mansee(21,2001,"Gawande");
    Mansee ob2=new Mansee(22,2003,"deshmukh");
     Mansee ob3=new Mansee(23,2004,"sharma");

     System.out.println(ob1.age+" "+ob1.dob+" "+ob1.surname);
     System.out.println(ob2.age+" "+ob2.dob+" "+ob2.surname);
     System.out.println(ob3.age+" "+ob3.dob+" "+ob3.surname);

        }
}

    

