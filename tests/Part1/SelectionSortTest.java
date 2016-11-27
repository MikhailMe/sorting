package Part1;

import org.junit.Assert;
import org.junit.Test;
import sort.SortsPart1.SelectionSort;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        int[] a = {1, 3, 2};
        assert (SelectionSort.selectionSort2(a) == 0);
        a = new int[]{5, 2, 5, 2, 0, -2, -1, -6};
        SelectionSort.selectionSort2(a);
        Assert.assertArrayEquals(a, new int[]{-6, -2, -1, 0, 2, 2, 5, 5});
    }
}