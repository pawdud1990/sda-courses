package basic.day2;

public class Ex2 {

    public static void main(String[] args) {
        String input = "programowanie";
        System.out.println("Prefix:");
        System.out.println(ifWordContainsPrefix(input, "pro"));
        System.out.println(ifWordContainsPrefix(input, "pro1"));

        System.out.println("\nSuffix:");
        System.out.println(ifWordContainsSuffix(input, "nie"));
        System.out.println(ifWordContainsSuffix(input, "pro1"));
    }

    private static boolean ifWordContainsPrefix(String input, String prefix) {
        return input.startsWith(prefix);
    }

    private static boolean ifWordContainsSuffix(String input, String suffix) {
        return input.endsWith(suffix);
    }
}