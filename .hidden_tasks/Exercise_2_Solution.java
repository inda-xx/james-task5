```java
public class EnhancedArraysAndLoops {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 6, 2, 10, 7};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        
        // Calculate sum, max, and min using a basic for loop
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        
        // Enhanced for loop to print each element
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Find the average of array elements
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
        
        // Double the values in the array using a basic for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        
        // Print modified array using enhanced for loop
        System.out.println("Modified array with elements doubled:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```