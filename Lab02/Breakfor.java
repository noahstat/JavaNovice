public class Breakfor {
    public static void main(String[] args) {
        System.out.println("The calue of i and j are printed as:");
            for(int i=1; i<=3;i++){
                bb:
                    for(int j=2;j<=3;j++){
                        if (i ==2 && j == 2){
                            break bb;
                        }
                        System.out.println(i+" "+j);
                    }
            }
    }
}
