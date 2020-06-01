package learn.algo.hackrrnk.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
The equivalent of SSN in India is a PAN number, which is unique to each of its citizens.
In any of the country's official documents, the PAN number is listed as follows

<char><char><char><char><char><digit><digit><digit><digit><char>

Your task is to figure out if the PAN number is valid or not.
A valid PAN number will have all its letters in uppercase and digits in the same order as listed above.
 */
public class ValidPanFormat {
    private final Pattern pattern = Pattern.compile("[A-Z]{5}\\d{4}[A-Z]");

    public boolean isValid(String pan) {
        return pattern.matcher(pan).matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = in.nextLine();
        }
        ValidPanFormat vpf = new ValidPanFormat();
        for (int i = 0; i < n; i++) {
            boolean valid = vpf.isValid(input[i]);
            System.out.println(valid ? "YES" : "NO");
        }
    }
}
