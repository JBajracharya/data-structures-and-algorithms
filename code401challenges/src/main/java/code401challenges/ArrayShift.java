package code401challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] array, int number) {
        int[] newArray = new int[array.length + 1];
        int midpoint = 0;
        if ((array.length % 2) == 0) {
            midpoint = array.length/2;
        } else {
            midpoint = (array.length + 1)/2;
        }

        for(int i = 0; i < newArray.length; i++) {
            if ( i < midpoint) {
                newArray[i] = array[i];
            } else if (i == midpoint) {
                newArray[i] =  number;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }
}
