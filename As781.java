public class As781 {
    String employeename;
    int esalary;
    int mphone;
    
    As781(String name,int salary,int phone){
        this.employeename=name;
        this.esalary=salary;
        this.mphone=phone;
    }
            public void sortEmp(As781[] a){
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                  if( a[i].esalary>a[j].esalary){ 
                    int temp;
                     temp=a[i].esalary;
                    a[i].esalary=a[j].esalary;
                    a[j].esalary=temp;
                  }
                }

            System.out.print(a[i].esalary);
            }
    }
}

class Mama{
    public static void main(String[] args) {
        As781 ob1= new As781("mansee gawande",15000,62621159);
        As781 ob2 =new As781 ("Ashish mishra",25000,62621218);
        As781 ob3=new As781("avantika mam crm",38000,62621210);

        System.out.println(ob1.employeename+" "+ob1.esalary+" "+ob1.mphone);
        System.out.println(ob2.employeename+" "+ob2.esalary+" "+ob2.mphone);
        System.out.println(ob3.employeename+" "+ob3.esalary+" "+ob3.mphone);

        //System.out.println();
        }
    }
    


