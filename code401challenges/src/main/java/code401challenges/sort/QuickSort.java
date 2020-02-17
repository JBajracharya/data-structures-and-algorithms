package code401challenges.sort;

public class QuickSort {

    public static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if(leftIndex < rightIndex) {

            int partitionIndex = partition(arr, leftIndex, rightIndex);

            quickSort(arr, leftIndex, partitionIndex - 1);

            quickSort(arr,partitionIndex + 1, rightIndex);
        }
    }

    public static int partition(int[] arr, int leftIndex, int rightIndex) {
        int pivot = arr[rightIndex];
        int low = leftIndex - 1;

        for(int i = leftIndex; i < rightIndex; i++) {
            if(arr[i] <= pivot) {
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, rightIndex, low + 1);
        return low + 1;
    }

    public static void swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
