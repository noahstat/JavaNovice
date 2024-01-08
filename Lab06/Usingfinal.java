class Circle{ 
 final double pi=3.14;
 final int r;
 Circle()
 {
     r=10;
 }
 public void show(){ 
     System.out.println("A circle is a closed two-dimensional figure"); 
     } 
}     
 class Areacircle extends Circle{ 
 
 public void show(){ 
     System.out.println("Area of circle is:"+(pi*r*r)); 
 } 
} 
 class Circumcircle extends Circle{
 public void show(){ 
     super.show();
 System.out.println("Circumference of the circle:"+(2*pi*r)); 
 } 
}  
public class Usingfinal{
 public static void main(String[] args){ 
     Circumcircle c1= new Circumcircle();
     c1.show(); 
     Circle cir=new Areacircle();
     cir.show();
 } 
}