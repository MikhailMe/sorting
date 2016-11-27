package Part2;

import org.junit.Assert;
import org.junit.Test;
import sort.SortsPart2.ShellSort;

public class ShellSortTest {
    @Test
    public void testShellSort() {
        int[] a = {1, 3, 2};
        assert (ShellSort.shellSort(a) == new int[]{1,2,3});
        Assert.assertArrayEquals(a, new int[]{1, 2, 3});
        a = new int[]{5, 2, 5, 2, 0, -2, -1, -6};
        ShellSort.shellSort(a);
        Assert.assertArrayEquals(a, new int[]{-6, -2, -1, 0, 2, 2, 5, 5});
    }

}
