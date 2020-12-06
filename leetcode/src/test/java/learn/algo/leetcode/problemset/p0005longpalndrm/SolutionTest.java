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
            "bab, babad"
    })
    void testLongestPalindrome(String expected, String input) {
        assertEquals(expected, new Solution().longestPalindrome(input));
    }
}
