package learn.algo.leetcode.problemset.p0008atoi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "0, ''",
            "0, ' '",
            "42, 42",
            "42, '  42  '",
            "-42, -42",
            "1, +1",
            "4193, 4193 with words",
            "0, words and 987",
            "-2147483648, -91283472332"
    })
    void testMyAtoi(int expected, String input) {
        if (input.startsWith("'") && input.endsWith("'")) {
            input = input.substring(1, input.length() - 1);
        }
        assertEquals(expected, new Solution().myAtoi(input));
    }
}
