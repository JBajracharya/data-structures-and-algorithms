package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {8,4,23,42,16,15, 12};
        MergeSort.mergeSort(arr);
        int[] expected = {4, 8, 12, 15, 16, 23, 42};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void merge() {
        int[] left = {5, 3};
        int[] right = {10, 1};
        int[] arr = {1,1, 2, 3};
        
        MergeSort.merge(left, right, arr);
        int[] expected = {5, 3, 10, 1};
        assertArrayEquals(expected, arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void testEmptyArray() {
        int[] emptyArray = {};
        MergeSort.mergeSort(emptyArray);
        String expected = "Cannot Sort! Array is empty";
    }
}