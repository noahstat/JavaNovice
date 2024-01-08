class fruits {
    int strawberrywt=10,orangewt=25;
    public void show(){
        System.out.println("This is the base class, Fruits are rich in Vitamin A, C, and E");
    }
}
class citrusfruits extends fruits {
    int tot;
    public void weightcal(){
        tot=strawberrywt+orangewt;
        System.out.println("This is derived class. The total weight of two citrus fruits: " + tot + "kg");
    }
    public void info(){
        System.out.println("This is the derived class. Citrusfruits are rich in Vitamin C");
    }
}
public class Singleinheri {
    public static void main(String[] args){
        citrusfruits c1=new citrusfruits();
        c1.show();
        c1.weightcal();
        c1.info();
    }
}
