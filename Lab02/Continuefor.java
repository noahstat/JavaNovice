public class Continuefor {
    public static void main(String[] args) {
        String s1 = "Advanced Java";
        int nump = 0;
        int max = s1.length()-1;
            for (int i = 0; i <=max; i++){
                if((s1.charAt(i) != 'a') && (s1.charAt(i) != 'A'))
                continue;
                nump++;
            }
            System.out.println("The number of characters either 'A' or 'a' in the given string is:"+nump);
    }
}
