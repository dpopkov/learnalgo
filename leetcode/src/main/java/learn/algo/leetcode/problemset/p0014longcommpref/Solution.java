package learn.algo.leetcode.problemset.p0014longcommpref;

/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Result:
Runtime: 0 ms, faster than 100.00%
Memory Usage: 37.3 MB, less than 47.88%
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String first = strs[0];
        for (int charIdx = 0; charIdx < first.length(); charIdx++) {
            char current = first.charAt(charIdx);
            for (int j = 1; j < strs.length; j++) {
                String word = strs[j];
                if (charIdx == word.length()) {
                    return word;
                } else if (word.charAt(charIdx) != current) {
                    return first.substring(0, charIdx);
                }
            }
        }
        return first;
    }
}
