public class Passbyvalue {
    public static void main(String args[]){
        String color1="Blue";
        Passbyvalue c1=new Passbyvalue();
        System.out.println("Before passing value to method, the color is "+color1);
        c1.changecolor(color1);
        System.out.println("After passing value to method, the color is "+color1);

    }
    void changecolor(String color1){
        color1=color1+"Green";
    }
}
