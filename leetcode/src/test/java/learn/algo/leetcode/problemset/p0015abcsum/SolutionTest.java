package learn.algo.leetcode.problemset.p0015abcsum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        List.of(List.of(-3, 1, 2)),
                        new int[]{-3, 2, 1}
                ),
                Arguments.of(
                        List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)),
                        new int[]{-1, 0, 1, 2, -1, -4}
                ),
                Arguments.of(
                        List.of(),
                        new int[]{}
                ),
                Arguments.of(
                        List.of(),
                        new int[]{0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testThreeSum(List<List<Integer>> expected, int[] input) {
        List<List<Integer>> actual = new Solution().threeSumSets(input);
        assertContainSameItems(expected, actual);
    }

    private void assertContainSameItems(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }
}
