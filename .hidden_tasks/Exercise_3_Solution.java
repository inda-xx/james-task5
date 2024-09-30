```java
public class AdvancedArrayManipulations {

    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        
        System.out.println("Original array:");
        printArray(numbers);

        reverseArray(numbers);
        System.out.println("Reversed array:");
        printArray(numbers);

        int sum = sumArray(numbers);
        System.out.println("Sum of array elements: " + sum);

        double average = averageArray(numbers);
        System.out.println("Average of array elements: " + average);

        int max = findMax(numbers);
        System.out.println("Maximum element in the array: " + max);

        int min = findMin(numbers);
        System.out.println("Minimum element in the array: " + min);

        int target = 15;
        boolean exists = contains(numbers, target);
        System.out.println("Array contains " + target + ": " + exists);
    }
    
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double averageArray(int[] array) {
        int totalSum = sumArray(array);
        return (double) totalSum / array.length;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
```