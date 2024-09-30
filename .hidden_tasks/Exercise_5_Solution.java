```java
import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        int[] sortedNumbers = bubbleSort(Arrays.copyOf(numbers, numbers.length));
        System.out.println("Sorted Array: " + Arrays.toString(sortedNumbers));

        int searchValue = 7;
        int position = linearSearch(sortedNumbers, searchValue);
        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }

        reverseArray(sortedNumbers);
        System.out.println("Reversed Array: " + Arrays.toString(sortedNumbers));
    }

    private static int[] bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
```