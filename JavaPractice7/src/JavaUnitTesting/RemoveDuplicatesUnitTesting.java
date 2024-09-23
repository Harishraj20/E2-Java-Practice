package JavaUnitTesting;

import static org.junit.Assert.*;
import java.util.Set;
import org.junit.Test;

public class RemoveDuplicatesUnitTesting {

    @Test
    public void case1() {
        int[] input = {1, 2, 3, 2, 4, 5, 5};
        Set<Integer> expectedOutput = Set.of(1, 2, 3, 4, 5);
        Set<Integer> actualOutput = RemoveDuplicates.removeDuplicates(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void case2() {
        int[] input = {};
        Set<Integer> expectedOutput = Set.of();
        Set<Integer> actualOutput = RemoveDuplicates.removeDuplicates(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void case3() {
        int[] input = {1,2,3,4,5};
        Set<Integer> expectedOutput = Set.of(1,2,3,4,5);
        Set<Integer> actualOutput = RemoveDuplicates.removeDuplicates(input);
        assertEquals(expectedOutput, actualOutput);
    }




}
