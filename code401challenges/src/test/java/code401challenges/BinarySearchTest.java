package code401challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int[] inputArray = {4, 8, 26, 15, 43, 18, 10, 12};
        int inputNumber = 15;
        int output  = 3;
        int actual = BinarySearch.binarySearch(inputArray, inputNumber);

        assertEquals("Expected 15", output, actual);
    }

}
