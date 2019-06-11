package code.kliangh.algorithm.search;

import java.util.List;

public class BinarySearch {
    public static int searchWithTailRecursion(List<Integer> input, int start, int end, int target) {

        if (start >= end) {
            return -1;
        }

        int mid = (start + (end - 1)) / 2;
        if (input.get(mid) == target) {
            return mid;
        }

        return (target > input.get(mid))
               ? searchWithTailRecursion(input, mid + 1, end, target)
               :
               searchWithTailRecursion(input, start, mid - 1, target);
    }
}
