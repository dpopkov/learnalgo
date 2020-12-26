package learn.algo.leetcode.problemset.p0014longcommpref;

/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Result:
Runtime: 1 ms, faster than 55.79%
Memory Usage: 37 MB, less than 82.91%
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        for (int charIdx = 0; charIdx < strs[0].length(); charIdx++) {
            char current = strs[0].charAt(charIdx);
            prefix.append(current);
            for (int wordIdx = 1; wordIdx < strs.length; wordIdx++) {
                String word = strs[wordIdx];
                if (charIdx == word.length() || word.charAt(charIdx) != current) {
                    return prefix.substring(0, charIdx);
                }
            }
        }
        return prefix.toString();
    }
}
