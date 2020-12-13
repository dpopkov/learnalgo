package learn.algo.leetcode.problemset.p0771jewelsstones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "3, aA, aAAbbbb",
            "0, z, ZZ",
    })
    void numJewelsInStones(int expected, String jewels, String input) {
        assertEquals(expected, new Solution().numJewelsInStones(jewels, input));
    }
}
