package learn.algo.leetcode.problemset.p0002addtwonumbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(ListNode.of(4), ListNode.of(1), ListNode.of(3)),
                Arguments.of(ListNode.of(4, 6), ListNode.of(1, 2), ListNode.of(3, 4)),
                Arguments.of(ListNode.of(4, 6, 8), ListNode.of(1, 2, 3), ListNode.of(3, 4, 5)),
                Arguments.of(ListNode.of(4, 6, 3), ListNode.of(1, 2, 3), ListNode.of(3, 4)),
                Arguments.of(ListNode.of(7, 2, 8), ListNode.of(9, 6), ListNode.of(8, 5, 7)),
                Arguments.of(ListNode.of(8, 9, 9, 0, 1), ListNode.of(9, 9, 9), ListNode.of(9, 9, 9, 9))
        );
    }

    private static Stream<Arguments> dataLC() {
        return Stream.of(
                Arguments.of(ListNode.of(7, 0, 8), ListNode.of(2, 4, 3), ListNode.of(5, 6, 4)),
                Arguments.of(ListNode.of(0), ListNode.of(0), ListNode.of(0)),
                Arguments.of(ListNode.of(8,9,9,9,0,0,0,1), ListNode.of(9,9,9,9,9,9,9), ListNode.of(9,9,9,9))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testAddTwoNumbers(ListNode expected, ListNode first, ListNode second) {
        ListNode actual = new Solution().addTwoNumbers(first, second);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataLC")
    void testAddTwoNumbersLC(ListNode expected, ListNode first, ListNode second) {
        ListNode actual = new Solution().addTwoNumbers(first, second);
        assertEquals(expected, actual);
    }
}
