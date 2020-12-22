package learn.algo.leetcode.problemset.p0938rangesumbst;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static learn.algo.leetcode.problemset.p0938rangesumbst.Solution.buildTree;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(32, 7, 15, new Integer[] {10, 5, 15, 3, 7, null, 18}),
                Arguments.of(23, 6, 10, new Integer[] {10, 5, 15, 3, 7, 13, 18, 1, null, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testRangeSumBST(int expected, int low, int high, Integer[] values) {
        Solution.TreeNode tree = buildTree(values);
        int result = new Solution().rangeSumBST(tree, low, high);
        assertEquals(expected, result);
    }
}
