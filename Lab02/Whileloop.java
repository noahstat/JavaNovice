public class Whileloop {
    public static void main(String[] args) {
        int a = 2;
        int arr[] = {2,3,5,7,11};
        int sum = 0;
            while(a>=1)
            {
                for(int c :arr)
                sum = sum+c;
                a--;
            }
        System.out.println("The sum of sumbers is:"+ sum);
    }
}
