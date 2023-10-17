package baitap.bt2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    @Test
    public void testMultiplicationWithPositiveNumbers() {
        double result = Multiplication.multiplication(2.5, 3.0);
        assertEquals(7.5, result, 0.0001);

        result = Multiplication.multiplication(0.0, 4.8);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        double result = Multiplication.multiplication(-2.5, -3.0);
        assertEquals(7.5, result, 0.0001);

        result = Multiplication.multiplication(-2.5, 0.0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testMultiplicationWithZero() {
        double result = Multiplication.multiplication(0.0, 0.0);
        assertEquals(0.0, result, 0.0001);
    }
}
