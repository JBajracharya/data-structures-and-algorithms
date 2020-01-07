public class ArrayReverse {
    public static void main(String args[]) {
        int[] array1 = {1, 3, 4, 6, 2, 5, 10, 9, 20};
        int[] reverseArray = reverseArray(array1);
        for (int el : reverseArray){
            System.out.println(el);
        }
    }
    public static int[] reverseArray(int[] array) {
        int halfway;
        if (array.length % 2 == 0) {
            halfway = array.length/2;
        } else {
            halfway = (array.length + 1)/2;
        }
        for(int i = 0; i < halfway; i++){
            if (i == halfway && array.length % 2 != 0){
                return array;
            }
            int temp;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}