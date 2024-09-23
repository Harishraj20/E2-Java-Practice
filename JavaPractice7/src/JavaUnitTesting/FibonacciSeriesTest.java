package JavaUnitTesting;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciSeriesTest {
    FibonacciSeries fibo = new FibonacciSeries();

    @Test
    public void testFibonacciOfZero() {
        assertEquals(0, fibo.fibonacci(0));
    }

    @Test
    public void testFibonacciOfOne() {
        assertEquals(1, fibo.fibonacci(1));
    }

    @Test
    public void testFibonacciOfTwo() {
        assertEquals(1, fibo.fibonacci(2));
    }
    @Test
    public void testFibonacciOfThree() {
        assertEquals(2, fibo.fibonacci(3));
    }

    @Test
    public void testFibonacciOfFour() {
        assertEquals(3, fibo.fibonacci(4));
    }

    @Test
    public void testFibonacciOfFive() {
        assertEquals(5, fibo.fibonacci(5));
    }

    @Test
    public void testFibonacciOfSix() {
        assertEquals(8, fibo.fibonacci(6));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciOfNegativeNum() {
        assertEquals(0, fibo.fibonacci(-6));
    }
}
