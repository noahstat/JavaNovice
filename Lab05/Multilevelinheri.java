class Tree {
    String s1="Teak";
    public void show(){
        System.out.println("This is the parent class `Tree`");
    }
}
class Wood extends Tree {
    String s2="hard wood";
    public void info(){
        System.out.println("This is the derived class `Wood` whoose parent class is `Tree`");
    }
}
class Furniture extends Wood {
    String s3="table";
    public void display(){
        System.out.println("This is the derived class `Furniture` whoose parent class is `Wood`");
        System.out.println("The "+s1+" tree is a "+s2+" which can be used to make "+s3);
    }
}
public class Multilevelinheri{
    public static void main(String[] args){
        Furniture f1=new Furniture();
        f1.show();
        f1.info();
        f1.display();
    }
}
