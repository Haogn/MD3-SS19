package baitap.bt5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FindMinTest {
    @Test
    public void testFindMinWithValidInput() {
        int[] numbers = {5, 3, 9, 2, 7, 1};
        int min = FindMin.findMin(numbers);
        assertEquals(1, min);
    }

    @Test
    public void testFindMinWithNegativeNumbers() {
        int[] numbers = {-5, -3, -9, -2, -7, -1};
        int min = FindMin.findMin(numbers);
        assertEquals(-9, min);
    }

    @Test
    public void testFindMinWithMixedNumbers() {
        int[] numbers = {-1, 5, 0, -9, 2, 7};
        int min = FindMin.findMin(numbers);
        assertEquals(-9, min);
    }

    @Test
    public void testFindMinWithSingleElement() {
        int[] numbers = {42};
        int min = FindMin.findMin(numbers);
        assertEquals(42, min);
    }

    @Test
    public void testFindMinWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {
            FindMin.findMin(numbers);
        });
    }

    @Test
    public void testFindMinWithNullArray() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> {
            FindMin.findMin(numbers);
        });
    }
}
