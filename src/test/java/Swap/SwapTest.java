package Swap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest {
    @Test
    public void testSwap() throws Exception {
        Double[] result = Swap.swap(0, 1, new Double(1.5), new Double(2), new Double(3));
        Double[] expected = {2.0, 1.5, 3.0};
        Assert.assertArrayEquals(expected, result);
    }
}