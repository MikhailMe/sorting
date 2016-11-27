package Part1;

import org.junit.Assert;
import org.junit.Test;
import sort.SortsPart2.MergeSort;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] a = {1, 3, 2};
        assert (MergeSort.mergeSort(a) == new int[]{1, 2, 3});
        a = new int[]{5, 2, 5, 2, 0, -2, -1, -6};
        MergeSort.mergeSort(a);
        Assert.assertArrayEquals(a, new int[]{-6, -2, -1, 0, 2, 2, 5, 5});
    }
}