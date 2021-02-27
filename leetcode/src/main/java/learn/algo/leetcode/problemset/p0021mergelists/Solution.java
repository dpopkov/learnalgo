package learn.algo.leetcode.problemset.p0021mergelists;

/*
21. Merge Two Sorted Lists.

Merge two sorted linked lists and return it as a sorted list.
The list should be made by splicing together the nodes of the first two lists.
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode();
        if (l1.val < l2.val) {
            head.val = l1.val;
            l1 = l1.next;
        } else {
            head.val = l2.val;
            l2 = l2.next;
        }
        ListNode last = head;
        ListNode node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node = new ListNode(l2.val);
                l2 = l2.next;
            }
            last = advanceLast(last, node);
        }
        while (l1 != null) {
            node = new ListNode(l1.val);
            l1 = l1.next;
            last = advanceLast(last, node);
        }
        while (l2 != null) {
            node = new ListNode(l2.val);
            l2 = l2.next;
            last = advanceLast(last, node);
        }
        return head;
    }

    private ListNode advanceLast(ListNode node, ListNode next) {
        node.next = next;
        node = node.next;
        return node;
    }
}
