package learn.algo.leetcode.problemset.p0013romantoint;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "3, III",
            "4, IV",
            "9, IX",
            "58, LVIII",
            "1994, MCMXCIV",
    })
    void testRomanToInt(int expected, String input) {
        assertEquals(expected, new Solution().romanToInt(input));
    }
}
