package learn.algo.leetcode.problemset.p0938rangesumbst;

/*
Range Sum of BST

Given the root node of a binary search tree,
return the sum of values of all nodes with a value in the range [low, high].

Example 1:
        10
    5       15
3     7         18
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23

Constraints:
    The number of nodes in the tree is in the range [1, 2 * 10^4].
    1 <= Node.val <= 10^5
    1 <= low <= high <= 10^5
    All Node.val are unique.

Result:
Runtime: 0 ms, faster than 100.00%
Memory Usage: 47.1 MB, less than 69.97%
 */

/**
 Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
     }
 }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sumRecursive(root, low, high);
    }

    private int sumRecursive(TreeNode node, int low, int high) {
        int result = 0;
        if (node != null) {
            if (low <= node.val && node.val <= high) {
                result += node.val;
            }
            if (node.val <= high) {
                result += sumRecursive(node.right, low, high);
            }
            if (low <= node.val) {
                result += sumRecursive(node.left, low, high);
            }
        }
        return result;
    }

    /*
    * ******************************
    * The code below is not Solution
    * ******************************
    */

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        void add(Integer valueWrapped) {
            if (valueWrapped == null) {
                return;
            }
            int value = valueWrapped;
            if (value < val) {
                if (left != null) {
                    left.add(value);
                } else {
                    left = new TreeNode(value);
                }
            } else {
                if (right != null) {
                    right.add(value);
                } else {
                    right = new TreeNode(value);
                }
            }
        }

        @Override
        public String toString() {
            return "(" + val + ")";
        }
    }

    static TreeNode buildTree(Integer[] values) {
        TreeNode node = new TreeNode(values[0]);
        for (int i = 1; i < values.length; i++) {
            node.add(values[i]);
        }
        return node;
    }
}
