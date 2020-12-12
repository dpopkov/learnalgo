package learn.algo.leetcode.problemset.p0005longpalndrm;

/*
Result:
Runtime: 194 ms, faster than 32.44%
Memory Usage: 39.6 MB, less than 40.35%
Solution is accepted, but result is still poor.
 */
class Solution {
    /**
     * Returns the longest palindromic substring in s.
     */
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1) {
            return s;
        }
        String result = "";
        char[] chars = s.toCharArray();
        for (int start = 0; start < len - 1; start++) {
            for (int end = start; end < len; end++) {
                int subLength = end - start + 1;
                if (subLength > result.length()
                        && isPalindrome(chars, start, end + 1)) {
                    result = new String(chars, start, subLength);
                }
            }
        }
        return result;
    }

    boolean isPalindrome(char[] chars, int from, int to) {
        int len = to - from;
        if (len == 1) {
            return true;
        }
        for (int i = from, j = to - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
