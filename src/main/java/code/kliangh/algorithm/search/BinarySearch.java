package code.kliangh.algorithm.search;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static int searchRecursively(List<Integer> input, int l, int r, int target) {
        int status = -1;

        if (r >= l) {
            int mid = l + (r - 1) / 2;

            if (input.get(mid) == target) {
                return mid;
            }

            if (input.get(mid) > target) {
                return searchRecursively(input, l, mid - 1, target);
            }

            return searchRecursively(input, mid, r, target);
        }

        return status;
    }

    public static void main(String... args) {
        int target = 30;
        List<Integer> input = Arrays.asList(7, 9, 18, 23, 30, 35, 41);

        int resultIndex = BinarySearch.searchRecursively(input, 0, input.size() - 1, target);
        System.out.println(resultIndex);
    }
}
