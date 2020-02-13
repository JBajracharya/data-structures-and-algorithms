package code401challenges.sort;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if(arr.length == 0) {
            throw new IllegalArgumentException("Cannot Sort! Array is empty");
        }

        int n = arr.length;

        if(n > 1) {
            int mid = n/2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);

            //sort left side
            mergeSort(left);
            //sort right side
            mergeSort(right);
            //merge the sorted left and right side together
            merge(left, right, arr);
        }
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j  = j + 1;
            }
            k  = k + 1;
        }

        if(i == left.length) {
            while(k < arr.length) {
                arr[k] = right[j];
                j = j + 1;
                k = k + 1;
            }
        } else {
            while ( k < arr.length) {
                arr[k] = left[i];
                i = i + 1;
                k = k + 1;
            }
        }
    }
}

