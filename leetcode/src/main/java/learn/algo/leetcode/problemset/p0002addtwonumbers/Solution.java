package learn.algo.leetcode.problemset.p0002addtwonumbers;

import java.util.Objects;

/*
2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
2 -> 4 -> 3
5 -> 6 -> 4
-----------
7 -> 0 -> 8
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:
* The number of nodes in each linked list is in the range [1, 100].
* 0 <= Node.val <= 9
* It is guaranteed that the list represents a number that does not have leading zeros.

Success Details:
Runtime: 2 ms, faster than 78.06% of Java online submissions for Add Two Numbers.
Memory Usage: 39.4 MB, less than 44.72% of Java online submissions for Add Two Numbers.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        int digit = n1.val + n2.val;
        int carry = digit / 10;
        digit = digit % 10;
        final ListNode head = new ListNode(digit);
        n1 = n1.next;
        n2 = n2.next;
        ListNode current = head;
        while (n1 != null || n2 != null) {
            if (n1 != null) {
                digit = n1.val;
                n1 = n1.next;
            } else {
                digit = 0;
            }
            if (n2 != null) {
                digit += n2.val;
                n2 = n2.next;
            }
            digit += carry;
            carry = digit / 10;
            digit = digit % 10;
            current.next = new ListNode(digit);
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return head;
    }
}

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int... digits) {
        int idx = 0;
        ListNode node = new ListNode(digits[idx++]);
        ListNode current = node;
        while (idx < digits.length) {
            current.next = new ListNode(digits[idx++]);
            current = current.next;
        }
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(val);
        ListNode n = next;
        while (n != null) {
            sb.append(", ").append(n.val);
            n = n.next;
        }
        sb.append("]");
        return sb.toString();
    }
}