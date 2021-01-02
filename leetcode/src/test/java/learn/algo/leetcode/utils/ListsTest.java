package learn.algo.leetcode.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListsTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(true, List.of(1, 2, 3), List.of(3, 2, 1)),
                Arguments.of(false, List.of(1, 2, 3), List.of(3, 2, 1, 4)),
                Arguments.of(false, List.of(1, 2, 3), List.of(3, 22, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testContainSameItems(boolean expected, List<Integer> a, List<Integer> b) {
        assertEquals(expected, Lists.containSameItems(a, b));
    }

    private static Stream<Arguments> deepData() {
        return Stream.of(
                Arguments.of(true,
                        List.of(List.of(1, 2, 3), List.of(1, 2, 3)),
                        List.of(List.of(1, 2, 3), List.of(1, 2, 3))
                ),
                Arguments.of(false,
                        List.of(List.of(1, 2, 3)),
                        List.of(List.of(1, 2, 3), List.of(1, 2, 3))
                ),
                Arguments.of(true, List.of(1, 2, 3), List.of(3, 2, 1)),
                Arguments.of(false, List.of(1, 2, 3), List.of(3, 22, 1)),
                Arguments.of(false,
                        List.of(List.of(1, 2, 3), List.of(1, 22, 3)),
                        List.of(List.of(1, 2, 3), List.of(1, 2, 3))
                ),
                Arguments.of(true,
                        List.of(List.of(1, 2, 3), List.of(1, 22, 3)),
                        List.of(List.of(1, 3, 22), List.of(1, 2, 3))
                ),
                Arguments.of(true,
                        List.of(
                                List.of(List.of(1, 2, 3), List.of(1, 22, 3)),
                                List.of(List.of(1, 22, 3), List.of(1, 2, 3))
                        ),
                        List.of(
                                List.of(List.of(1, 22, 3), List.of(1, 2, 3)),
                                List.of(List.of(1, 2, 3), List.of(1, 22, 3))
                        )
                ),
                Arguments.of(false,
                        List.of(
                                List.of(List.of(1, 2, 3), List.of(1, 22, 3)),
                                List.of(List.of(1, 22, 3), List.of(1, 2, 3))
                        ),
                        List.of(
                                List.of(List.of(1, 22, 3), List.of(1, 2, 3)),
                                List.of(List.of(1, 2, 3), List.of(1, 222, 3))
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("deepData")
    void testDeepContainSameItems(boolean expected, List<List<Integer>> a, List<List<Integer>> b) {
        assertEquals(expected, Lists.deepContainSameItems(a, b));
    }

}
