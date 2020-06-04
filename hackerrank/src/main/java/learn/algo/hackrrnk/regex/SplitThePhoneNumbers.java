package learn.algo.hackrrnk.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitThePhoneNumbers {
    private final Pattern pattern = Pattern.compile("(\\d{1,3})[\\x20\\x2D](\\d{1,3})[\\x20\\x2D](\\d{4,10})");

    public String[] splitToGroups(String countryAreaNumber) {
        Matcher matcher = pattern.matcher(countryAreaNumber);
        if (matcher.matches()) {
            String[] result = new String[3];
            result[0] = matcher.group(1);
            result[1] = matcher.group(2);
            result[2] = matcher.group(3);
            return result;
        } else {
            throw new IllegalArgumentException("Not valid input: " + countryAreaNumber);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        SplitThePhoneNumbers splitter = new SplitThePhoneNumbers();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String[] result = splitter.splitToGroups(s);
            System.out.printf("CountryCode=%s,LocalAreaCode=%s,Number=%s%n", result[0], result[1], result[2]);
        }
    }
}
