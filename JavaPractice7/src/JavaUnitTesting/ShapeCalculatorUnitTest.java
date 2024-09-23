package JavaUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeCalculatorUnitTest {

    @Test
    public void case1() {
        square sq = new square(4);
        double area = sq.area();
        double expectedOutput = 16.0;
        assertEquals(expectedOutput, area, 0.0001);
    }

    @Test
    public void case2() {
        assertThrows(ArithmeticException.class, () -> {
            square sq = new square(-4);
        });
    }

    @Test
    public void case3() {
        square sq = new square(4);
        double perimeter = sq.perimeter();
        double expectedOutput = 16.0;
        assertEquals(expectedOutput, perimeter, 0.0001);
    }

    @Test
    public void case5() {
        rectangle rec = new rectangle(4, 4);
        double area = rec.area();
        double expectedOutput = 16.0;
        assertEquals(expectedOutput, area, 0.0001);
    }

    @Test
    public void case6() {
        assertThrows(ArithmeticException.class, () -> {
            rectangle rec = new rectangle(-4, 0);
        });
    }

    @Test
    public void case7() {
        rectangle rec = new rectangle(4, 4.2);
        double perimeter = rec.perimeter();
        double expectedOutput = 16.4;
        assertEquals(expectedOutput, perimeter, 0.0001);
    }

    @Test
    public void case10() {
        rectangle rec = new rectangle(4, 0);
        double perimeter = rec.perimeter();
        double expectedOutput = 8.0;  
        assertEquals(expectedOutput, perimeter, 0.0001);
    }

    @Test
    public void case11() {
        rectangle rec = new rectangle(0, 4.2);
        double area = rec.area(); 
        double expectedOutput = 0.0;
        assertEquals(expectedOutput, area, 0.0001);
    }
}
