package learn.algo.leetcode.challenge30days.w01k.p02m;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canDetectHappy() {
        int input = 19;
        boolean result = new Solution().isHappy(input);
        assertTrue(result);
    }

    @Test
    public void canDetectUnhappy() {
        int input = 18;
        boolean result = new Solution().isHappy(input);
        assertFalse(result);
    }
}
