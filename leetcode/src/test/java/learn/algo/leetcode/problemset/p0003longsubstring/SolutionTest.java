package learn.algo.leetcode.problemset.p0003longsubstring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "3, abcabcbb",
            "1, bbbbb",
            "3, pwwkew",
            "2, aab",
            "3, dvdf",
            "6, dabdefg",
            "5, tmmzuxt",
            "6, wobgrovw"
    })
    void testLengthOfLongestSubstringOk(int expected, String input) {
        int result = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    void testLengthOfLongestSubstringZero() {
        int result = new Solution().lengthOfLongestSubstring("");
        assertEquals(0, result);
    }
}
