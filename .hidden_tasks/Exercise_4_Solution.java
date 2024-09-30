```java
import java.util.ArrayList;
import java.util.Arrays;

public class AdvancedArrayManipulations {

    // Method to reverse an array
    private static int[] reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
        return array;
    }

    // Method to find duplicates in an array
    private static ArrayList<Integer> findDuplicates(int[] array) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] && !duplicates.contains(array[i])) {
                duplicates.add(array[i]);
            }
        }
        return duplicates;
    }

    // Method to merge and sort two arrays
    private static int[] mergeAndSortArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }

    public static void main(String[] args) {
        // Example usage:

        // Reversing an array
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(array.clone());
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

        // Finding duplicates in an array
        int[] arrayWithDuplicates = {1, 2, 3, 2, 4, 5, 4, 6};
        ArrayList<Integer> duplicates = findDuplicates(arrayWithDuplicates);
        System.out.println("Duplicates: " + duplicates);

        // Merging and sorting two arrays
        int[] array1 = {5, 3, 1};
        int[] array2 = {6, 4, 2};
        int[] mergedAndSortedArray = mergeAndSortArrays(array1, array2);
        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedAndSortedArray));
    }
}
```