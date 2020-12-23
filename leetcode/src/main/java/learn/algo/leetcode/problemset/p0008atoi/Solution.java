package learn.algo.leetcode.problemset.p0008atoi;

/*
String to Integer (atoi)

Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary
until the first non-whitespace character is found.
Then, starting from this character takes an optional initial plus or minus sign
followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number,
which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number,
or if no such sequence exists because either str is empty or it contains only whitespace characters,
no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

    Only the space character ' ' is considered a whitespace character.
    Assume we are dealing with an environment that could only store integers within
    the 32-bit signed integer range: [−2^31,  2^31 − 1].
    If the numerical value is out of the range of representable values,
    2^31 − 1 or −2^31 is returned.

Constraints:

    0 <= s.length <= 200
    s consists of English letters (lower-case and upper-case), digits, ' ', '+', '-' and '.'.

Result:
Runtime: 2 ms, faster than 59.13%
Memory Usage: 2 ms, faster than 59.13%
 */
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        boolean negative = false;
        int i = 0;
        if (s.charAt(i) == '-') {
            negative = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        int result = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if ((Integer.MAX_VALUE - digit) / 10 < result) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + digit;
                i++;
            } else {
                break;
            }
        }
        return negative ? -result : result;
    }
}
