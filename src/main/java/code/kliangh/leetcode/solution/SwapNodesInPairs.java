package code.kliangh.leetcode.solution;

import java.util.Objects;

public class SwapNodesInPairs {

    public static ListNode swapNodes(ListNode head) {
        if (Objects.isNull(head)) {
            return null;
        }

        ListNode fakeHead = new ListNode(0);
        ListNode n1 = head;
        ListNode n2 = head.next;
        ListNode pre = fakeHead;

        while (Objects.nonNull(n1) && Objects.nonNull(n2)) {
            ListNode end = n2.next;

            //swap nodes
            pre.next = n2;
            n2.next = n1;
            n1.next = end;

            //prepare nodes for next iteration
            pre = n1;
            n1 = n1.next;
            if (Objects.nonNull(end)) {
                n2 = end.next;
            }
        }

        return fakeHead.next;
    }
}
