public class Dog {
    String dogName;
    int dogAge;

     Dog(String name,int age){
      this.dogName=name;
      this.dogAge=age;
     }
    }
     class Tuffy{ 
        public static void main(String []args){
            Dog ob1=new Dog("brovo",3);
             Dog ob2=new Dog("GHANSHU",5);

             System.out.println("the dog name is "+ob1.dogName+"dog age is "+ob1.dogAge);
            System.out.println("the dog name is "+ob2.dogName+"dog age is "+ob2.dogAge);
          }
    }
