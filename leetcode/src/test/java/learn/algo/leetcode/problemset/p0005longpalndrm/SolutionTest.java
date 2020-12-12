package learn.algo.leetcode.problemset.p0005longpalndrm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "a, a",
            "a, ac",
            "bb, abb",
            "aba, aba",
            "bab, babad",
            "bb, cbbd"
    })
    void testLongestPalindrome(String expected, String input) {
        assertEquals(expected, new Solution().longestPalindrome(input));
    }

    @ParameterizedTest
    @CsvSource({
            "true, a",
            "true, bb",
            "false, ab",
            "true, aba",
            "true, baab",
            "false, bad"
    })
    void testIsPalindrome(boolean expected, String s) {
        assertEquals(expected, new Solution().isPalindrome(s.toCharArray(), 0, s.length()));
    }
}
