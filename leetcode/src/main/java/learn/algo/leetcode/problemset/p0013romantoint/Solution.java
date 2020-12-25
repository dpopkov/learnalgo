package learn.algo.leetcode.problemset.p0013romantoint;

import java.util.HashMap;
import java.util.Map;

/*
13. Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII. Instead, the number four is written as IV.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

Result:
Runtime: 5 ms, faster than 57.28%
Memory Usage: 39.5 MB, less than 47.48%
 */
class Solution {
    private final Map<Character, Integer> map = new HashMap<>();
    {
        char[] romans = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] decimals = {1, 5, 10, 50, 100, 500, 1000};
        for (int j = 0; j < romans.length; j++) {
            map.put(romans[j], decimals[j]);
        }
    }

    public int romanToInt(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            int number = map.get(s.charAt(i));
            if (i + 1 == s.length()) {
                result += number;
                break;
            }
            int nextNumber = map.get(s.charAt(i + 1));
            int t = nextNumber / number;
            if (t == 5 || t == 10) {
                result += (nextNumber - number);
                i += 2;
            } else {
                result += number;
                i++;
            }
        }
        return result;
    }
}
