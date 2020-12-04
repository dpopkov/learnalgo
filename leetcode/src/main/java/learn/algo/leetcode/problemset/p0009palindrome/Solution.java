package learn.algo.leetcode.problemset.p0009palindrome;

/*
9. Palindrome Number

Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.

Follow up: Could you solve it without converting the integer to a string?

Result:
Runtime: 7 ms, faster than 63.34%
Memory Usage: 38.2 MB, less than 86.19%
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int divisor = 1;
        int length = 1;
        int limit = Integer.MAX_VALUE / 10;
        while (divisor <= limit && divisor * 10 <= x) {
            divisor *= 10;
            length++;
        }
        for (int i = length / 2; i != 0; i--) {
            int left = x / divisor;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x %= divisor;
            x /= 10;
            divisor /= 100;
        }
        return true;
    }
}
