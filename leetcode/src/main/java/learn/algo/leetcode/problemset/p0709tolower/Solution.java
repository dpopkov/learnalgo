package learn.algo.leetcode.problemset.p0709tolower;

/*
To Lower Case.

Implement function ToLowerCase() that has a string parameter str,
and returns the same string in lowercase.
 */
public class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(Character.toLowerCase(str.charAt(i)));
        }
        return sb.toString();
    }
}
