Array Indexing:
In Java, you cannot access characters in a string using square brackets as you have attempted with s[i]. Instead, you should uses.charAt(i) to access characters in a string.

Strings in Java are 0-indexed, so the valid indices for a string of length n are from 0 to n-1.

int digit = s.charAt(i) - '0';: This line extracts the current digit from the string at index i. In Java, characters are represented as Unicode values, but by subtracting '0', you convert the character 
representing a digit to the corresponding integer value. For example, if s.charAt(i) is '5', then digit will be assigned the value 5.

In Java, several data types and objects have a length property or method that you can use to determine the size or length of an array, string, or collection. Here are a few examples:
-->Arrays: You can use the length property to get the length (number of elements) of an array.
int[] array = {1, 2, 3, 4, 5};
int length = array.length;
Strings: You can use the length() method to get the length (number of characters) of a string.
-->String text = "Hello, World!";
int length = text.length();
Collections (Lists, Sets, etc.): You can use the size() method to get the number of elements in a collection. For example, with an ArrayList:
-->ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
int size = list.size();
Remember that the specific method or property you should use depends on the type of data structure you are working with. Arrays have length, strings have length(), and collections often have size().

When you're returning an array inline, you need to use the syntax new int[]{} to create a new array and initialize it with the elements you want to return.
For instance, if you want to return an array containing two elements [i, j], you would use:
Syntax: return new int[]{i, j};
This syntax creates a new integer array and populates it with the values specified within the curly braces {}.

Array and String both have different method.
In array use the .length to get length and in string use .size 

# 2d array or matrix

Here’s a step-by-step breakdown of the internal structure:

1. Outer Array
Description: This is the main array (matrix), which holds references to other arrays.
Representation: It’s an array where each element is a reference to an inner array (representing rows of the matrix).
2. Inner Arrays
Description: These are arrays referenced by the outer array. Each inner array represents a row of the matrix.
Representation: They contain the actual values of the matrix.
```
Diagram:
   +------------------+
   |   matrix         |  <-- Outer Array
   | (Reference Array)|
   +------------------+
       /       |       \
      /        |        \
     /         |         \
    /          |          \
   /           |           \
+-------+   +-------+   +-------+
| Row 1 |   | Row 2 |   | Row 3 |
| [1, 2, 3]|   | [4, 5, 6]|   | [7, 8, 9]|
+-------+   +-------+   +-------+
```
Detailed Breakdown:
Outer Array (matrix):

It is an array of references (or pointers) to other arrays.
In this case, it has three references, each pointing to one of the inner arrays.
Inner Arrays (Rows):

Each inner array holds the actual data of the matrix.
The inner arrays in the example are:
{1, 2, 3}
{4, 5, 6}
{7, 8, 9}

To access a specific inner array (row), you use the following syntax:
```java
int[] row = matrix[index];
```
Example code:
```java
public class Main {
    public static void main(String[] args) {
        // Initialize the 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing and printing each inner array
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i]; // Access the i-th inner array
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }
}

//Another example
// Java program to print the elements of
// a 2 D array or matrix
import java.io.*;
class GFG {

	public static void print2D(int mat[][])
	{
		// Loop through all rows
		for (int i = 0; i < mat.length; i++)

			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
	}

	public static void main(String args[])
		throws IOException
	{
		int mat[][] = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 } };
		print2D(mat);
	}
}

```

# Set Interface
The Set interface in Java is part of the Java Collections Framework and represents a collection of elements that does not allow duplicate values. It extends the Collection interface and provides the fundamental operations for working with sets.
Key Features
Unique Elements: A Set does not allow duplicate elements. If you try to add an element that is already present in the set, the operation will not modify the set.

No Ordering: The Set interface does not guarantee any specific order of its elements. However, implementations like TreeSet and LinkedHashSet offer ordered variants.

## Implementations of `Set`

Java provides several implementations of the `Set` interface, each with its own characteristics and use cases:

### 1. `HashSet`

`HashSet` is the most commonly used implementation of the `Set` interface. It is backed by a hash table, allowing for constant-time performance for basic operations.

- **Ordering**: No guaranteed order of elements.
- **Internal Structure**: Utilizes hash codes to manage element locations.

#### Example

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Checking if an element is present
        System.out.println("Contains 'banana': " + set.contains("banana")); // true

        // Removing an element
        set.remove("banana");

        // Checking the size
        System.out.println("Size: " + set.size()); // 2

        // Iterating over elements
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clearing the set
        set.clear();
        System.out.println("Is empty: " + set.isEmpty()); // true
    }
}
```

### 2. `LinkedHashSet`

`LinkedHashSet` extends HashSet and maintains a doubly-linked list of entries. It preserves the order in which elements are inserted.

- **Ordering**: Maintains insertion order.
- **Internal Structure**: Uses both a hash table and a linked list.

#### Example

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Checking if an element is present
        System.out.println("Contains 'banana': " + set.contains("banana")); // true

        // Removing an element
        set.remove("banana");

        // Checking the size
        System.out.println("Size: " + set.size()); // 2

        // Iterating over elements
        for (String fruit : set) {
            System.out.println(fruit); // Outputs: apple, cherry (in insertion order)
        }

        // Clearing the set
        set.clear();
        System.out.println("Is empty: " + set.isEmpty()); // true
    }
}
```

### 1. `TreeSet`

`TreeSet` is an implementation of NavigableSet and is backed by a TreeMap. It maintains elements in a sorted order according to their natural ordering or a specified comparator.

- **Ordering**: Maintains elements in a sorted order.
- **Internal Structure**: Uses a Red-Black tree.

#### Example

```java
import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Checking if an element is present
        System.out.println("Contains 'banana': " + set.contains("banana")); // true

        // Removing an element
        set.remove("banana");

        // Checking the size
        System.out.println("Size: " + set.size()); // 2

        // Iterating over elements
        for (String fruit : set) {
            System.out.println(fruit); // Outputs: apple, cherry (sorted order)
        }

        // Clearing the set
        set.clear();
        System.out.println("Is empty: " + set.isEmpty()); // true
    }
}
```


# Dynamic Programming Overview

Dynamic programming (DP) is a technique used to solve complex problems by breaking them down into simpler subproblems. This approach involves storing solutions to subproblems in a table to avoid redundant calculations and ensure efficiency.

## Understanding `dp[0][n-1]` in a 2D Array

In many dynamic programming problems, a 2D array `dp` is utilized to store solutions to various subproblems. The cell `dp[0][n-1]` is a key component in this process, as it typically contains the final result for the entire problem.

### What is `dp[0][n-1]`?

- **Definition**: `dp[0][n-1]` represents the solution to the problem for the entire input when the 2D array `dp` is used to solve subproblems.
- **Location**: This cell is located at the top-left and bottom-right corners of the 2D table, where `0` is the starting index and `n-1` is the ending index of the input, with `n` being the length of the input.

### Why Use `dp[0][n-1]`?

- **Final Answer**: After filling the 2D array based on the problem's recurrence relations or formulas, `dp[0][n-1]` contains the final result for the entire input. This cell combines the results from all subproblems to provide the complete solution.
- **Combining Results**: It represents the culmination of solving all smaller subproblems, making it the key cell that provides the final answer.

### General Uses of `dp[0][n-1]`

- **Longest Subsequence or Subarray**:
  - **Example**: Finding the longest palindromic subsequence.
  - **Explanation**: `dp[0][n-1]` holds the length of the longest palindromic subsequence for the entire string.

- **Largest Value**:
  - **Example**: Maximum value in problems like knapsack.
  - **Explanation**: `dp[0][n-1]` might store the maximum value or optimal solution after considering all combinations.

- **Smallest Value**:
  - **Example**: Minimum edit distance between two strings.
  - **Explanation**: `dp[0][n-1]` could store the minimum number of operations needed after evaluating all possible scenarios.

- **Optimal Solution**:
  - **Example**: Matrix chain multiplication or rod cutting.
  - **Explanation**: `dp[0][n-1]` might represent the optimal cost or solution for the entire problem.

### How to Use `dp[0][n-1]` to Return the Result

- **Return Value**: In many dynamic programming implementations, the value stored in `dp[0][n-1]` is used as the final result. This cell provides the complete solution by combining all intermediate results from the 2D table.

### Summary

- **Purpose**: `dp[0][n-1]` stores the final result after processing all subproblems and is used to return the complete solution to the problem.
- **Usage**: It provides the final answer by consolidating results from all smaller subproblems and is essential for deriving the solution efficiently.

---

