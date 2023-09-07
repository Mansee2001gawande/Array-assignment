public class Private1 {
    private String name;
    private int age;
    private int id;
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public void setName(String newname){
        name =  newname;
    }
    public void setAge(int newage){
        age =newage;
    }
    public void setId(int newid){
        id = newid;
    }
}
class Main{
    public static void main(String[] args) {
        Private1 obj=new Private1();
        obj.setName("mansee");
        obj.setAge(21);
        obj.setId(1);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getId());



    }
}

