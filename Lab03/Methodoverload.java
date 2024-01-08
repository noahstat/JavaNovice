class Stringoper {
    public String strop(String st1, String st2){
        return st1.concat(st2);
    }
    public String strop(String str, String olstr, String newstr){
        return str=str.replace(olstr,newstr);
    }
    public int strop(String str){
        int i;
        return i = str.length();
    }
    public char strop(String st3, int i){
        char st4=st3.charAt(i);
        return st4;
    }
}
public class Methodoverload{
    public static void main(String[] args){
        Stringoper obj1=new Stringoper();
        String strconcat=obj1.strop("Java Noive"," to Javanista");
        String strreplace=obj1.strop("Python Lab Programming","Python","Java");
        int strlen=obj1.strop("Javanista Lab");
        char strchar=obj1.strop("Constructor",3);
            System.out.println("The concatenation of two strings is "+strconcat);
            System.out.println("The replaced string is :"+strreplace);
            System.out.println("The character at the index value of 3 in the given 'Constructor' is :"+strchar);
            System.out.println("The lenght of the string 'Javanista Lab' is :"+strlen);
    }
}
