package code.kliangh.leetcode.solution;

public class TwoSum {
    public int[] findTwoSumIndexes(int[] nums, int target) {
        //        int nums[] = new int[] {2,7,11,15};
        //        int target = 22;

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
