package basic.day2;

public class Ex11 {

    public static void main(String[] args) {
        System.out.println(ifPalindrome("kajak"));
        System.out.println(ifPalindrome("dom"));
    }

    private static boolean ifPalindrome(String input) {
        //#Option1
        StringBuilder sbAfterReverse = new StringBuilder(input).reverse();
        String stringAfterReverse = sbAfterReverse.toString();
        return stringAfterReverse.equals(input);

        //#Option2 - but we need create new StringBuild object - not good
        /*StringBuilder sbAfterReverse = new StringBuilder(input).reverse();
        return sbAfterReverse.compareTo(new StringBuilder(input)) == 0 ? true : false;*/
    }
}