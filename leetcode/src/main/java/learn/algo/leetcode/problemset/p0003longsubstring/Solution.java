package learn.algo.leetcode.problemset.p0003longsubstring;

import java.util.HashMap;

public class Solution {
    /** Finds  length of the longest substring without repeating characters. */
    public int lengthOfLongestSubstring(String s) {
        // Map содержит символ и индекс обнаружения символа
        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer prevIdx = map.get(ch);
            if (prevIdx != null) {
                int prev = prevIdx;
                int beforeStart = start - 1;
                if (prev < beforeStart) {           // не прилегает и находится слева
                    map.remove(ch);
                } else if (prev == beforeStart) {   // прилегает слева
                    start = i;
                    map.clear();
                } else {                            // находится внутри
                    start = map.get(ch) + 1;
                    map.remove(ch);
                }
            }
            map.put(ch, i);
            int length = i - start + 1;
            longest = Math.max(length, longest);
        }
        return longest;
    }
}
