package learn.algo.leetcode.problemset.p0015abcsum;

import java.util.*;

/*
15. 3Sum

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.

Constraints:

    0 <= nums.length <= 3000
    -10^5 <= nums[i] <= 10^5

Result:
    Runtime: 683 ms, faster than 10.17%
    Memory Usage: 156.4 MB, less than 5.10%
 */
class Solution {

    public List<List<Integer>> threeSumSlidingWindow(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> rst = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    rst.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(rst);
    }

    // Solution v.2
    @SuppressWarnings("unused")
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> rst = new HashSet<>();
        HashMap<Integer, Integer> cValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            cValues.put(nums[i], i);
        }
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int b = nums[j];
                int target = -(a + b);
                Integer idxInt = cValues.get(target);
                if (idxInt != null) {
                    int targetIdx = idxInt;
                    if (targetIdx != i && targetIdx != j) {
                        List<Integer> list = new ArrayList<>();
                        list.add(a);
                        list.add(b);
                        list.add(target);
                        Collections.sort(list);
                        rst.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(rst);
    }

    // Solution v.1
    @SuppressWarnings("unused")
    public List<List<Integer>> threeSumSets(int[] nums) {
        Set<List<Integer>> rst = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int b = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    if (-a == b + nums[k]) {
                        List<Integer> list = new ArrayList<>();
                        list.add(a);
                        list.add(b);
                        list.add(nums[k]);
                        Collections.sort(list);
                        rst.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(rst);
    }
}
