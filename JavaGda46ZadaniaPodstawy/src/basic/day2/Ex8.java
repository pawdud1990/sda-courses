package basic.day2;

public class Ex8 {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        System.out.println("Result" + replaceChars("Ala mA kOta!"));
    }

    private static String replaceChars(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(character >= VALUE_UPPER_A_IN_ASCII && character <= VALUE_UPPER_Z_IN_ASCII) {
                result.append((char)(character + DIFF_UPPER_AND_LOWER));
            } else if(character >= VALUE_LOWER_A_IN_ASCII && character <= VALUE_LOWER_Z_IN_ASCII) {
                result.append((char)(character - DIFF_UPPER_AND_LOWER));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}