package learn.algo.leetcode.problemset.p1108defangip;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @SuppressWarnings("SpellCheckingInspection")
    @ParameterizedTest
    @CsvSource({
            "1[.]1[.]1[.]1, 1.1.1.1",
            "255[.]100[.]50[.]0, 255.100.50.0"
    })
    void testDefangIPaddr(String expected, String input) {
        assertEquals(expected, new Solution().defangIPaddr(input));
    }
}
