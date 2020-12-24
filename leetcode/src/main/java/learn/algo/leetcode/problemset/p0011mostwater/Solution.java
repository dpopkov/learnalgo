package learn.algo.leetcode.problemset.p0011mostwater;

/*
Container With Most Water

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
Find two lines, which, together with the x-axis forms a container,
such that the container contains the most water.

Notice that you may not slant the container.

Constraints:

    n = height.length
    2 <= n <= 3 * 10^4
    0 <= height[i] <= 3 * 10^4

Result:
Runtime: 2 ms, faster than 94.83%
Memory Usage: 40.9 MB, less than 21.37%
 */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            if (area > max) {
                max = area;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    @SuppressWarnings("unused")
    int bruteForce(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }
}
