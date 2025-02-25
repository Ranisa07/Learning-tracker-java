# Java Array Methods: 

In Java, arrays are objects, and they inherit methods from the `Object` class. Additionally, the `java.util.Arrays` class provides utility methods to perform operations on arrays. 
- Below is a detailed explanation of the relevant methods:

## 1. `hashCode()`
### Description
The `hashCode()` method returns the hash code of an array. This method can be invoked directly on an array object, but it does not provide a deep hash code for the elements of the array. For a deep hash code (considering array elements), use `java.util.Arrays.hashCode()` or `java.util.Arrays.deepHashCode()`.

### Example
```java
int[] arr = {1, 2, 3};
System.out.println(arr.hashCode()); // Returns the hash code of the array object
System.out.println(java.util.Arrays.hashCode(arr)); // Returns a hash code based on array contents
```
## 2. `toString()`
### Description
The `toString()` method of an array returns a string representation of the array's memory address. To obtain a string representation of the array's contents, use `java.util.Arrays.toString()` for one-dimensional arrays or `java.util.Arrays.deepToString()` for multi-dimensional arrays.
### Example

```java
int[] arr = {1, 2, 3};
System.out.println(arr.toString()); // Returns something like [I@15db9742
System.out.println(java.util.Arrays.toString(arr)); // Returns [1, 2, 3]
```
## 3. equals()
### Description
The `equals()` method checks if two array objects refer to the same memory location. It does not compare the contents of the arrays. To compare contents, use `java.util.Arrays.equals()` for one-dimensional arrays or `java.util.Arrays.deepEquals()` for multi-dimensional arrays.
### Example
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
System.out.println(arr1.equals(arr2)); // Returns false (different references)
System.out.println(java.util.Arrays.equals(arr1, arr2)); // Returns true (compares contents)
```
## 4. toDeepString()
### Description
The `toDeepString()` method (from `java.util.Arrays`) provides a string representation of multi-dimensional arrays, including nested arrays.
### Example
```java
int[][] arr = {{1, 2}, {3, 4}};
System.out.println(java.util.Arrays.deepToString(arr)); // Returns [[1, 2], [3, 4]]
```
## 5. deepEquals()
### Description
The `deepEquals()` method (from `java.util.Arrays`) compares the contents of multi-dimensional arrays for equality, considering all nested arrays.
### Example
```java
int[][] arr1 = {{1, 2}, {3, 4}};
int[][] arr2 = {{1, 2}, {3, 4}};
System.out.println(java.util.Arrays.deepEquals(arr1, arr2)); // Returns true
```
### Summary

| Method    | Purpose                                |
|-----------|----------------------------------------|
| `hashCode()`| Returns the hash code of an array object.|
| `toString()` |	Returns the memory address of the array. Use java.util.Arrays.toString() for contents.|
| `equals()` | Compares memory addresses of two arrays. Use java.util.Arrays.equals() for content equality.|
| `toDeepString` | Provides a string representation of nested arrays.|
|`deepEquals()`|	Compares contents of nested arrays for equality.|
|              |                                     |

