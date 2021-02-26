package learn.algo.leetcode.problemset.p0020validparentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("{()}", true),
                Arguments.of("{([])}", true),
                Arguments.of("((", false),
                Arguments.of("(]", false),
                Arguments.of("([)]", false),
                Arguments.of("())", false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testIsValid(String input, boolean expected) {
        assertEquals(expected, new Solution().isValid(input));
    }
}
