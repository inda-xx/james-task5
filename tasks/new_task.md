# Task Introduction

## Introduction to Game Development with Arrays and Loops

Welcome to your journey into the fascinating world of game development! Today, we embark on an exciting mission: creating a simple yet engaging game application. This project will not only introduce you to the fundamentals of game design but also deepen your understanding of essential programming concepts such as arrays and loops. 

### Setting the Stage

Imagine a virtual playground where players can navigate their characters across a digital landscape, score points, and face challenges from cunning enemies. These core elements—player movement, a scoring system, and enemy interactions—are what we will bring to life. But beyond the surface, lies a world of logic and structure waiting to be explored.

### Theoretical Background

#### Arrays: The Organized Collectors

Arrays act as containers that hold multiple values, all of the same type. Think of them as organized rows of data where each slot can store a unique element—be it numbers representing scores, coordinates for player positions, or attributes of lurking enemies. Understanding how to work with arrays will enable you to efficiently manage and manipulate these collections of data in your game.

#### Loops: The Great Repeater

Loops are the heartbeats of your game, tirelessly repeating specific actions until you've met desired conditions. Whether it's continuously updating the player's position on the screen or checking for collisions with enemies, loops allow your code to perform repetitive tasks without repeating yourself. Mastering loops provides the capability to create dynamic and responsive game interactions.

### The Learning Goals

In this task, you will apply array structures to manage game elements such as keeping track of player scores or storing enemy positions. Loops will help you iterate over these arrays, ensuring that each element is promptly updated during the game, creating seamless and engaging player experiences.

### The Challenge Awaits

As you embark on this task, remember: breaking down the problem into manageable pieces is key. Start simple—set up your game world, then progressively add complexity with new features and interactive elements. By the end of this task, you'll not only have built a basic functioning game but also gained confidence in manipulating arrays and loops—skills that are invaluable in the realm of programming.

Ready your coding tools and prepare to dive into the code! Your adventure in game development starts now. Let’s create something fun, engaging, and educational.

## 📝 Preparation

### 📝 Preparation Steps

Before starting the task on Java collections, specifically focusing on `Array` and `ArrayList`, it's important to ensure you have a solid understanding of the foundational concepts. These preparation steps will guide you through the necessary materials and activities to align with this week's learning goals:

1. **Understanding Arrays:**
   - Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p) that cover the basics and advanced details of arrays in Java.
   - Read about arrays in the [Oracle's Official Java Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html) to understand their syntax, usage, and features.
   
2. **Introduction to ArrayLists:**
   - Familiarize yourself with `ArrayList` by reading the [Oracle's ArrayList documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html). Focus on learning when and why you would use an `ArrayList` instead of a traditional array.
   
3. **Working with Loops and Collections:**
   - Revisit the concept of loops, particularly the `for` and `foreach` (enhanced for) loops, which are extensively used with arrays and array lists. Use the [Oracle tutorial on for-statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html) as a resource.
   - Practice combining loops with arrays and `ArrayLists` by writing small programs that utilize both constructs effectively.

4. **Understanding the `static` Keyword:**
   - Read about the `static` keyword in the [Official Java Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html). Pay attention to how `static` can be applied to methods and fields, and how this affects their behavior in a class versus when instanced as an object.

5. **Module 5: Grouping Objects:**
   - Complete the questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects), which will deepen your understanding of how objects are grouped and managed within Java collections.

By thoroughly reviewing these materials and practicing these concepts, you'll be well-prepared to tackle the tasks relating to arrays and array lists, meeting this week's learning goals of understanding how to work with these collections, understanding static methods, and combining loops and collections effectively.

## ✅ Learning Goals

Certainly! Here are the learning goals for the task, presented in a clear, bullet-point format:

### Learning Goals

- **Understanding Arrays**
  - Gain a foundational understanding of arrays as a basic data structure in Java.
  - Learn how to declare, initialize, and manipulate arrays using index positions.
  - Explore various methods to access, modify, and return array elements.

- **Working with Loops**
  - Master the use of traditional for-loops to iterate over arrays.
  - Understand and implement the enhanced for-loop (foreach loop) for simplifying array iteration.
  - Combine loops with arrays to perform operations such as summing elements, finding minimums, and reversing the order of elements.

These goals aim to help students familiarize themselves with essential concepts in Java programming, enhancing their ability to manage collections of data efficiently.

## 🏛 Assignment

# Assignment: Java Collections - Arrays and ArrayLists

Welcome to this week's assignment on Java Collections! You'll be diving into arrays and ArrayLists, essential tools for organizing groups of objects in Java. As you work through these exercises, keep the learning goals in mind: understanding arrays, the `static` keyword, and mastering loop operations with collections.

## 💀 Deadline
Complete this assignment before the exercise on **Friday, October 4**.

## 👩‍🏫 Instructions
For submission guidance, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-24/course-instructions#assignments).

## 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Engage with and answer all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)

## ✅ Learning Goals
By completing this assignment, you will achieve the following:

1. Gain proficiency in working with `Arrays`.
2. Understand and utilize the `static` keyword effectively.
3. Develop competence in using `ArrayLists`.
4. Practice combining loops with collections.

## 🚨 Troubleshooting Guide
If you encounter any issues, here's the troubleshooting procedure:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) for similar questions from other students.
2. If your issue is not addressed, create a new issue by selecting [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new), and use a descriptive title starting with "Task *x*: *summary of your problem*".
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA); check your schedule for the next lab timing.

You are encouraged to engage with your peers for discussion, but remember not to share answers. Similarly, while AI services can aid in explanations, do not submit AI-generated solutions, as you need to be able to explain and be responsible for your solutions during examinations.

## 🏛 Assignment

### Java Arrays

Understanding arrays and their operations is fundamental in Java programming. Let's start with exercises focusing on arrays:

#### Exercise 5.0: Creating the `Arrays` class
Create a new class named `Arrays` in a file called `Arrays.java`.

#### Exercise 5.1: Average of an Array (Integer)
Write a static method to calculate the average of an integer array, rounding down to the nearest integer:

```java
public static int average(int[] array)
```

#### Exercise 5.2: Average of an Array (Double)
Create another method to calculate the average of a double array:

```java
public static double average(double[] array)
```

#### Exercise 5.3: Smallest Element in an Array
Implement a method to identify the smallest element in an integer array. If the array is empty, return `Integer.MAX_VALUE`:

```java
public static int smallestElement(int[] array)
```

#### Exercise 5.4: Reverse an Array
Construct a method that takes an integer array and returns a new array with elements in reverse order:

```java
public static int[] reverse(int[] array)
```

#### Exercise 5.5: Return Only Even Numbers
Create a method to return all even numbers from an array without modifying the original array:

```java
public static int[] evenNumbers(int[] array)
```

### Set Theory with ArrayLists

Now you'll use `ArrayLists` to handle sets, which are collections of unique elements.

#### Exercise 5.6: `SetTheory.java` and `generateSet`
Create a `SetTheory.java` file and implement:

```java
public static ArrayList<Integer> generateSet(int min, int max)
```

This method should return an ArrayList of integers between the specified range `[min, max)`. Handle edge cases appropriately, ensuring only integers between 0 and 99 are included.

#### Exercise 5.7: Union of Sets
Write a method to find the union of two ArrayLists:

```java
public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b)
```

Ensure the result is a set with unique elements.

#### Exercise 5.8: Intersection of Sets
Implement a method to find the intersection of two ArrayLists:

```java
public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b)
```

#### Exercise 5.9: Complement of a Set
Create a method to find the complement of a set within the universe of numbers 0 to 99:

```java
public static ArrayList<Integer> complement(ArrayList<Integer> a)
```

#### Exercise 5.10: Cardinality of a Set
Develop a method to calculate the cardinality (number of elements) in a set:

```java
public static int cardinality(ArrayList<Integer> a)
```

#### Exercise 5.11: Cardinality of a Union
Write a method to find the cardinality of the union of two sets:

```java
public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b)
```

## ❎ Checklist
- Exercises in `Arrays.java`:
  - Calculate integer and double averages.
  - Identify the smallest element.
  - Reverse an array without modifying the original.
  - Extract even numbers from an array.
- Exercises in `SetTheory.java`:
  - Generate sets within specified constraints.
  - Perform union and intersection operations.
  - Determine set complements and cardinality.
  - Calculate cardinality of union.

## 🐞 Bugs and Errors?
If any inconsistencies or errors are found in this task, please report them by opening a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) titled "Task *x* Error: *summary of error*". Contributions will be acknowledged.

## 🙏 Acknowledgments
Task designed by:
- Linus Östlund
- Sofia Bobadilla
- Gabriel Skoglund
- Arvid Siberov
- Alexander Runebou

Proofreading & Bug fixes:
- Jimmy Tran
- Edwin Wästlund

---

Good luck, and enjoy mastering Java Collections!

#### Exercise 1

# Exercise 1: Introduction to Arrays and Loops

In this exercise, you will start exploring the basics of arrays in Java and strengthen your understanding of loop constructs. This will serve as the foundation for working with more complex data structures and algorithms. By the end of this exercise, you should be able to declare and manipulate arrays using loops.

### 💀 Deadline
Complete this exercise before working on further exercises to solidify your understanding.

### 📝 Preparation
1. Review the [Arrays section of the Java tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html).
2. Ensure you understand how for-loops and while-loops function by reviewing the relevant sections in your course materials.

### ✅ Learning Goals
- Understanding arrays
- Working with loops (for-loops and while-loops)
- Combining loops and arrays

### 🔍 Task Description

#### Exercise 1.1: Array Basics
Create a Java class called `ArrayBasics` where you will perform your first exercise.

1. **Initialize an Array**:
   - Create an integer array of size 5 and initialize it with the first five positive odd numbers (e.g., 1, 3, 5, 7, 9).

2. **Print the Array**:
   - Use a for-loop to iterate over the array and print each element to the console on a new line.

3. **Sum of Elements**:
   - Write a method called `sumArray` that takes an integer array as a parameter and returns the sum of its elements. Use a for-loop to calculate the sum.
   - In your `main` method, call `sumArray` with the array you initialized and print the result.

```java
public class ArrayBasics {
    public static void main(String[] args) {
        // Step 1: Initialize an array
        int[] oddNumbers = {1, 3, 5, 7, 9};

        // Step 2: Print the array
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }

        // Calculate and print the sum
        int sum = sumArray(oddNumbers);
        System.out.println("Sum of array elements: " + sum);
    }

    // Method to sum array elements
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
```

#### Exercise 1.2: Array Manipulation with While Loop

1. **Reverse the Array**:
   - Write a method `reverseArray` that takes an integer array and returns a new array with the elements in reverse order. Use a while-loop to achieve this.
   - Print the reversed array elements in the `main` method.

```java
    // Continue from ArrayBasics

    // Method to reverse array elements using a while-loop
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        int index = 0;
        int i = array.length - 1;
        while (i >= 0) {
            reversed[index] = array[i];
            index++;
            i--;
        }
        return reversed;
    }
```

Integrate the reverseArray method call in your `main` method:
```java
// Insert this into the main method of the ArrayBasics class
int[] reversedArray = reverseArray(oddNumbers);
System.out.println("Reversed array:");
for (int num : reversedArray) {
    System.out.println(num);
}
```

### 🚨 Troubleshooting Guide
If you encounter issues, refer to the following steps:

1. Review the syntax and ensure array indices and loop conditions are correct.
2. Use print statements to debug and check the flow of your loops and methods.
3. Discuss with peers for alternative solutions or explanations if you get stuck.

### ❎ Checklist
- [ ] Initialize and print an array.
- [ ] Correctly implement and call the `sumArray` method.
- [ ] Implement and test the `reverseArray` function using a while-loop.

> **Assistant's Note:** Once you are comfortable with these basic array operations and loops, you can move on to more challenging exercises that involve interacting with collections such as `ArrayLists`.

### 🐞 Bugs and Errors?

If you encounter any issues with this exercise, consider reaching out to your instructor or using available forums for further assistance. Your feedback helps improve the exercise content!

#### Exercise 2

### Exercise 2: Array Manipulations and Looping

For this set of exercises, we aim to deepen your understanding of arrays, loops, and how they interact. You will be tasked with implementing several methods that will manipulate arrays in different ways. These exercises will build on the concepts of indexing, iteration, and array operations, reinforcing your ability to work with Java collections.

#### Exercise 2.1 -- Rotate Array

Create a method that rotates the elements of an array by a specified number of positions to the right. It should have the following header:

```java
public static int[] rotateRight(int[] array, int positions)
```

The method should rotate the elements of the given array `positions` times to the right and return the resulting array. If `positions` is zero, the array should remain unchanged. If the array is empty or null, return an empty array. 

**Example:**

- Input: array = {1, 2, 3, 4, 5}, positions = 2
- Output: {4, 5, 1, 2, 3}

**Hints:**

- Consider using modular arithmetic to handle cases where `positions` exceeds the length of the array.
- To avoid modifying the original array, create a new array to store the rotated elements.

#### Exercise 2.2 -- Find Duplicates

Create a method that returns an array of duplicated elements found within an input array. It should have the following header:

```java
public static int[] findDuplicates(int[] array)
```

This method should return a new array containing all elements that appear more than once in the input `array`, preserving the order of their first occurrences as seen in the original array. If no duplicates exist, return an empty array.

**Example:**

- Input: array = {1, 2, 2, 3, 4, 4, 4, 5}
- Output: {2, 4}

**Hints:**

- Consider using a `boolean` array to track whether each number has been processed, to avoid checking duplicates more than once.

#### Exercise 2.3 -- Array Intersection

Implement a method that returns an array containing the intersection of two input arrays. It should have the following header:

```java
public static int[] intersect(int[] array1, int[] array2)
```

The method should return a new array containing all elements that appear in both `array1` and `array2`. The returned array should not contain duplicates and should maintain the order of appearance from `array1`.

**Example:**

- Input: array1 = {1, 2, 3, 4}, array2 = {3, 4, 5, 6}
- Output: {3, 4}

**Hints:**

- Use a helper method to check for duplicates when adding elements to the resulting array.

#### Exercise 2.4 -- Cumulative Sum Array

Create a method that returns an array representing the cumulative sum of elements. It should have the following header:

```java
public static int[] cumulativeSum(int[] array)
```

Each element in the result array should be the sum of all previous elements including the current one from the input `array`.

**Example:**

- Input: array = {1, 2, 3, 4}
- Output: {1, 3, 6, 10}

**Hints:**

- Iterate through the input array and keep a running total to calculate each sum.

These exercises should provide a challenging and comprehensive exploration of arrays and loops, helping you to deepen your understanding and application of these essential programming concepts. Make sure to encapsulate your logic into methods, and avoid in-place modifications unless explicitly stated. Good luck!

#### Exercise 3

### Exercise 3 -- Advanced Array Manipulations

Exercise 3 aims to challenge your understanding of arrays and loops through a series of connected tasks. Each task builds on what you have learned, deepening your comprehension of array and loop mechanics.

#### Exercise 3.1 -- Shift Elements of an Array
Write a method that takes an integer array and an integer `n` as inputs and returns a new array with elements shifted by `n` positions to the right. If `n` is negative, shift to the left. The elements that fall off are wrapped around to the beginning/end. The method signature should be:

```java
public static int[] shiftArray(int[] array, int n)
```

* For example, given `array = [1, 2, 3, 4]` and `n = 1`, the result should be `[4, 1, 2, 3]`.
* If `n = -1`, the result should be `[2, 3, 4, 1]`.

> **Assistant's Note:** Consider edge cases where `n` is larger than the array length or where `n` is zero.

#### Exercise 3.2 -- Find Duplicates in an Array
Create a method that identifies and returns a list of duplicate elements in an array. This method should return an integer array of the duplicates found. If there are no duplicates, return an empty array. It should have the following method header:

```java
public static int[] findDuplicates(int[] array)
```

* For example, given `array = [1, 2, 3, 2, 4, 5, 1]`, the result should be `[1, 2]`.

> **Assistant's Note:** Carefully consider the efficiency of your solution, especially with larger arrays.

#### Exercise 3.3 -- Zigzag Conversion
Implement a method that rearranges an array in a zigzag pattern. An array is in a zigzag pattern if its elements are in the form `a < b > c < d > e < f ...`. If the input array cannot be rearranged to the desired pattern with distinct elements, return an empty array. The method should have the following signature:

```java
public static int[] zigzagArray(int[] array)
```

* For example, given `array = [4, 3, 7, 1, 8, 5]`, a potential result is `[3, 7, 1, 8, 4, 5]`.

> **Assistant's Note:** Think about how you can leverage the properties of arrays and loops to efficiently achieve this pattern.

### 🚨 Additional Notes
- Each method should be implemented in a file called `AdvancedArrays.java`. Test your methods thoroughly with a variety of test cases to ensure robustness, such as arrays containing zeros, negative numbers, or arrays with all identical elements.

### Tips for Success
- Remember to consider edge cases, such as empty arrays or single-element arrays.
- Pay attention to the efficiency of your loop structures, especially when dealing with potentially large arrays.
- Review Java's array manipulation capabilities for potential optimizations in your solutions.

### Troubleshooting Guide
If you run into issues while implementing these exercises:
1. Review your loop logic and ensure it accounts for all array elements correctly.
2. Print intermediate results with `System.out.println` to understand your data flow.
3. Consult the provided references or reach out to peers or instructors if concepts are unclear.

By tackling these exercises, you will gain a deeper understanding of arrays and loop constructs in Java, providing a sound foundation for future programming challenges.

#### Exercise 4

## Exercise 4: Advanced Array Manipulations

Welcome to Exercise 4, where we will take your understanding of Java collections, particularly arrays and ArrayLists, to the next level. Building upon the knowledge of arrays and loops, this exercise challenges you with more complex tasks, combining logic, problem-solving, and coding skills.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Revisit [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)
- Ensure you understand how to work with arrays, utilize loops, and grasp the concept of method overloading and the use of static methods.

### 🎯 Learning Goals

This week's exercises focus on:

- Advanced usage of `Arrays`
- Mastering the `static` keyword
- Complex operations with `ArrayLists`
- Developing problem-solving skills through nested loops and conditions

### 📚 Overview

In this exercise, you will tackle a series of challenges that involve manipulating arrays and ArrayLists in ways that require a deeper understanding of collections and control structures in Java. These tasks are designed to push you beyond the basics and encourage creative solutions.

#### Exercise 4.1 -- Refactor for Reusability

Rewrite the `average` methods from the previous exercise so that they both call a private helper method to calculate the sum, demonstrating code reuse and method overloading. Create a helper method with the following header:

```java
private static double calculateSum(double[] array)
```

- For integer arrays, convert integers to doubles temporarily to leverage this method.

#### Exercise 4.2 -- Find Median in an Array

Write a method to find the median value of an unsorted integer array. The method should have the following header:

```java
public static double median(int[] array)
```

- Sort the array first without using Java's built-in sorting methods.
- Return the middle element if the array length is odd, or average the two middle elements if it's even.

#### Exercise 4.3 -- Rotate Array Elements

Implement a method to rotate the elements of an array to the right by a specified number of positions. It should have the following header:

```java
public static void rotateRight(int[] array, int positions)
```

- Modify the original array.
- Handle cases where `positions` are greater than the array length.

#### Exercise 4.4 -- ArrayList of Fibonacci Numbers

Create a method that generates an `ArrayList` containing the first `n` Fibonacci numbers. The method must have the following header:

```java
public static ArrayList<Integer> generateFibonacci(int n)
```

- Ensure the method handles invalid inputs (e.g., negative numbers) gracefully by returning an empty list.

#### Exercise 4.5 -- Merging Sorted Arrays

Given two sorted integer arrays, write a method to merge them into a single sorted array without using Java's built-in sorting functionalities. Use loops effectively. The method should have the following header:

```java
public static int[] mergeSortedArrays(int[] array1, int[] array2)
```

- Ensure the result is sorted.
- Handle edge cases like empty arrays.

#### Exercise 4.6 -- Remove Duplicates from ArrayList

Write a method to remove duplicate elements from an `ArrayList` of integers and return a new list with unique elements only. It should have the following header:

```java
public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
```

- Do not alter the original list.
- Test the method thoroughly with different input sizes and content.

### 💡 Tips

- Pay attention to edge cases, such as empty arrays or lists, when implementing your solutions.
- Utilize `ArrayLists` and understand when converting back and forth to arrays is necessary.
- Consider time and space complexities, especially in sorting-related tasks.
- Practice coding by hand or discussing pseudocode with peers if you're stuck on logic.

### ❗ Troubleshooting Guide

If you face issues:

1. Refer back to previous solutions; there's potential for reusable code or concepts.
2. Carefully read the [Java API documentation](https://docs.oracle.com/javase/8/docs/api/).
3. Reach out to peers for discussion and troubleshooting help, ensuring to avoid sharing complete solutions.

### 📌 Checklist

- [ ] Refactored average methods using helper for sum calculation
- [ ] Implemented median method for integer arrays
- [ ] Completed array rotation method
- [ ] Developed Fibonacci number generator
- [ ] Authored merging function for sorted arrays
- [ ] Removed duplicates efficiently in ArrayList

Take the time to explore multiple solutions and reflect on the most efficient approaches for these tasks. Good luck, and embrace the complexity—this is where your learning truly deepens!

#### Exercise 5

Exercise 5: Advanced Array Manipulation and Loop Integration

### Objective:
This exercise aims to push your understanding of arrays and loops to a deeper level, where you'll need to not only manipulate data but also optimize your code for efficiency and clarity. Make sure you have a solid grasp of arrays, loops, and Java syntax before attempting this task.

---

#### Exercise 5.1 — Array Transformation and Aggregation

**Task**: Write a method that takes an array of integers and returns a new array where each element is the sum of itself and the subsequent element. The last element should remain unchanged. Implement it using a single loop without creating a temporary array.

```java
public static int[] transformArray(int[] array)
```

**Example**:
```java
int[] input = {2, 4, 6, 8};
int[] result = transformArray(input);
// The result should be {6, 10, 14, 8}
```

**Hints**:
- Be mindful of array bounds when accessing the subsequent element.
- The method should not modify the original array.

---

#### Exercise 5.2 — Find All Indices

**Task**: Extend the method from Exercise 5.1 to return an array containing all the indices of elements that are greater than their immediately previous element. If there are no such elements, return an empty array.

```java
public static int[] findAllIndices(int[] array)
```

**Example**:
```java
int[] input = {1, 3, 2, 5, 4, 6};
int[] indices = findAllIndices(input);
// The indices array should be {1, 3, 5}
```

**Hints**:
- Consider the use of a dynamic list to initially store indices then convert it to an array.
- Pay attention to edge cases, such as empty arrays.

---

#### Exercise 5.3 — Maximal Array Subset

**Task**: Implement a method that identifies the largest contiguous subarray within the given array whose sum is maximum. Return both the subarray and its sum. Use a single loop to achieve this.

```java
public static Object[] maximalSubset(int[] array)
```

**Example**:
```java
int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
Object[] result = maximalSubset(input);
// The result[0] should be the subarray {4, -1, 2, 1} and result[1] the sum 6
```

**Hints**:
- Use auxiliary variables to keep track of the max sum and current sum.
- Implement error handling for arrays with all negative numbers.

---

#### Exercise 5.4 — Combinatorial Array Synthesis

**Task**: Write a method that takes two arrays of integers and returns a new array containing their Cartesian product. Elements should be combined as sums from both arrays.

```java
public static int[] cartesianSum(int[] array1, int[] array2)
```

**Example**:
```java
int[] array1 = {1, 2};
int[] array2 = {3, 4};
int[] result = cartesianSum(array1, array2);
// Result should be {4, 5, 5, 6}
```

**Hints**:
- Double nested loops are required, but consider the initialization and size of the resulting array.
- Prevent redundancy and ensure all combinations are unique.

---

#### Exercise 5.5 — Cyclic Array Rotation

**Task**: Develop a method to cyclically rotate the given array to the right by `k` positions. Optimize for the least amount of space and time complexity.

```java
public static void rotateArray(int[] array, int k)
```

**Example**:
```java
int[] array = {1, 2, 3, 4, 5};
rotateArray(array, 2);
// The array should now be {4, 5, 1, 2, 3}
```

**Hints**:
- Use modular arithmetic to determine the new positions.
- Consider the efficiency of your solution, especially for large arrays.

---

### 🏁 Submission Notes
- Ensure code clarity, proper naming conventions, and comments.
- Test extensively with edge cases like single-element arrays and empty arrays.
- Follow submission instructions as outlined in the course materials.

---

By completing these exercises, you will gain advanced proficiency in handling arrays and loops in Java, a critical skill for tackling complex programming challenges. Enjoy the process of discovery and optimization! Happy coding!