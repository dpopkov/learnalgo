package learn.algo.leetcode.problemset.p0003longsubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    /* My Solution. It may be improved. */
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

    /*
    Sliding Window Solution
    -----------------------
    Runtime: 6 ms, faster than 65.34%.
    Memory Usage: 39.6 MB, less than 26.88%.
     */
    public int lengthOfLongestSubstringWithSlidingWindow(String s) {
        int length = s.length();
        Set<Character> set = new HashSet<>();
        int longest = 0;
        int i = 0;
        int j = 0;
        while (i < length && j < length) {
            char ch = s.charAt(j);
            if (!set.contains(ch)) {
                set.add(ch);
                j++;
                longest = Math.max(longest, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return longest;
    }

    /*
    Sliding Window Optimized Solution
    ---------------------------------
    Runtime: 4 ms, faster than 89.65%.
    Memory Usage: 39.1 MB, less than 61.21%
     */
    public int lengthOfLongestSubstringWithSlidingWindowOptimized(String s) {
        int length = s.length();
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int start = 0, last = 0; last < length; last++) {
            if (map.containsKey(s.charAt(last))) {
                start = Math.max(map.get(s.charAt(last)), start);
            }
            longest = Math.max(longest, last - start + 1);
            map.put(s.charAt(last), last + 1);
        }
        return longest;
    }
}
