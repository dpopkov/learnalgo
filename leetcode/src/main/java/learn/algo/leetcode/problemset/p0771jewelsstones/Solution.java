package learn.algo.leetcode.problemset.p0771jewelsstones;

/*
You're given strings J representing the types of stones that are jewels,
and S representing the stones you have.  Each character in S is a type of stone you have.
You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Runtime: 1 ms, faster than 70.47%
Memory Usage: 37.5 MB, less than 34.74%
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        CharSet jewels = new CharSet();
        for (char ch : J.toCharArray()) {
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

    private static class CharSet {
        private static final int FIRST = 'A'; // 65;
        private static final int LAST = 'z'; // 122;

        private final boolean[] set = new boolean[LAST - FIRST + 1];

        public boolean contains(char ch) {
            return set[ch - FIRST];
        }

        public void add(char ch) {
            set[ch - FIRST] = true;
        }
    }
}
