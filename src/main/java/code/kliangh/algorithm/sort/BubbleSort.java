package code.kliangh.algorithm.sort;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void sort(List<Integer> input) {
        if (CollectionUtils.isEmpty(input)) {
            throw new IllegalArgumentException("Input list cannot be null or empty !!");
        }

        boolean unsorted = true;
        int lastSortedIndex = input.size() - 1;

        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < lastSortedIndex; i++) {
                if (input.get(i) > input.get(i + 1)) {
                    Collections.swap(input, i, i + 1);
                    unsorted = true;
                }
            }
            lastSortedIndex--;
        }
    }
}
