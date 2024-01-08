class School {
    String sname = "kindergarten";
    public void display(){
        System.out.println("School:"+sname);
    }
}
class Student extends School {
    int numstu = 35;
    @Override
    public void display() {
        System.out.println("Number of students:"+numstu);
    }
    public void show(){
        System.out.println("This is "+sname+" school which has "+numstu+" students");
    }
}
public class Upcastdowncast {
    public static void main(String[] args){
        School sc1=new Student();
        System.out.println("School:"+sc1.sname);
        sc1.display();
        Student stu = (Student)sc1;
        stu.show();
    }
}
