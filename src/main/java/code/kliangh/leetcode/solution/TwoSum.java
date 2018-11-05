package code.kliangh.leetcode.solution;

import java.util.stream.IntStream;

public class TwoSum {
    public static int[] findTwoSumIndexes(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            int indexOfRemaining;

            if (IntStream.of(nums).anyMatch(e -> e == remaining)) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == remaining && j != i) {
                        indexOfRemaining = j;
                        return new int[] {i, indexOfRemaining};
                    }
                }
            }
        }
        return null;
    }
}
