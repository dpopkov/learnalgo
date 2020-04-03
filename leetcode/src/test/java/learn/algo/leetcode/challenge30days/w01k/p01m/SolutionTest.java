package learn.algo.leetcode.challenge30days.w01k.p01m;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canFindWhenSuccessiveDoubles() {
        Solution solution = new Solution();
        int[] numbers = {2, 2, 1};
        int result = solution.singleNumber(numbers);
        assertEquals(1, result);
    }

    @Test
    public void canFindWhenNonSuccessiveDoubles() {
        Solution solution = new Solution();
        int[] numbers = {4, 1, 2, 1, 2};
        int result = solution.singleNumber(numbers);
        assertEquals(4, result);
    }
}
