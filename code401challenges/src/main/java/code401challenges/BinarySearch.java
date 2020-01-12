package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int searchKey) {
        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;
        while (firstIndex <= lastIndex) {
            int midpointIndex = (int)Math.ceil((firstIndex + lastIndex)/2);
            if(searchKey < sortedArray[midpointIndex]) {
                lastIndex = midpointIndex - 1;
            } else if(searchKey > sortedArray[midpointIndex]) {
                firstIndex = midpointIndex + 1;
            } else return midpointIndex;
        }

        return -1;
    }
}
