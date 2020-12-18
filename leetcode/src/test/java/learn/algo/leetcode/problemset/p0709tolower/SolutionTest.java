package learn.algo.leetcode.problemset.p0709tolower;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "hello, Hello",
            "here, here",
            "lovely, LOVELY"
    })
    void testToLowerCase(String expected, String input) {
        assertEquals(expected, new Solution().toLowerCase(input));
    }
}
