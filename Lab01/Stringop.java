public class Stringop{
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "Javanista Lab";
        System.out.println("The String s1 is:" +s1);
        System.out.println("The String s2 is:" +s2);
        System.out.println("The length if string 'Java' is:" +s1.length());
        System.out.println("The 5th character in the string 'Javanista Lab' is:" +s2.charAt(4));
        System.out.println("The substring from 7th character to end from 'Javanista Lab' is:" +s2.substring(6));
        s1 = s1.concat("Novice Lab");
        System.out.println("The concatenation of string 'Java' and 'Novice Lab' is:" +s1);
        System.out.println("Removal of whitespace at both the ends ' Java Novice ' is:" +" Java Novice ".trim());
        String strreplace = s2.replace("Javanista", "Python");
        System.out.println("Replacing the wird 'Javanista' by 'Python' in string s2:"+strreplace);
    }
}
