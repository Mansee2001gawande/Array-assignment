public class Employee {
        String  employeeName;
        int  dateJoining;
        String employeeAddress;

        Employee (String name,int joining  ,String adress){
            this.employeeName = name;
            this.dateJoining = joining;
            this.employeeAddress=adress;
        }
     }
     class Mp{
        public static void main(String[] args) {
            Employee ob1=new Employee("Ashish",1994,"64-c wallstreet" );
            Employee ob2=new Employee("Sam",2000,"68-D wallstreet" );
            Employee ob3=new Employee("John",1999,"26-B wallstreet" );

            System.out.println(ob1.employeeName+" " +ob1.dateJoining+" "+ob1.employeeAddress);
            System.out.println(ob2.employeeName+" " +ob2.dateJoining+" "+ob2.employeeAddress);
            System.out.println(ob3.employeeName+" " +ob3.dateJoining+" "+ob3.employeeAddress);





        }
     }
    

