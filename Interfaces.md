# Java Interfaces and Implementation Classes

In Java, interfaces are used to specify a contract that classes must adhere to. An interface defines a set of abstract methods (methods without a body) that a class must implement.A class that implements an
interface must provide concrete implementations for all of its methods.

Below is an explanation of how interfaces work in Java along with an example implementation.

## 1.Defining an Interface

An interface is declared using the interface keyword. It can contain abstract methods, constants, and default methods (methods with a body).

**Example**
```java
// Define an interface called Animal
public interface Animal {
    // Abstract method (does not have a body)
    void sound();

    // Abstract method (does not have a body)
    void eat();

    // A constant (interface fields are implicitly `public static final`)
    int numberOfLegs = 4;
}
```
 **Explanation:**
  - The Animal interface defines two methods: sound() and eat(). These methods do not have implementations and must be implemented by any class that implements this interface.
  - The numberOfLegs is a constant field with the value 4 (though the value can be changed if needed, it's typically a constant in many cases).

## 2. Implementing the Interface in a Class
   
   To implement the interface, a class must use the implements keyword. The class must provide concrete implementations for all of the methods declared in the interface.

  **Example**
  ```java
  // Implementing the Animal interface in a Dog class
    public class Dog implements Animal {

    // Providing implementation for the sound() method
    public void sound() {
        System.out.println("Bark");
    }

    // Providing implementation for the eat() method
    public void eat() {
        System.out.println("Dog is eating.");
    }
    
    // Accessing the constant numberOfLegs from the interface
    public void showLegs() {
        System.out.println("Number of legs: " + numberOfLegs);
    }
}
```
**Explanation:**
 - The Dog class implements the Animal interface, which means it must provide concrete implementations for the sound() and eat() methods.
 - The showLegs() method demonstrates how the class can access the constant numberOfLegs from the interface.

## 3. Using the Interface and Implementation
    
   Once the interface is implemented, we can create objects of the implementation class and invoke the methods defined by the interface.

   **Example** 
   ```java
   public class Main {
   public static void main(String[] args) {
        // Create an object of Dog class
        Animal myDog = new Dog();
        
        // Call methods on the object
        myDog.sound();   // Output: Bark
        myDog.eat();     // Output: Dog is eating.
        
        // Since we can access the interface constants
        ((Dog) myDog).showLegs();  // Output: Number of legs: 4
    }
}
```
**OUTPUT**

 ![Screenshot 2024-12-25 163251](https://github.com/user-attachments/assets/fd3a45db-dc42-4c25-bc21-181788a406a7)

**Explanation:**
 - We create an object of the Dog class, but assign it to an Animal reference variable (polymorphism). This allows us to call the sound() and eat() methods that are declared in the Animal interface.
 - We cast the Animal reference to Dog to call the showLegs() method, which is specific to the Dog class. 

## 4. Default Methods in Interfaces  
   Since Java 8, interfaces can also have default methods, which provide a body for the method. Classes implementing the interface do not have to provide their own implementation for default methods.

  **Example:**
  ```java
public interface Animal {
    void sound();
    void eat();
    
    // Default method with implementation
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
```
**Example of Implementation with Default Method:**
```java
public class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Output: Bark
        myDog.eat();   // Output: Dog is eating.
        
        // Calling the default sleep() method
        myDog.sleep(); // Output: The animal is sleeping.
    }
}
```

**OUTPUT**

![Screenshot 2024-12-25 164023](https://github.com/user-attachments/assets/59a1a89b-4f2b-4dc1-95a5-47c8132e5bbd)

**Explanation:**
 - The sleep() method is a default method in the interface, and it has a default implementation. We don't need to implement it in the Dog class unless we want to override it.

## 5. Static Methods in Interfaces

   Java interfaces can also contain static methods. These methods are not inherited by implementing classes but can be called directly from the interface.

**Example:**
```java
public interface Animal {
    void sound();
    void eat();
    
    // Static method
    static void info() {
        System.out.println("This is an animal interface.");
    }
}
```
**Using the Static Method:**
```java
public class Main {
    public static void main(String[] args) {
        // Calling the static method directly from the interface
        Animal.info(); // Output: This is an animal interface.
    }
}
```

**OUTPUT**

![Screenshot 2024-12-25 164427](https://github.com/user-attachments/assets/1bc68a99-14ce-490e-8c0f-8d86917c9f08)

**Explanation:**
 - The info() method is a static method inside the interface. It must be called using the interface name, not through an instance of a class that implements the interface.

## Summary
 - **Interface:** A blueprint for classes, containing abstract methods that must be implemented by the implementing class.
 - **Implementing Class:** A class that provides concrete implementations for the abstract methods declared in the interface.
 - **Default Methods:** Interface methods with a body, which can be optionally overridden by the implementing class.
 - **Static Methods:** Methods in the interface that are not inherited by implementing classes and are called using the interface name.
   
