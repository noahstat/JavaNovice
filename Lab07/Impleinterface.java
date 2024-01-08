interface Javabooks{
int y=50;
public void javacount();
}

interface Pythonbooks{
 int y=100;
 public void pythoncount();
}

class Books implements Javabooks{
 public void javacount(){
     System.out.println("Number of Java books: "+y);
 }
 public void pythoncount(){
     System.out.println("Number of python books: "+Pythonbooks.y);
 }
 public void totbooks(){
     System.out.println("Total number of Java and python books: "+(Javabooks.y+Pythonbooks.y));
 }
}
class Impleinterface{
 public static void main(String arg[]){
    Books obj = new Books();
 obj.javacount();  
 obj.pythoncount();
 obj.totbooks();     
      }
}
