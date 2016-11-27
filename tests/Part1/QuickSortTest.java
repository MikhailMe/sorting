package Part1;

import org.junit.Assert;
import org.junit.Test;
import sort.SortsPart1.QuickSort;

public class QuickSortTest {

    @Test
    public void testQuickSort(){
        int[] a = {1, 3, 2};
        assert (QuickSort.quickSort(a,0,a.length-1) == new int[]{1,2,3});
        a = new int[]{5, 2, 5, 2, 0, -2, -1, -6};
        QuickSort.quickSort(a,0,a.length-1);
        Assert.assertArrayEquals(a, new int[]{-6, -2, -1, 0, 2, 2, 5, 5});
    }
}