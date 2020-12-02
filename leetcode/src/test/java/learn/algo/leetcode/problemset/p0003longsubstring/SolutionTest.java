package learn.algo.leetcode.problemset.p0003longsubstring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
class SolutionTest {
    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(3, "abcabcbb"),
                Arguments.of(1, "bbbbb"),
                Arguments.of(3, "pwwkew"),
                Arguments.of(2, "aab"),
                Arguments.of(3, "dvdf"),
                Arguments.of(6, "dabdefg"),
                Arguments.of(5, "tmmzuxt"),
                Arguments.of(6, "wobgrovw")
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void testLengthOfLongestSubstringOk(int expected, String input) {
        int result = new Solution().lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void testLengthOfLongestSubstringWithSlidingWindowOk(int expected, String input) {
        int result = new Solution().lengthOfLongestSubstringWithSlidingWindow(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void testLengthOfLongestSubstringWithSlidingWindowOptimizedOk(int expected, String input) {
        int result = new Solution().lengthOfLongestSubstringWithSlidingWindowOptimized(input);
        assertEquals(expected, result);
    }
}
