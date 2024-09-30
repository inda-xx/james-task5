```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExercise {

    public static void main(String[] args) {
        // Example Array and ArrayList
        int[] numbersArray = {10, -3, 5, 0, -1, 7};
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(10, -3, 5, 0, -1, 7));
        
        // 1. Sort the Array and ArrayList
        Arrays.sort(numbersArray);
        Collections.sort(numbersList);
        
        // 2. Find the sum of all elements in the array
        int sumArray = 0;
        for (int num : numbersArray) {
            sumArray += num;
        }
        
        // 3. Find the sum of all elements in the ArrayList
        int sumList = 0;
        for (int num : numbersList) {
            sumList += num;
        }
        
        // 4. Find the average of the array
        double averageArray = sumArray / (double) numbersArray.length;
        
        // 5. Find the average of the ArrayList
        double averageList = sumList / (double) numbersList.size();
        
        // 6. Find the maximum and minimum element of the array
        int maxArray = numbersArray[numbersArray.length - 1];
        int minArray = numbersArray[0];
        
        // 7. Find the maximum and minimum element of the ArrayList
        int maxList = Collections.max(numbersList);
        int minList = Collections.min(numbersList);
        
        // 8. Remove all negative elements from the array and create a new array
        int[] nonNegativeArray = Arrays.stream(numbersArray).filter(n -> n >= 0).toArray();
        
        // 9. Remove all negative elements from the ArrayList
        numbersList.removeIf(n -> n < 0);
        
        // 10. Convert the array to an ArrayList
        List<Integer> arrayToList = new ArrayList<>();
        for (int num : numbersArray) {
            arrayToList.add(num);
        }
        
        // Display results
        System.out.println("Sorted Array: " + Arrays.toString(numbersArray));
        System.out.println("Sorted ArrayList: " + numbersList);
        System.out.println("Sum of Array: " + sumArray);
        System.out.println("Sum of ArrayList: " + sumList);
        System.out.println("Average of Array: " + averageArray);
        System.out.println("Average of ArrayList: " + averageList);
        System.out.println("Max of Array: " + maxArray);
        System.out.println("Min of Array: " + minArray);
        System.out.println("Max of ArrayList: " + maxList);
        System.out.println("Min of ArrayList: " + minList);
        System.out.println("Non-negative Array: " + Arrays.toString(nonNegativeArray));
        System.out.println("Array to List: " + arrayToList);
    }
}
```