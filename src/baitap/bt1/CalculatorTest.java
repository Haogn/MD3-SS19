package baitap.bt1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }
    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(2, 5));
        assertEquals(0, calculator.subtract(0, 0));
    }
}
