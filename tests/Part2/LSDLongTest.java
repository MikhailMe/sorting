package Part2;

import org.junit.Assert;
import org.junit.Test;
import sort.SortsPart2.LSDLong;
public class LSDLongTest {
    @Test
    public void testLSDLongSort() {
        long[] a = {1, 3, 2};
        assert (LSDLong.LSD(a) == new long[]{1,2,3});
        Assert.assertArrayEquals(a, new long[]{1, 2, 3});
        a = new long[]{5, 2, 5, 2, 0, -2, -1, -6};
        LSDLong.LSD(a);
        Assert.assertArrayEquals(a, new long[]{-6, -2, -1, 0, 2, 2, 5, 5});
    }

}
