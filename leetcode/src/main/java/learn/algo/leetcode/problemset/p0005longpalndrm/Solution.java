package learn.algo.leetcode.problemset.p0005longpalndrm;

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
        for (int start = 0; start < len - 1; start++) {
            for (int end = start; end < len; end++) {
                String sub = s.substring(start, end + 1);
                if (isPalindrome(sub)
                        && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
