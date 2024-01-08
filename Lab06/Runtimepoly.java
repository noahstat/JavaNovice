class Plants{
 public void display(){
     System.out.println("Plants are classified based on their growth habit.");
 }
}
class Herbs extends Plants{
 public void display() {
       System.out.println("Herbs are short-sized plants used for medicinal purposes.");
 }
}
class Shrubs extends Plants{
 public void display(){        
        System.out.println("Shrubs are medium-sized woody plants.");
  }
}
public class Runtimepoly {
 public static void main(String args[]){
       Plants obj = new Herbs();
           obj.display();
     Plants obj1 = new Shrubs();
         obj1.display();
     Plants obj2=new Plants();
         obj2.display();        
 }    
}