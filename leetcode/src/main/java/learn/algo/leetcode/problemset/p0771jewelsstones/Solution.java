package learn.algo.leetcode.problemset.p0771jewelsstones;

import java.util.*;

/*
You're given strings J representing the types of stones that are jewels,
and S representing the stones you have.  Each character in S is a type of stone you have.
You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Runtime: 1 ms, faster than 70.47%
Memory Usage: 37.8 MB, less than 13.39%
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] jewelChars = J.toCharArray();
        Set<Character> jewels = new HashSet<>();
        for (char ch : jewelChars) {
            jewels.add(ch);
        }
        int count = 0;
        for (char ch : S.toCharArray()) {
            if (jewels.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}
