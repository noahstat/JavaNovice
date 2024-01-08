public class Construcvariable{
    String name;
    String rollno;
    int mark1;
    int mark2;
    double avgmarks;
        Construcvariable(){
            name="David";
            rollno="SCS001";
            mark1=98;
            mark2=92;
        }
        public void showdet(){
            avgmarks=(mark1+mark2)/2;
            System.out.println("Student name:" + name);
            System.out.println("Roll number:" + rollno);
            System.out.println("Mark1:" + mark1);
            System.out.println("Mark2:" + mark2);
            System.out.println("Average marks:" + avgmarks);
        }
        public static void main(String[] args){
            Construcvariable b1 = new Construcvariable();
            b1.showdet();
        }
}
