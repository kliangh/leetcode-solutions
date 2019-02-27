package code.kliangh.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static List<Integer> sort(List<Integer> input) {
        int middle = input.size() / 2;
        if (middle == 0) {
            return input;
        }

        return merge(sort(input.subList(0, middle)),
                     sort(input.subList(middle, input.size())),
                     new ArrayList<>());
    }

    private static List<Integer> merge(List<Integer> leftPortion,
                                       List<Integer> rightPortion,
                                       List<Integer> result) {
        if (leftPortion.isEmpty()) {
            result.addAll(rightPortion);
        } else if (rightPortion.isEmpty()) {
            result.addAll(leftPortion);
        } else {
            //Put the smaller one into accumulator
            if (leftPortion.get(0) <= rightPortion.get(0)) {
                result.add(leftPortion.get(0));
                return merge(leftPortion.subList(1, leftPortion.size()), rightPortion, result);
            } else {
                result.add(rightPortion.get(0));
                return merge(leftPortion, rightPortion.subList(1, rightPortion.size()), result);
            }
        }
        return result;
    }
}
