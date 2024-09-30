```java
public class AdvancedArrayManipulations {

    public static void main(String[] args) {
        // Task 1: Initialize an array of integers with some values
        int[] numbers = {34, 7, 23, 32, 5, 62};

        // Task 2: Find the maximum value in the array
        int max = findMax(numbers);
        System.out.println("Maximum value: " + max);

        // Task 3: Sort the array in ascending order
        int[] sortedArray = sortArray(numbers);
        System.out.print("Sorted Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Task 4: Reverse the array
        int[] reversedArray = reverseArray(numbers);
        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Task 5: Find the second largest number in the array
        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second Largest Number: " + secondLargest);
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = array.clone();
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    private static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
```