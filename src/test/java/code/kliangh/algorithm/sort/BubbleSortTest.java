package code.kliangh.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() {
        List<Integer> testList = Arrays.asList(3, 9, 6, 1);
        List<Integer> answer = Arrays.asList(1, 3, 6, 9);

        BubbleSort.sort(testList);
        Assert.assertEquals(answer, testList);
        System.out.println("Result: " + testList);
    }
}