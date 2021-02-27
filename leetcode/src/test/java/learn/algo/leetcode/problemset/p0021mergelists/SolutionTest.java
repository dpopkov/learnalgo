package learn.algo.leetcode.problemset.p0021mergelists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMergeTwoLists() {
        ListNode a = ListNode.of(1, 2, 4);
        ListNode b = ListNode.of(1, 3, 4);
        ListNode expected = ListNode.of(1, 1, 2, 3, 4, 4);
        ListNode actual = new Solution().mergeTwoLists(a, b);
        assertEqualLists(expected, actual);
    }

    @Test
    void testMergeTwoListsEmptyAndOne() {
        ListNode a = ListNode.of();
        ListNode b = ListNode.of(0);
        ListNode expected = ListNode.of(0);
        ListNode actual = new Solution().mergeTwoLists(a, b);
        assertEqualLists(expected, actual);
    }

    private void assertEqualLists(ListNode a, ListNode b) {
        while (a != null && b != null) {
            assertEquals(a.val, b.val);
            a = a.next;
            b = b.next;
        }
        assertNull(a);
        assertNull(b);
    }
}
