package basic.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {

    public static void main(String[] args) {
        System.out.println(isContainsAString("a Psik"));
        System.out.println(isContainsAString("a psik"));
        System.out.println(isContainsAString("aaa psik"));
        System.out.println(isContainsAString("aaapsik"));
        System.out.println(isContainsAString("psik"));
        System.out.println(isContainsAString(" psik"));
    }

    private static boolean isContainsAString(String input) {
        String regex = "a+ (psik|Psik)";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matches(regex, input);
    }

    private static boolean isContainsAStringV2(String input) {
        String regex = "a+ (psik|Psik)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
