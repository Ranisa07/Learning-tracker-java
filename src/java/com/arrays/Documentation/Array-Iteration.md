# Arrays and Iteration in Java

## What is an Array?

An **array** is a data structure that stores a fixed-size sequential collection of elements of the same type. In Java, arrays are objects, and their size cannot be changed once defined.

### Declaring and Initializing an Array
```java
// Declaration and initialization
int[] numbers = new int[5]; // Creates an array of size 5
numbers[0] = 10;           // Assign value to the first element

// Short-hand initialization
int[] numbers = {10, 20, 30, 40, 50};
```
## Iterating Through a 1-D Array
**Example Array**

int[] numbers = {10, 20, 30, 40, 50};

1. **Using for Loop with Index**

The for loop provides a way to iterate using the index of the array.
```java

for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
}
```
2. **Using for-each Loop**

The for-each loop simplifies iteration by accessing each element directly.
```java

for (int num : numbers) {
    System.out.println("Element: " + num);
}
```
3. **Using while Loop**

The while loop uses a condition to control iteration.
```java

int i = 0;
while (i < numbers.length) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
    i++;
}
```
4. **Using do-while Loop**

The do-while loop ensures the block is executed at least once before checking the condition.
```java

int i = 0;
do {
    System.out.println("Element at index " + i + ": " + numbers[i]);
    i++;
} while (i < numbers.length);
```

**Summary**

| Loop Type  |	Key Characteristic   |
|------------|------------------------------------|
| for	     | Best when index is required for operations. |
| for-each	 | Simplest for reading values without modifying them. |
| while	     | Best when loop continuation depends on dynamic checks. |
| do-while	 | Ensures at least one iteration regardless of condition. |
|            |                                            |

**Complete Example**
```java
public class ArrayIteration {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("for: Element at index " + i + ": " + numbers[i]);
        }

        // for-each loop
        for (int num : numbers) {
            System.out.println("for-each: Element: " + num);
        }

        // while loop
        int i = 0;
        while (i < numbers.length) {
            System.out.println("while: Element at index " + i + ": " + numbers[i]);
            i++;
        }

        // do-while loop
        i = 0;
        do {
            System.out.println("do-while: Element at index " + i + ": " + numbers[i]);
            i++;
        } while (i < numbers.length);
    }
}	
```
**OUTPUT**


## Iterating Through 2D Arrays
### Using `for` Loop (Index-Based)
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.println(matrix[i][j]);
    }
}
```

### Using `for-each` Loop
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
for (int[] row : matrix) {
    for (int value : row) {
        System.out.println(value);
    }
}
```

### Using `while` Loop
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
int i = 0;
while (i < matrix.length) {
    int j = 0;
    while (j < matrix[i].length) {
        System.out.println(matrix[i][j]);
        j++;
    }
    i++;
}
```

### Using `do-while` Loop
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
int i = 0;
do {
    int j = 0;
    do {
        System.out.println(matrix[i][j]);
        j++;
    } while (j < matrix[i].length);
    i++;
} while (i < matrix.length);
```
**Example of 2D Array Iteration**
```java
//Summing Elements in a 2D Array
public class Sum2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("The sum of all elements in the matrix is: " + sum);
    }
}
```
**OUTPUT**
