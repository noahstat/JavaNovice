class Javatxt {
    String bookname;
    public Javatxt(String bookname){
        this.bookname = bookname;
    }
    public String toString(){
        return bookname;
    }
    public void setName(String bookname){
        this.bookname = bookname;
    }
}
public class Passbyreference {
    public static void main(String[] args){
        Javatxt book1 = new Javatxt("Java-The COmplete Reference");
        System.out.println("Text books for Java: " + book1);
        changebook(book1);
        System.out.println("New Text book for Java: " + book1);
    }
    public static void changebook(Javatxt boo){
        boo.setName("Java: A Beginner's Guide");
    }
}
