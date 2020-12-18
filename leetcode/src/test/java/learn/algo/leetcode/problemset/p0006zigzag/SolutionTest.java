package learn.algo.leetcode.problemset.p0006zigzag;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "RUN, RUN, 3",
            "RNU, RUN, 2",
            "PAHNAPLSIIGYIR, PAYPALISHIRING, 3",
            "PINALSIGYAHRPI, PAYPALISHIRING, 4",
            "A, A, 1",
            "AB, AB, 1",
    })
    void testConvert(String expected, String input, int numRows) {
        assertEquals(expected, new Solution().convert(input, numRows));
    }
}
