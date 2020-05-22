package homeworks.lesson4;

public class Task4_2 {
    public static void main(String[] args) {
        int[] array = Task4_1.initializeRandomArray(10);
        Task4_1.printArray(array);
        int[] sortedArray = sortArrayInAscendingOrder(array);
        Task4_1.printArray(sortedArray);
    }

    // 4.2 Create array with length 10 Initialize with random ints (10 - 99)
    // print it sort it in 'asc' order print the sorted

    public static int[] sortArrayInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    swap(array, i, j);
                }
            }
        }
        return array;
    }


    public static void swap(int[] array, int i, int j) {
        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }
}
