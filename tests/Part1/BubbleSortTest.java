package Part1;

import sort.SortsPart1.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] a = {1, 3, 2};
        assert (BubbleSort.bubbleSort(a, a.length) == 1);
        Assert.assertArrayEquals(a, new int[]{1, 2, 3});
        a = new int[]{5, 2, 5, 2, 0, -2, -1, -6};
        BubbleSort.bubbleSort(a, a.length);
        Assert.assertArrayEquals(a, new int[]{-6, -2, -1, 0, 2, 2, 5, 5});
    }
}