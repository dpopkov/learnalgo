package learn.algo.leetcode.problemset.p0014longcommpref;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("fl", new String[] {"flower","flow","flight"}),
                Arguments.of("flow", new String[] {"flower","flow"}),
                Arguments.of("", new String[] {"dog","racecar","car"})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void longestCommonPrefix(String expected, String[] input) {
        assertEquals(expected, new Solution().longestCommonPrefix(input));
    }
}
