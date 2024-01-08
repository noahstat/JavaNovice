public class Nestedif {
    public static void main(String[] args){
        int num = 10;
        if(num > 0){
            if(num >=10 && num < 100) {
                if(num%2==0){
                    System.out.println("The given number is a Positive two digit even number");
                }
                else {
                    System.out.println("The given number is a Positive two digit odd number");
                }
            }
            else {
                System.out.println("The given positive number is not a two digit number");
            }
        }
        else {
            System.out.println("The given number is a negative number");
        }
    }
}
