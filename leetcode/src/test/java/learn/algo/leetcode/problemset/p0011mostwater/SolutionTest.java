package learn.algo.leetcode.problemset.p0011mostwater;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(49, new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}),
                Arguments.of(1, new int[] {1, 1}),
                Arguments.of(16, new int[] {4, 3, 2, 1, 4}),
                Arguments.of(2, new int[] {1, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testMaxArea(int expected, int[] heights) {
        assertEquals(expected, new Solution().maxArea(heights));
    }
}
