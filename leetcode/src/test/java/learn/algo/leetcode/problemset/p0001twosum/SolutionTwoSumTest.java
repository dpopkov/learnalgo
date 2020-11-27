package learn.algo.leetcode.problemset.p0001twosum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTwoSumTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
                Arguments.of(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
                Arguments.of(new int[] {3, 3}, 6, new int[] {0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testLinearTimeSolution(int[] nums, int target, int[] expected) {
        int[] output = new Solution().twoSum(nums, target);
        assertArrayEquals(expected, output);
    }

    @ParameterizedTest
    @MethodSource("data")
    void testSquareTimeSolution(int[] nums, int target, int[] expected) {
        int[] output = new Solution().squareTimeSolution(nums, target);
        assertArrayEquals(expected, output);
    }

    @ParameterizedTest
    @MethodSource("data")
    void testTwoPassHashtableSolution(int[] nums, int target, int[] expected) {
        int[] output = new Solution().twoPassHashtableSolution(nums, target);
        assertArrayEquals(expected, output);
    }
}
