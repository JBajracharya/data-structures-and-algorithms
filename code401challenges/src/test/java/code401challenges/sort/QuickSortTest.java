package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] arr = {8,4,23,42,16,15};
        QuickSort.quickSort(arr, 0, arr.length - 1);

        int[] expected = {4, 8, 15, 16, 23, 42};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testFewUniques() {
        int[] arr = {5,12,7,5,5,7};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {5, 5, 5, 7, 7, 12};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray(){
        int[] arr = {};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }
}