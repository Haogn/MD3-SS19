package baitap.bt4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FindMaxTest {
    @Test
    public void testFindMaxWithValidInput() {
        int[] numbers = {1, 5, 3, 9, 2, 7};
        int max = FindMax.findMax(numbers);
        assertEquals(9, max);
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        int[] numbers = {-1, -5, -3, -9, -2, -7};
        int max = FindMax.findMax(numbers);
        assertEquals(-1, max);
    }

    @Test
    public void testFindMaxWithMixedNumbers() {
        int[] numbers = {-1, 5, 0, -9, 2, 7};
        int max = FindMax.findMax(numbers);
        assertEquals(7, max);
    }

    @Test
    public void testFindMaxWithSingleElement() {
        int[] numbers = {42};
        int max = FindMax.findMax(numbers);
        assertEquals(42, max);
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {
            FindMax.findMax(numbers);
        });
    }

    @Test
    public void testFindMaxWithNullArray() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> {
            FindMax.findMax(numbers);
        });
    }
}
