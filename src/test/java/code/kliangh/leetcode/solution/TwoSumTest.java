package code.kliangh.leetcode.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void findTwoSumIndexes() {
        int nums[] = new int[] {2,7,11,15};
        int target = 22;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.findTwoSumIndexes(nums, target);

        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }
}