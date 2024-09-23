package JavaUnitTesting;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddNumberTest {
    private SimpleCalculator calculator = new SimpleCalculator();

    // Tests for addition
    @Test
    public void testAddNumPositive() {
        int output = calculator.addNum(10, 10);
        assertEquals(20, output);
    }

    @Test
    public void testAddNumWithNegative() {
        int output = calculator.addNum(-5, 5);
        assertEquals(0, output);
    }

    @Test
    public void testAddNumWithZeros() {
        int output = calculator.addNum(0, 0);
        assertEquals(0, output);
    }

    @Test
    public void testAddNumWithZero() {
        int output = calculator.addNum(0, 10);
        assertEquals(10, output);
    }

    @Test
    public void testAddNumBothNegative() {
        int output = calculator.addNum(-5, -5);
        assertEquals(-10, output);
    }

    @Test
    public void testAddNumWithOneNegativeAndZero() {
        int output = calculator.addNum(-10, 0);
        assertEquals(-10, output);
    }

    // Tests for multiplication
    @Test
    public void testMultiplyNumPositive() {
        int output = calculator.multiplyNum(5, 4);
        assertEquals(20, output);
    }

    @Test
    public void testMultiplyNumWithZero() {
        int output = calculator.multiplyNum(0, 10);
        assertEquals(0, output);
    }

    @Test
    public void testMultiplyNumWithNegative() {
        int output = calculator.multiplyNum(-5, 5);
        assertEquals(-25, output);
    }

    @Test
    public void testMultiplyNumBothNegative() {
        int output = calculator.multiplyNum(-3, -4);
        assertEquals(12, output);
    }

    
    // Tests for squaring a number
    @Test
    public void testSquareNumPositive() {
        int output = calculator.squareNum(4);
        assertEquals(16, output);
    }

    @Test
    public void testSquareNumNegative() {
        int output = calculator.squareNum(-3);
        assertEquals(9, output);
    }

    @Test
    public void testSquareNumZero() {
        int output = calculator.squareNum(0);
        assertEquals(0, output);
    }
    

    // Tests for division
    @Test
    public void testDivideNumPositive() {
        int output = calculator.divideNum(10, 2);
        assertEquals(5, output);
    }

    @Test
    public void testDivideNumByOne() {
        int output = calculator.divideNum(10, 1);
        assertEquals(10, output);
    }

    @Test
    public void testDivideNumByNegative() {
        int output = calculator.divideNum(10, -2);
        assertEquals(-5, output);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideNumByZero() {
        calculator.divideNum(10, 0);
    }
}
