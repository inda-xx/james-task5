```java
import java.util.Arrays;

public class AdvancedArrayManipulation {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 13, 21, 33, 47};
        int[] result = manipulateArray(numbers);
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Manipulated array: " + Arrays.toString(result));
    }

    public static int[] manipulateArray(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 3 == 0) {
                output[i] = input[i] * 2;
            } else {
                output[i] = input[i] + 5;
            }
        }
        return output;
    }
}
```