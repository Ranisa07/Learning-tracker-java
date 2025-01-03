# Method Overloading in Java

Method overloading in Java is a feature that allows a class to have more than one method with the same name, as long as they have different parameters (different type, number, or both). It is a compile-time
polymorphism, meaning the decision about which method to call is made at compile time, not runtime.

## Rules for Method Overloading:

1.**Different Number of Parameters:**

Methods can be overloaded by changing the number of parameters.

2.**Different Type of Parameters:** 

Methods can be overloaded by changing the type of parameters.

3.**Method Signature:** 

Overloading is determined by the method signature, which consists of the method name and the parameter list. The return type does not play a role in overloading.

4.**Cannot Overload by Return Type Alone:**

You cannot overload a method based solely on its return type.

# Example of Method Overloading in Java
```java
class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling the add method with two integers
        System.out.println("Sum of 5 and 3 (int): " + calc.add(5, 3));
        
        // Calling the overloaded add method with three integers
        System.out.println("Sum of 5, 3 and 8 (int): " + calc.add(5, 3, 8));
        
        // Calling the overloaded add method with two doubles
        System.out.println("Sum of 5.5 and 3.5 (double): " + calc.add(5.5, 3.5));
        
        // Calling the overloaded add method with an integer and a double
        System.out.println("Sum of 5 and 3.5 (int + double): " + calc.add(5, 3.5));
    }
}
```
# Explanation:
- **Method Overloading:** In this example, the add method is overloaded in four different ways:
  1. **Two integer parameters** (add(int a, int b)).
  2. **Three integer parameters** (add(int a, int b, int c)).
  3. **Two double parameters** (add(double a, double b)).
  4. **One integer and one double parameter**(add(int a, double b)).
- **Calling the Methods:**
   In the Main class, we demonstrate the different overloaded versions of the add method. Depending on the type and number of arguments passed, the appropriate method is called.

  **Output:**

  Sum of 5 and 3 (int): 8

  Sum of 5, 3 and 8 (int): 16

  Sum of 5.5 and 3.5 (double): 9.0

  Sum of 5 and 3.5 (int + double): 8.5

  Images
  ![Screenshot 2024-12-25 150810](https://github.com/user-attachments/assets/06a5d5e9-6427-4134-a3ca-cdb3d80832ed)


  ## Key Points:
    - The method name add is the same for all the overloaded methods.
    - The difference between the overloaded methods lies in the number and types of their parameters.
    - The return type (like int or double) does not affect method overloading. It is determined solely by the method signature (name + parameter list).

## Advantages of Method Overloading:
   1. **Improved Code Readability:** Having multiple methods with the same name, but different parameter lists, makes it easier to understand the functionality.
   2. **Code Reusability:** You can use the same method name for different types of operations, reducing the need for different method names.
   3. **Flexibility:** The class can support different types of operations that are conceptually similar but work with different input types or numbers of inputs.
      





