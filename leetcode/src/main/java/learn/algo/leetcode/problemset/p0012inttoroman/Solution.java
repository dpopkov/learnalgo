package learn.algo.leetcode.problemset.p0012inttoroman;

/*
Runtime: 4 ms, faster than 81.36%
Memory Usage: 39.1 MB, less than 37.21%
 */
public class Solution {
    private final int[] numbers = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    private final String[] symbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (num >= number) {
                int times = num / number;
                sb.append(symbols[i].repeat(times));
                num %= number;
            }
        }
        return sb.toString();
    }
}
