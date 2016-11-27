package Part1;

import org.junit.Assert;
import org.junit.Test;
import sort.SortsPart1.InsertionSort;

public class InsertionSortTest {

    @Test
    public void testInsertionTest(){
        int[] a = {1, 3, 2};
        assert (InsertionSort.insertionSort(a) == new int[]{1,2,3});
        a = new int[]{5, 2, 5, 2, 0, -2, -1, -6};
        InsertionSort.insertionSort(a);
        Assert.assertArrayEquals(a, new int[]{-6, -2, -1, 0, 2, 2, 5, 5});
    }
}