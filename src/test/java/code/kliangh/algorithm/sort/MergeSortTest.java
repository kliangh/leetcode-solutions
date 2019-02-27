package code.kliangh.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        List<Integer> testList = Arrays.asList(7, 9, 3, 4, 6);
        List<Integer> answer = Arrays.asList(3, 4, 6, 7, 9);

        List<Integer> result = MergeSort.sort(testList);
        Assert.assertEquals(answer, result);
        System.out.println("Result: " + result.toString());
    }
}