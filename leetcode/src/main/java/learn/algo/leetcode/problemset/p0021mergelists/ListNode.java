package learn.algo.leetcode.problemset.p0021mergelists;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" + val + '}';
    }

    static ListNode of(int... values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode node = head;
        for (int i = 1; i < values.length; i++) {
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        return head;
    }
}
