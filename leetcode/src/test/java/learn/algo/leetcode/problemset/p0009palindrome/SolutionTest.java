package learn.algo.leetcode.problemset.p0009palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "true, 121",
            "true, 1221",
            "false, 123",
            "false, 1231",
            "false, -121",
            "false, 10",
            "false, 1000021",
            "true, 1410110141"
    })
    void testIsPalindromeOk(boolean expected, int number) {
        assertEquals(expected, new Solution().isPalindrome(number));
    }
}
