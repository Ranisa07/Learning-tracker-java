# Java Abstract class & Sub class with Overridding

## Let's understand with a program
```java
// Abstract class Animal
abstract class Animal {
    // Abstract method: No implementation here, subclasses must provide one
    public abstract void sound();
    
    // A regular method with implementation
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Subclass Dog that extends Animal and provides implementation for sound method
class Dog extends Animal {
    // Overriding the abstract method from Animal class
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat that extends Animal and provides implementation for sound method
class Cat extends Animal {
    // Overriding the abstract method from Animal class
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the abstract class and its subclasses
public class Main {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        // Calling overridden methods
        myDog.sound(); // Outputs: The dog barks.
        myCat.sound(); // Outputs: The cat meows.
        
        // Calling the regular method inherited from Animal
        myDog.sleep(); // Outputs: The animal is sleeping.
        myCat.sleep(); // Outputs: The animal is sleeping.
    }
}
```
## Explanation:
### 1. Abstract Class:
   - **Animal:** This is an abstract class, meaning it cannot be instantiated directly. It has an abstract method sound() which is declared but not implemented. Subclasses that extend Animal must provide
      their own implementation of sound().
   - It also has a regular method sleep(), which has a concrete implementation that all subclasses will inherit.
### 2. Abstract Method:
   - **public abstract void sound();:** This method doesn't have any body, so it's a method that subclasses are required to override and provide their own functionality.
### 3. Subclass (Dog and Cat):
   - Both Dog and Cat are subclasses of the abstract class Animal. These subclasses are required to implement the sound() method, which they do by providing their own version of this method.
          - Dog prints "The dog barks."
          - Cat prints "The cat meows."
### 4. Overriding the Method:
   - In both the Dog and Cat classes, we use the @Override annotation to indicate that we are overriding the sound() method of the parent class (Animal). This ensures that we're providing a correct 
      implementation, and Java will throw a compile-time error if we don't properly override the method.
### 5. Inheritance:
   - Both subclasses Dog and Cat inherit the sleep() method from the abstract class Animal, so they don't need to define it again. When we create objects of Dog and Cat, we can call sleep() on them, and the
     same implementation from the Animal class will be executed.
### 6. Polymorphism:
   - In the Main class, we demonstrate polymorphism by using references of type Animal to point to objects of type Dog and Cat. This allows us to call the overridden sound() method, which will dynamically
     resolve to the correct method based on the actual object type, not the reference type.

**OUTPUT**

The dog barks.

The cat meows.

The animal is sleeping.

The animal is sleeping.


![Screenshot 2024-12-25 173957](https://github.com/user-attachments/assets/a09c1018-c5a0-44f6-b8dc-7c289c5314b1)

