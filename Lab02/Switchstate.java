import java.util.Scanner;
public class Switchstate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a nember from 1 to 4:");
        int fruit = in.nextInt();
            switch (fruit){
                case 1:
                System.out.println("You have chosen Apple. It is rich in Vitamin A");
                break;
                case 2:
                System.out.println("You have chosen Banana. It is rich in Vitamin B");
                break;
                case 3:
                System.out.println("You have chosen Avocado. It is rich in Vitamin E");
                break;
                case 4:
                System.out.println("You have chosen Strawberry. It is rich in Vitamin C");
                break;
                default:
                System.out.println("You have not entered a valid number");
            }
    }
}
