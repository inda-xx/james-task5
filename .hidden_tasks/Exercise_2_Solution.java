```java
public class ArrayManipulations {

    // Method to reverse an array
    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - 1 - i];
        }
        return reversedArray;
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to sum all elements in an array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to check if an array contains a specific value
    public static boolean containsValue(int[] array, int value) {
        for (int val : array) {
            if (val == value) {
                return true;
            }
        }
        return false;
    }

    // Method to find the index of the first occurrence of a value in an array (-1 if not found)
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    // Main method to test the implemented methods
    public static void main(String[] args) {
        int[] myArray = {3, 8, 9, 7, 5};

        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        
        // Test reverseArray method
        int[] reversed = reverseArray(myArray);
        System.out.println("\nReversed array:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }

        // Test findMax method
        System.out.println("\nMaximum value: " + findMax(myArray));

        // Test sumArray method
        System.out.println("Sum of values: " + sumArray(myArray));

        // Test containsValue method
        System.out.println("Array contains 9? " + containsValue(myArray, 9));

        // Test indexOf method
        System.out.println("Index of 7: " + indexOf(myArray, 7));
    }
}
```