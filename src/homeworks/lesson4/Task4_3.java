package homeworks.lesson4;

public class Task4_3 {
    public static void main(String[] args) {
        int[] array = Task4_1.initializeRandomArray(10);
        Task4_1.printArray(array);
        int[] sortedArray = sortArrayInDescendingOrder(array);
        Task4_1.printArray(sortedArray);

    }

    // 4.3 Create array with length 10 Initialize with random ints (10 - 99)
    // print it sort it in 'desc' order print the sorted

    public static int[] sortArrayInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    Task4_2.swap(array, i, j);
                }
            }
        }
        return array;
    }
}
