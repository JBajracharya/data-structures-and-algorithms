package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testArrayShift() {
        int[] input = new int[] { 1, 4, 5, 6};
        int[] output = new int[] {1, 4, 8, 5, 6};
        assertArrayEquals(output, ArrayShift.insertShiftArray(input, 8));
    }

    @Test public  void testOddArrayShift() {
        int[] input = new int[] { 1, 4, 5, 6, 10};
        int[] output = new int[] {1, 4, 5, 9, 6, 10};
        assertArrayEquals(output, ArrayShift.insertShiftArray(input, 9));
    }

    @Test public void testEmptyArrayShift() {
        int[] input = new int[] {};
        int[] output = new int[] {3};
        assertArrayEquals(output, ArrayShift.insertShiftArray(input, 3));
    }

}