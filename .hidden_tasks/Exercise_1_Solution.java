```java
public class IntroductionToJavaArrays {

    public static void main(String[] args) {
        // Step 1: Declare and Initialize an Array of Integers
        int[] numbers = {2, 4, 6, 8, 10};

        // Step 2: Print the Length of the Array
        System.out.println("The length of the array is: " + numbers.length);

        // Step 3: Iterate Through the Array and Print Each Element
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " is: " + numbers[i]);
        }

        // Step 4: Calculate and Print the Sum of All Elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of all elements is: " + sum);

        // Step 5: Find and Print the Maximum Element
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The maximum element is: " + max);

        // Step 6: Find and Print the Minimum Element
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The minimum element is: " + min);

        // Step 7: Reverse the Array and Print It
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Element at reverse index " + (numbers.length - 1 - i) + " is: " + numbers[i]);
        }
    }
}
```