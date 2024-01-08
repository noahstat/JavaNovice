class Company{
 Company(){
     System.out.println("This is a Steel Manufacturing Comapny");
 }
 Company(int nop,String pname){
      System.out.println("Product name:"+pname);
      System.out.println("Number of products Manufactured per day:"+nop+"tons");
 }
 public void display()    {
     System.out.println("Base class method is called using super");
 }
}
class Product extends Company
{
 Product(){
     super(100,"Metal roofing");  
     System.out.println("The raw materials needed are iron ore, coke and limestone.");
 }
 public void display(){
     super.display();
     System.out.println("Derived class method");
 }
} 
public class Superbase{
 public static void main(String[] args){
     Product p = new Product();
     p.display();
 }
}