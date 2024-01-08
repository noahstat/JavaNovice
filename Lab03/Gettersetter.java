class Temperature {
    private int temp;
        public void settemp(int temp1){
            this.temp = temp1;
        }
        public int gettemp(){
            return this.temp;
        }
}
public class Gettersetter{
    public static void main(String[] args){
        Temperature t1= new Temperature();
        t1.settemp(25);
        int temper=t1.gettemp();
            System.out.println("Today's temperature is "+temper+" degree celcius");
    }
}
