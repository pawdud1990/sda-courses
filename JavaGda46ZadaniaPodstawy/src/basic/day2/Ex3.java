package basic.day2;

public class Ex3 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        System.out.println("Result: " + getIndex(input, "ma"));
        System.out.println("Result: " + getIndex(input, "psa"));
        System.out.println("Result: " + getIndex(input, "a k"));
        System.out.println("Result: " + getIndex(input, ""));
        System.out.println("Result: " + getIndex(input, null));
    }

    private static int getIndex(String input, String word) {
        if(word != null && !word.isBlank()) {
            return input.contains(word) ? input.indexOf(word) : -1;
        }
        return -1;
    }
}