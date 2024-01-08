class Overmethod{
    String fname;
    int age,empid;
    public Overmethod(String fname, int empid, int age){
        this.fname = fname;
        this.empid = empid;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        Overmethod o1=(Overmethod)obj;
        return this.empid==o1.empid && this.fname.equals(o1.fname) && this.age==o1.age ;
    }
}
public class Methoverride{
    public static void main(String[] args){
        Overmethod str1=new Overmethod("Franklin",101,30);
        Overmethod str2=new Overmethod("Franklin",101,30);
        System.out.println("The contents of two objects eventhough they point to different address:"+str1.equals(str2));
    }
}
