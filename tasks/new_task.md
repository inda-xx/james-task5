# Task Introduction

## Introduction to Game Development Task

Welcome to the exciting world of game development! Today, we embark on a journey to create a simple yet engaging game application. This task is designed to help you gain hands-on experience with core programming concepts while diving into the fundamentals of game development. As you work through this project, you'll build essential skills in player movement, scoring systems, and enemy interactions. By the end of this task, you'll not only have a functional game but also a deeper understanding of how these concepts work together to create interactive experiences.

### Theoretical Background

Before we get our hands dirty with code, let's take a moment to explore some theoretical underpinnings that will guide our project.

**Understanding Arrays:**  
In programming, arrays are fundamental data structures that allow you to store multiple elements of the same type in a single variable. They are extremely useful in game development for managing lists of related items, such as keeping track of enemies or player inventory. Consider arrays as a collection of indexed elements that you can easily access and manipulate, which is crucial for handling dynamic game environments.

**Working with Loops:**  
Loops are control structures that repeatedly execute a block of code as long as a specified condition is true. They are powerful tools for game development, allowing you to efficiently manage game states, update scores, or animate characters. For example, loops can iterate over an array of enemies to update their positions or check for collisions with the player character. Understanding and effectively using loops will help you streamline processes and maintain game flow.

### Setting the Context

Imagine you are developing a simple game where the player character navigates through a world filled with obstacles and enemies. The player's objective is to survive as long as possible while collecting points. Your challenge is to implement player movement, design a scoring system, and create interactions with enemies.

As you begin this task, keep in mind the following learning goals:
1. Use arrays to manage and interact with in-game elements.
2. Implement loops for ongoing game functions and animations.

By applying these concepts, you'll gain valuable insights into how games operate under the hood and develop the foundational skills needed to craft more complex interactive applications in the future.

Now, let's get started on this creative and technical journey to bring your simple game to life!

## 📝 Preparation

### 📝 Preparation

Before you start working on this week's tasks, it's important to build a solid foundation in the key concepts you'll be working with. Below are the preparation steps you should follow to ensure you're well-equipped to tackle the exercises related to Java's collections, specifically Arrays and ArrayLists:

1. **Review Lecture Materials**: 
   - Go through the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p) thoroughly. The slides cover essential concepts that will help you understand how collections work in Java.

2. **Engage with Module 5**:
   - Access and actively work through [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects). This module will guide you through the concept of grouping objects, a fundamental idea when using collections.

3. **Understand Arrays**:
   - A critical part of your preparation is to understand arrays, which are the simplest type of collection in Java. They are a key part of this week's learning goals.
   - Review examples and exercises related to arrays, focusing on how to create, manipulate, and utilize them in Java programs.

4. **Learn the `static` Keyword**:
   - The `static` keyword frequently appears in this week's exercises. Understanding its purpose and application in Java will be crucial. Find explanations and examples in the provided resources, and pay attention to how `static` methods differ from instance methods.

5. **Familiarize Yourself with ArrayLists**:
   - ArrayLists provide a dynamic alternative to arrays with functionalities that are not possible with fixed-size arrays.
   - Investigate how to import and use the `ArrayList` class from the Java utility package, including methods for adding, removing, and accessing elements.

6. **Practice Combining Loops with Collections**:
   - Many exercises this week will involve combining loops (such as for-loops or foreach-loops) with arrays and ArrayLists.
   - Make sure you practice writing loops that iterate over collections and understand common patterns, such as determining the average or finding the smallest element in a collection.

By completing these preparatory steps, you'll strengthen your understanding of Java collections and be ready to apply your knowledge in the specified assignments.

## ✅ Learning Goals

### Learning Goals for the Task

- **Understanding Arrays**

  - Learn how to create and initialize arrays in Java.
  - Understand the concept of indexing in arrays and how to access array elements.
  - Explore the use of array-specific methods like calculating averages, finding the smallest element, and reversing arrays.
  - Grasp the differences and similarities between arrays and ArrayLists for organizing data.

- **Working with Loops**

  - Familiarize with the `for` loop for iterating over array elements.
  - Utilize the `foreach` loop (enhanced for loop) to simplify iteration over collections.
  - Apply loops to perform operations on arrays and ArrayLists, such as modifying elements, summing values, or iterating over collections.

By focusing on these goals, the task aims to provide a foundational understanding of data grouping through arrays and collections while leveraging loops for efficient data manipulation in Java.

## 🏛 Assignment

### Assignment: Java Collections - Arrays and ArrayLists

This week, you'll be working with Java collections, focusing on `Array` and `ArrayList`, as a way of organizing groups of objects. The goal is to deepen your understanding of arrays, loops, and the static keyword while learning how to manipulate collections effectively.

### 💀 Deadline
The assignment is due before the exercise session on **Friday 4 October**.

### 👩‍🏫 Instructions
Detailed instructions on how to complete and submit your assignment can be found in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-24/course-instructions#assignments).

### 📝 Preparation Steps

- Review relevant [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p).
- Carefully go through all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects).

### ✅ Learning Goals

By completing this assignment, you should achieve the following learning objectives:

- Work with and manipulate `Arrays`.
- Understand the usage and implications of the `static` keyword.
- Operate with `ArrayLists`.
- Combine loops and collections effectively.

### 🚨 Troubleshooting Guide

1. Review [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if your problem has already been addressed.
2. If your problem is unique, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title.
3. Attend the [weekly lab session](https://queue.csc.kth.se/Queue/INDA) to ask a TA for help.

**Remember:** Discussion with peers is encouraged, but do not share solutions. Similarly, while AI services can assist with explanations, you must complete your own solutions and explain them if asked.

### 🏛 Assignment Overview

This assignment involves working with Java's fundamental data structures, particularly arrays and ArrayLists. Understanding these will help you effectively manipulate and store data in your programs.

#### Exercise 5.0: Set Up

- Create a new class called `Arrays` in a file named `Arrays.java` within the `src` directory.

#### Exercise 5.1: Integer Array Average

Write a method to return the average of an integer array with the header:

```java
public static int average(int[] array)
```

**Note:** Use integer division to achieve the floor rounding effect.

#### Exercise 5.2: Double Array Average

Write a method to calculate and return the average of a double array:

```java
public static double average(double[] array)
```

#### Exercise 5.3: Find the Smallest Element

Create a method to return the smallest element in an integer array:

```java
public static int smallestElement(int[] array)
```

If the array is empty, return `Integer.MAX_VALUE`.

#### Exercise 5.4: Reverse an Array

Write a method that returns a new array with the elements of the input array in reverse order:

```java
public static int[] reverse(int[] array)
```

Ensure the original array remains unchanged.

#### Exercise 5.5: Retrieve Even Numbers

Create a method to return a new array with all even numbers from the input array:

```java
public static int[] evenNumbers(int[] array)
```

This method should not modify the original array.

### Set Theory Exercises with ArrayLists

For the following tasks, you will use `ArrayLists` to model mathematical sets.

#### Exercise 5.6: `SetTheory.java` and `generateSet`

- Create `SetTheory.java` in the `src` directory.
- Implement `generateSet`:

```java
public static ArrayList<Integer> generateSet(int min, int max)
```

Ensure the set only contains unique elements from the specified range within the boundaries of 0 to 99.

#### Exercise 5.7: Union of Sets

Implement a method to return the union of two sets:

```java
public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b)
```

#### Exercise 5.8: Intersection of Sets

Write a method to find the intersection between two sets:

```java
public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b)
```

#### Exercise 5.9: Complement of a Set

Create a method that returns the complement of the input set within the universe (0 to 99):

```java
public static ArrayList<Integer> complement(ArrayList<Integer> a)
```

#### Exercise 5.10: Cardinality of a Set

Implement a method to return the cardinality (number of elements) of a set:

```java
public static int cardinality(ArrayList<Integer> a)
```

#### Exercise 5.11: Cardinality of Union

Write a method to calculate the cardinality of the union of two sets:

```java
public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b)
```

### ❎ Checklist

- **Arrays.java:**
  - [ ] Integer average calculation.
  - [ ] Double average calculation.
  - [ ] Smallest element retrieval.
  - [ ] Reversal of arrays.
  - [ ] Extraction of even numbers.

- **SetTheory.java:**
  - [ ] Generate set from range.
  - [ ] Compute union of two sets.
  - [ ] Calculate intersection of two sets.
  - [ ] Find complement of a set.
  - [ ] Determine cardinality of a set.
  - [ ] Compute cardinality of union.

### 🐞 Feedback & Bug Reporting

If you encounter any bugs or discrepancies in the assignment, please create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) titled "Task *x* Error: *summary of issue*".

### 🙏 Acknowledgments

This task was developed by Linus Östlund, Sofia Bobadilla, Gabriel Skoglund, Arvid Siberov, and Alexander Runebou. Proofreading and bug fixes were provided by Jimmy Tran and Edwin Wästlund.

#### Exercise 1

### Exercise 1: Introduction to Java Arrays

#### Objective
This exercise introduces you to Java arrays, allowing you to understand how to create, initialize, and manipulate them using basic loops.

#### Learning Goals
- Understand the basics of Java arrays
- Implement simple operations with arrays
- Use loops to iterate through an array

### 🌟 Exercise 1.0: Creating and Initializing Arrays

#### Task
1. Create a Java class named `ArrayBasics` in a file called `ArrayBasics.java`.
2. Inside this class, write a `main` method that performs the following tasks:
   - Declare an array of `int` with a length of 5.
   - Initialize it with values: `[12, 45, 32, 10, 7]`.
   - Print all elements of the array to the console.

<details>
  <summary> 📜 Sample code structure </summary>

```java
public class ArrayBasics {
  public static void main(String[] args) {
    // Declare and initialize an array of integers
    int[] numbers = {12, 45, 32, 10, 7};
    
    // Print all elements of the array
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
```
---
</details>

### 🌟 Exercise 1.1: Sum of Array Elements

#### Task
1. In the same class (`ArrayBasics`), implement a method `public static int sum(int[] array)` that calculates the sum of all elements in an integer array.
2. Call this method from the `main` method and print the result.

<details>
  <summary> 💡 Method Implementation </summary>

```java
public static int sum(int[] array) {
  int total = 0;
  for (int i = 0; i < array.length; i++) {
    total += array[i];
  }
  return total;
}
```
---
</details>

### 🌟 Exercise 1.2: Maximum Element in Array

#### Task
1. Add another method `public static int maxElement(int[] array)` that finds and returns the maximum value in the array.
2. Use a for-loop to iterate through the array and determine the maximum value.
3. Call this method from the `main` method and print the result.

<details>
  <summary> 💡 Method Implementation </summary>

```java
public static int maxElement(int[] array) {
  int max = array[0];
  for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];
    }
  }
  return max;
}
```
---
</details>

### 🌟 Exercise 1.3: Average of Array Elements

#### Task
1. Add a method `public static double average(int[] array)` that calculates the average of all elements. The average should be a double value.
2. Remember to reuse the `sum` method to calculate the total value.
3. Call this method from the `main` method and print the result.

<details>
  <summary> 💡 Method Implementation </summary>

```java
public static double average(int[] array) {
  int total = sum(array);
  return (double) total / array.length;
}
```
---
</details>

### 🌟 Exercise 1.4: Reversing an Array

#### Task
1. Implement a method `public static int[] reverseArray(int[] array)` that returns a new array with the elements in reverse order.
2. In the `main` method, pass the array to this method and print the reversed array.

<details>
  <summary> 💡 Method Implementation </summary>

```java
public static int[] reverseArray(int[] array) {
  int[] reversed = new int[array.length];
  for (int i = 0; i < array.length; i++) {
    reversed[i] = array[array.length - 1 - i];
  }
  return reversed;
}
```
---
</details>

### 🌟 Exercise 1.5: Enhancing Loop Usage with Foreach

#### Task
1. Modify the `main` method to iterate over the array using the `foreach` loop for printing elements.
2. Ensure all previous operations are still correctly displayed.

<details>
  <summary> 📜 Sample code structure </summary>

```java
public static void main(String[] args) {
  // Original array
  int[] numbers = {12, 45, 32, 10, 7};
  
  // Print using foreach
  for (int number : numbers) {
    System.out.println(number);
  }
  
  // Other output statements for sum, max, average, and reversed array
}
```
---
</details>

### ✅ Checklist

- [ ] Successfully created and initialized an array.
- [ ] Implemented and tested the `sum` method.
- [ ] Implemented and tested the `maxElement` method.
- [ ] Calculated the average using the `sum` method.
- [ ] Reversed the array without changing the original one.
- [ ] Printed elements using a `foreach` loop.

> **Assistant's note:** Make sure to test your methods thoroughly for edge cases like empty arrays or arrays with negative integers.

#### Exercise 2

# Exercise 2.0 -- Enhanced Arrays and Loops

In this exercise, we will build on your understanding of arrays and loops, utilizing both basic `for` loops and the enhanced `foreach` loop to create more complex operations. You'll deepen your understanding of data manipulation within arrays while getting more practice with looping structures and conditional logic.

### Exercise 2.1 -- Sum and Product Calculation

Write a method that computes both the sum and product of all elements in an integer array. The method should have the following signature:

```java
public static int[] sumAndProduct(int[] array)
```

This method should return a new integer array of size 2, where the first element contains the sum and the second element contains the product of all the original array elements.

- If the input array is empty, return a new array with both elements set to zero.
- If an element is zero, the entire product should be zero.

Here's an example of how it should work:
```java
int[] numbers = {1, 2, 3, 4};
int[] results = sumAndProduct(numbers);
// results should be {10, 24}
```

### Exercise 2.2 -- Find Maximum and Minimum

Create a method that finds both the maximum and minimum values in an array of integers. Use the following method header:

```java
public static int[] maxAndMin(int[] array)
```

This method should return an array of size 2, where the first element is the maximum value and the second is the minimum value.

- If the array is empty, return a new array containing `Integer.MIN_VALUE` and `Integer.MAX_VALUE` respectively.

Example:
```java
int[] values = {3, 5, 7, 2, 8};
int[] maxMin = maxAndMin(values);
// maxMin should be {8, 2}
```

### Exercise 2.3 -- Cumulative Sum Array

Write a method that returns the cumulative sum array. Each element in the cumulative sum array is the sum of elements in the original array up to and including that index. Use the following method header:

```java
public static int[] cumulativeSum(int[] array)
```

Example:
```java
int[] input = {1, 2, 3, 4};
int[] cumulative = cumulativeSum(input);
// cumulative should be {1, 3, 6, 10}
```

### Exercise 2.4 -- Rotate Array

Implement a method that rotates the elements of an array to the right by a given number of steps. The method should have the following signature:

```java
public static void rotateRight(int[] array, int steps)
```

For example, given the array `{1, 2, 3, 4, 5}` and `steps` of `2`, it would become `{4, 5, 1, 2, 3}`.

- If the array is empty or `steps` is zero, the array should remain unchanged.
- Consider using the modulo operator to handle cases where `steps` is larger than the length of the array.

### Exercise 2.5 -- Identify Duplicates

Write a method that identifies if there are any duplicate elements in an integer array. The method should return a boolean indicating the presence of duplicates.

```java
public static boolean containsDuplicates(int[] array)
```

Example:
```java
int[] nums = {1, 2, 3, 4, 5, 6};
boolean hasDuplicates = containsDuplicates(nums);
// hasDuplicates should be false

int[] numsWithDuplicates = {1, 2, 3, 3, 4};
boolean hasDuplicates2 = containsDuplicates(numsWithDuplicates);
// hasDuplicates2 should be true
```

### Checklist
- [ ] Compute sum and product of an array.
- [ ] Find the maximum and minimum values in an array.
- [ ] Generate a cumulative sum array.
- [ ] Rotate an array to the right by a given number of steps.
- [ ] Identify duplicate elements in an array.

### Notes
- Focus on reusing loops where possible to maintain code efficiency.
- Consider edge cases such as empty arrays or those with repeated elements.

#### Exercise 3

### Exercise 5.3 -- Advanced Array Manipulations

This challenging exercise aims to deepen your understanding of arrays and improve your skills in working with loops. You'll create a series of increasingly difficult tasks that build upon each other, leading to a comprehensive understanding of array manipulations in Java.

#### **Exercise 5.3.1 -- Find Element Indices**

Write a method that finds all indices of a given integer in an array. The method should have the following header:

```java
public static int[] findIndices(int[] array, int target)
```

- **Objective:** Return an array of all indices where the target integer appears in the input array.
- **Hint:** You might need to traverse the array twice: once to count occurrences and once to collect the indices.

```java
// Example
int[] array = {1, 3, 7, 1, 4, 1};
int[] indices = findIndices(array, 1);
// indices should be {0, 3, 5}
```

#### **Exercise 5.3.2 -- Array Rotation**

Build upon your array manipulation skills by implementing a method that rotates an array to the right by a given number of steps. It should be defined as follows:

```java
public static int[] rotateArray(int[] array, int steps)
```

- **Objective:** Shift each element in the array to the right by `steps` positions, wrapping elements around to the beginning of the array.
- **Constraint:** The `steps` value could potentially exceed the array length. Optimize your solution to handle this efficiently.

```java
// Example
int[] array = {1, 2, 3, 4, 5};
int[] rotated = rotateArray(array, 2);
// rotated should be {4, 5, 1, 2, 3}
```

#### **Exercise 5.3.3 -- Subarray Sorting**

Expand on your skills by sorting a specific subarray within the full array. Implement a method with the following header:

```java
public static void sortSubarray(int[] array, int start, int end)
```

- **Objective:** Sort the subarray from index `start` to `end` (inclusive).
- **Hint:** You can use any sorting algorithm, but try to be efficient given that `start` and `end` can span the entire array.

```java
// Example
int[] array = {8, 4, 7, 3, 9, 1, 2};
sortSubarray(array, 1, 5);
// array should be {8, 1, 3, 7, 9, 4, 2}
```

#### **Exercise 5.3.4 -- Array Pair Sum**

Finally, challenge yourself with finding all unique pairs of elements in an array whose sum is equal to a specified target. Your method should be defined with this header:

```java
public static List<int[]> pairSum(int[] array, int target)
```

- **Objective:** Return a list of arrays, each containing a pair of indices whose elements sum up to the target.
- **Hint:** Consider using sorting and two-pointer technique for an efficient solution.

```java
// Example
int[] array = {2, 4, 3, 5, 6, -1, 0};
List<int[]> pairs = pairSum(array, 5);
// pairs should contain arrays like {0, 2}, {1, 5} representing the indices
```

### 🐞 Troubleshooting Tips:

- **Divide and Conquer:** For complex problems, break down the steps and handle them incrementally.
- **Debugging:** Use print statements judiciously to trace your results step by step.
- **Review and Revise:** Consistently check edge cases like empty arrays, large step sizes for rotation, or non-existent elements.

Upon completion of these exercises, you should have a thorough understanding of sophisticated array manipulations, empowering you to tackle even more complex programming challenges.

#### Exercise 4

## Collections - Advanced Level

This advanced exercise focuses on reinforcing your understanding of Java collections, particularly arrays and ArrayLists, and how to manipulate them using loops and other methods. The goal is to challenge you to think critically and apply the concepts you have learned in more complex scenarios.

### 💀 Deadline
This work should be completed before the exercise on **Friday, October 11**.

### 👩‍🏫 Instructions
For detailed instructions on completing and submitting the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-24/course-instructions#assignments).

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Complete all questions in [Module 6: Advanced Collections and Loops](https://qbl.sys.kth.se/sections/dd1337_programming/container/advanced_grouping)

### ✅ Learning Goals
This week's advanced learning goals include:

* Deepening understanding of `Arrays` and `ArrayLists`
* Mastering the use of loops with collections
* Applying problem-solving skills in challenging scenarios
* Exploring more complex data manipulations

### 🚨 Troubleshooting Guide
If you encounter any issues, please follow this procedure:

1. Check the current week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if others have encountered similar problems.
2. If your issue isn't listed, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) and add a descriptive title starting with "Task *x*: *summary of problem here*".
3. Consult with a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) for additional help. Check your schedule for the next available lab session.

Collaboration with peers is encouraged for discussions, but please ensure your solutions are independently developed. AI tools can be used for understanding concepts but not for generating solutions directly submitted as your work.

### 🏛 Advanced Assignment

This week's advanced exercises will focus on using arrays and ArrayLists efficiently to store, organize, process, and manipulate data.

#### Exercise 6.0 -- Enhanced Arrays Class

Create a new class called `EnhancedArrays` in a file named `EnhancedArrays.java` located in the `src` folder. This class will build on what you've learned to solve more advanced problems.

#### Exercise 6.1 -- Rotating Arrays

Write a method that rotates the elements of an array to the right by a specified number of steps. The method should have the following header:

```java
public static int[] rotateRight(int[] array, int steps)
```

> **Assistant's Note:** A rotation moves elements towards the right with the last elements looping back to the front. For example, rotating `{1, 2, 3, 4, 5}` by 2 steps results in `{4, 5, 1, 2, 3}`. Consider efficient ways to handle cases where `steps` is larger than the array length.

#### Exercise 6.2 -- Finding Common Elements

Develop a method to find all common elements between two arrays. It should handle arrays of different sizes and return an array of the common elements without duplicates. The method should have this header:

```java
public static int[] findCommonElements(int[] array1, int[] array2)
```

> **Assistant's Note:** Think about leveraging a set to efficiently check for duplicates. You can return the result as an array for simplicity. Consider edge cases, such as empty arrays.

#### Exercise 6.3 -- Advanced Array Summation

Implement a method to calculate the summation of elements in a multidimensional array (a matrix). Return the result as a single integer. The matrix can be non-uniform (jagged array). The method should have this header:

```java
public static int matrixSum(int[][] matrix)
```

> **Assistant's Note:** Be mindful of arrays with uneven row lengths. Consider possible null elements or empty rows in your matrix.

#### Exercise 6.4 -- ArrayList Transformation

Create a method that transforms an `ArrayList` of integers by applying a specified transformation rule. Opt for a lambda expression to apply transformations. The method should look like this:

```java
public static ArrayList<Integer> transformList(ArrayList<Integer> list, java.util.function.Function<Integer, Integer> transformer)
```

> **Assistant's Note:** Consider employing lambdas to focus on functional programming concepts. An example transformer could double each element, i.e., `x -> x * 2`.

### Set Theory - Advanced Level

In this section, you'll apply set theory with advanced manipulations using ArrayLists, increasing the complexity of operations to include both union and intersection in a single operation.

#### Exercise 6.5 -- Enhanced Set Theory Class

Create a class file called `EnhancedSetTheory.java` in the `src` folder. This file will contain the following methods expanding on basic set operations with more challenging requirements.

#### Exercise 6.6 -- Dual Operation: Union and Intersection

Create a method that, given two integer sets, returns another set that contains both their union and intersection, with a special marker (-1) indicating the separation between the two. The method should have this header:

```java
public static ArrayList<Integer> unionAndIntersection(ArrayList<Integer> set1, ArrayList<Integer> set2)
```

> **Assistant's Note:** Maintain distinctiveness of results even though they are combined. For example, if `set1` is `{1, 2, 3}` and `set2` is `{2, 4, 5}`, the output could be `{1, 2, 3, 4, 5, -1, 2}`.

#### Exercise 6.7 -- Symmetric Set Difference

Implement a method to calculate the symmetric difference of two sets, which results in a set containing elements present in either of the sets but not in their intersection. Here's the method header:

```java
public static ArrayList<Integer> symmetricDifference(ArrayList<Integer> set1, ArrayList<Integer> set2)
```

> **Assistant's Note:** This requires subtracting the intersection from the union. Be sure to handle overlapping elements efficiently.

### ❎ Checklist
- [ ] Advanced problems in `EnhancedArrays.java`:
  - [ ] Rotate an array by a specified number of steps.
  - [ ] Find common elements in two arrays.
  - [ ] Sum the elements of a matrix.
  - [ ] Transform an ArrayList using a lambda expression.
- [ ] Advanced problems in `EnhancedSetTheory.java`:
  - [ ] Implement dual operation (union and intersection).
  - [ ] Calculate symmetric set difference.

> **Assistant's note:** Use this checklist to ensure all exercises are completed correctly before submission.

### 🐞 Bugs and Errors
If you find inconsistencies or errors, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) titled "Task *x* Error: *summary of error*". Noteworthy corrections may receive acknowledgment.

### 🙏 Acknowledgment
This task was designed by [Your Name](mailto:youremail@kth.se), building on foundational work by KTH INDA team members Linus Östlund, Sofia Bobadilla, Gabriel Skoglund, Arvid Siberov, and Alexander Runebou. Proofreading by Jimmy Tran and Edwin Wästlund.

#### Exercise 5

Here is Exercise 5 with a hard difficulty level, designed to help students deepen their understanding of arrays and loops. Each exercise builds upon the previous one, providing a comprehensive series of challenges. The structure and style aim to mirror the provided examples while introducing additional complexity.

---

### Advanced Arrays and Loop Challenges

This exercise focuses on mastering Java arrays and loops. The tasks demand an understanding of array manipulation and loop control, pushing students to synthesize previous learning materials and concepts.

### 📝 Preparation

- Review the existing [Java Collections documentation](https://docs.oracle.com/javase/tutorial/collections/index.html).
- Revisit the code examples in previous exercises and lectures to refresh array basics and loop usage.
  
### ✅ Learning Goals

- Master the use of `Arrays` in Java.
- Deepen your ability to control loop flow for complex logic.
- Enhance proficiency with nested loops.

### 💪 Challenges

#### Exercise 5.12 -- Matrix Sum

Create a method that calculates the sum of a 2D integer array (matrix). The method should have the following header:

```java
public static int matrixSum(int[][] matrix)
```

> **Assistant's Note:** The matrix can be jagged (i.e., rows can have different lengths). Ensure your solution navigates this discrepancy in dimensions.

#### Exercise 5.13 -- Subarray Search

Write a method that identifies whether a given sub-array exists within a larger array. You'll need to perform this search for a sequence of integers. The method must have the following header:

```java
public static boolean containsSubArray(int[] array, int[] subArray)
```

> **Assistant's Note:** Consider the efficiency of your solution. Ensure your method handles edge cases, such as when the sub-array is longer than the array.

#### Exercise 5.14 -- Spiral Matrix

Develop a method that prints the elements of a 2D square matrix in a spiral order. For instance, given the matrix:

```
1  2  3  
4  5  6  
7  8  9  
```

The output should be: `1, 2, 3, 6, 9, 8, 7, 4, 5`.

The method should have the following header:

```java
public static void printSpiral(int[][] matrix)
```

> **Assistant's Note:** Use careful control of loop indices to traverse the matrix correctly. Consider multiple loop strategies and recursion for clarity.

#### Exercise 5.15 -- Matrix Transposition

Write a method that computes the transpose of a given 2D square matrix. The transpose of a matrix continually flips rows and columns (e.g., `matrix[i][j]` becomes `matrix[j][i]`). Implement it with this method header:

```java
public static int[][] transpose(int[][] matrix)
```

> **Assistant's Note:** Handle square and rectangular matrices. Consider in-place transpositions to optimize space usage when allowed by constraints.

#### Exercise 5.16 -- Merge and Sort

Implement a method to merge two pre-sorted integer arrays and return a single sorted array. The method should have this header:

```java
public static int[] mergeAndSort(int[] array1, int[] array2)
```

> **Assistant's Note:** Leverage the merging concept from the merge sort algorithm. Efficiency in time complexity is key (aim for O(n + m) with `n` and `m` as lengths of `array1` and `array2`).

### 🪲 Debugging and Testing Tips

- Use the tutorials on nested loops and recursive approaches to print matrices.
- Utilize Java's debugging tools within your IDE for step-by-step execution.
- Create test matrices and arrays with known characteristics to validate each function comprehensively.

### 🤝 Collaboration Reminders

You are encouraged to brainstorm with peers, but ensure that each submitted solution is uniquely yours. Avoid using AI-generated code without fully understanding the mechanics behind it as you'll need to articulate your thought process during peer and TA reviews.

---

These exercises build on arrays, loops, and matrix manipulation, offering a greater complexity tailored for mastery of these fundamental programming concepts.