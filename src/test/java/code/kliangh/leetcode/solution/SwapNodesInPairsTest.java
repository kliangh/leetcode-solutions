package code.kliangh.leetcode.solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {

    @Test
    public void swapNodes() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode result = swapNodesInPairs.swapNodes(n1);

        List<Integer> results = new ArrayList<>();
        do {
            results.add(result.value);

            result = result.next;
        } while (Objects.nonNull(result));

        results.forEach(System.out::println);
    }
}