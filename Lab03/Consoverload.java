class Studet {
    String roll;
    int mark1;
    int mark2;
    int mark3;
    Studet(){
        mark1=80;
        mark2=90;
        mark3=95;
    }
    Studet(String n){
        roll = n;
    }
    Studet(int a, int b, int c){
        mark1=a;
        mark2=b;
        mark3=c;
    }
    int caltotal(){
        int tot= mark1+mark2+mark3;
        return(tot);
    }
}
public class Consoverload{
    public static void main(String[] args){
        Studet s1 = new Studet("SCS500");
        Studet s2 = new Studet("SCS501");
        Studet s3 = new Studet(75,89,60);
        Studet s4 = new Studet();
            int total1 = s3.caltotal();
            int total2 = s4.caltotal();
                System.out.println("The student "+s1.roll+" secured "+total1+" marks");
                System.out.println("The student "+s2.roll+" secured "+total2+" marks");
    }
}
