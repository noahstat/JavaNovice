class Javaproj{
    static String st1="Java Programming Lab";
    static void display(){
        st1="java Novice to Javanista Lab";
        System.out.println("Accessing static method:"+st1);
    }
    public void nonstat(){
        System.out.println("this message is inside non-static method");
    }
}
public class Static_method_variable {
    public static void main(String[] args){
        Javaproj j1=new Javaproj();
        System.out.println("Accessing static variable:"+Javaproj.st1);
        Javaproj.display();
        j1.nonstat();
    }
}
