package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void testInsertionSort() {
        int[] arr = {2, 4, 1, 15, 8, 7};
        InsertionSort.insertionSort(arr);

        int[] expected = {1, 2, 4, 7, 8, 15};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testOneElementArray() {
        int[] arr = {-5};
        InsertionSort.insertionSort(arr);
        int[] expected = {-5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void emptyArray() {
        int[] arr = {};
        InsertionSort.insertionSort(arr);
        assertEquals(0, arr.length);
    }

}