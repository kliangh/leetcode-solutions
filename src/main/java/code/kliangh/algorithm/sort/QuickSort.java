package code.kliangh.algorithm.sort;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    public static void sort(List<Integer> input) {
        if (CollectionUtils.isEmpty(input)) {
            throw new IllegalArgumentException("Input list cannot be null or empty!!");
        }

        sort(input, 0, input.size() - 1);
    }

    private static void sort(List<Integer> integers, int begin, int end) {
        if (begin > end) {
            return;
        }

        int pivot = begin;
        int pivotValue = integers.get(pivot);

        int leftIndex = begin + 1;
        int rightIndex = end;

        while (leftIndex <= rightIndex) {
            while (leftIndex <= end && pivotValue > integers.get(leftIndex)) {
                leftIndex++;
            }

            while (begin < rightIndex && pivotValue <= integers.get(rightIndex)) {
                rightIndex--;
            }

            if (leftIndex < rightIndex) {
                Collections.swap(integers, leftIndex, rightIndex);
            }

            Collections.swap(integers, pivot, leftIndex - 1);
            if (leftIndex == rightIndex) {
                leftIndex++;
            }

            sort(integers, begin, rightIndex); //sort left part
            sort(integers, leftIndex, end); // sort right part
        }
    }
}
