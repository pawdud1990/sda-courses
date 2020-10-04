package basic.day2;

public class Ex1 {

    public static void main(String[] args) {
        String input = "ala";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharacterV1(input));
        System.out.println("Last char: " + getLastCharacterV2(input));

        input = "domek";
        System.out.println("\nOriginal word: " + input);
        System.out.println("Last char: " + getLastCharacterV1(input));
        System.out.println("Last char: " + getLastCharacterV2(input));
    }

    private static char getLastCharacterV1(String input) {
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);
    }

    private static String getLastCharacterV2(String input) {
        int lastPosition = input.length() - 1;
        return input.substring(lastPosition);
    }
}