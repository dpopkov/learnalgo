package learn.algo.leetcode.problemset.p0007reverseint;

/*
7. Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within
the 32-bit signed integer range: [−2^31,  2^31 − 1].
For the purpose of this problem, assume that your function returns 0
when the reversed integer overflows.

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Example 4:
Input: x = 0
Output: 0

Integer.MAX_VALUE = 2147483647
Integer.MIN_VALUE = -2147483648

Result:
Runtime: 1 ms, faster than 100.00%
Memory Usage: 36.1 MB, less than 48.10%
 */
class Solution {
    public int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int d = x % 10;
            if (x > 0 && r > (Integer.MAX_VALUE - d) / 10
                    || x < 0 && r < (Integer.MIN_VALUE - d) / 10) {
                return 0;
            }
            r = r * 10 + d;
            x /= 10;
        }
        return r;
    }
}
