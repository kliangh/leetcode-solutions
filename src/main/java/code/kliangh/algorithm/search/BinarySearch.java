package code.kliangh.algorithm.search;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static int searchWithTailRecursion(List<Integer> input, int start, int end, int target) {

        if (start >= end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (input.get(mid) == target) {
            return mid;
        }

        return (target > input.get(mid))
               ? searchWithTailRecursion(input, mid + 1, end, target)
               :
               searchWithTailRecursion(input, start, mid - 1, target);
    }

    public static int searchWithLoop(List<Integer> input, int target) {
        int start = 0;
        int end = input.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (input.get(mid) == target) {
                return mid;
            }

            if (input.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
