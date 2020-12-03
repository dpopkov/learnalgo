package learn.algo.leetcode.problemset.p0007reverseint;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "123, 321",
            "-321, -123",
            "21, 120",
            "0, 0",
            "0, 1534236469",
            "0, -1534236469",
            "-2143847412, -2147483412",
            "2147483641, 1463847412"
    })
    void testReverseOk(int expected, int input) {
        int result = new Solution().reverse(input);
        assertEquals(expected, result);
    }
}
