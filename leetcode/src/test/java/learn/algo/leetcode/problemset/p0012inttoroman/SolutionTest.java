package learn.algo.leetcode.problemset.p0012inttoroman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "I, 1",
            "V, 5",
            "X, 10",
            "L, 50",
            "C, 100",
            "D, 500",
            "M, 1000",
            "XII, 12",
            "XXVII, 27",
            "IV, 4",
            "LVIII, 58",
            "MCMXCIV, 1994"
    })
    void intToRoman(String roman, int dec) {
        assertEquals(roman, new Solution().intToRoman(dec));
    }
}
