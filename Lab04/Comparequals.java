class Strequals{
    String fname, lname;
    int age;
    public Strequals(String fname, String lname, int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
}
public class Comparequals {
    public static void main(String[] args){
        Strequals str1=new Strequals("Franklin", "David", 30);
        Strequals str2=new Strequals("Franklin", "David", 30);
        System.out.println("The two objects using == operator:"+(str1 == str2));
        System.out.println("The two objects using the .equals method:"+str1.equals(str2));
        str1=str2;
        System.out.println("The two objects using == operator after both pointing to the same reference:"+(str1 == str2));
        System.out.println("The two objects using the .equals method after both pointing to the same reference:"+str1.equals(str2));
        
    }
}
