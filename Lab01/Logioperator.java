public class Logioperator {
    public static void main(String[] args){
        int a = 5*3;
        int b = 500/5;
        int c = 20;
            System.out.println("The value of a:"+a);
            System.out.println("The value of b:"+b);
            System.out.println("The value of c:"+c);
            System.out.println("Using logical AND '(a<b) && (c>b)' is:"+((a<b) && (c>b)));
            System.out.println("Using logical OR '(b<c) || (b>a)' is:"+((b<c) || (b>a)));
            System.out.println("Using logical NOT '!(a==c)' is:"+(!(a==c)));
    }
}
