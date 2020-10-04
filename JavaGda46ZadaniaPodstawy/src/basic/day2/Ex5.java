package basic.day2;

public class Ex5 {

    public static void main(String[] args) {
        System.out.println("Result: " + countCharInString("Ala ma kota", 'a'));
        System.out.println("Result: " + countCharInString("Ala ma kota", 'z'));
    }

    private static int countCharInString(String input, char sign) {
        //#Option1
        /*if(input.isEmpty()) {
            return 0;
        }
        int counter = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == sign) {
                counter++;
            }
        }
        return counter;*/

        //#Option2
        if(input != null && !input.isBlank()) { // better validation, the same as in Ex3
            int counter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == sign) {
                    counter++;
                }
            }
            return counter;
        }
        return 0;
    }
}