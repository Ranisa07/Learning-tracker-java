# Understanding `super` in Java

In Java, the `super` keyword is used to refer to the immediate parent class of the current class. It is particularly useful in the following scenarios:

1. **Accessing Parent Class Constructor**
2. **Accessing Parent Class Methods**
3. **Accessing Parent Class Variables**

---

## 1. Using `super` to Access the Parent Class Constructor

The `super` keyword can be used to call the constructor of the parent class. This is especially useful when the parent class has parameterized constructors, and you want to initialize the parent class from the child class.

### Example:
```java
class Parent {
    Parent(String message) {
        System.out.println("Parent Constructor: " + message);
    }
}

class Child extends Parent {
    Child(String message) {
        super(message); // Calls the parent class constructor
        System.out.println("Child Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Hello from Parent!");
    }
}
```
**Output:**
```
Parent Constructor: Hello from Parent!
Child Constructor
```
## 2. Using super to Access Parent Class Methods
The super keyword can also be used to call methods from the parent class when they are overridden in the child class.

**Example:**
```java
class Parent {
    void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls the parent class method
        System.out.println("Display method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
```
**Output:**
```
Display method in Parent class
Display method in Child class
```
## 3. Using super to Access Parent Class Variables
When a child class declares a variable with the same name as a variable in the parent class, the super keyword can be used to access the parent class's variable.

**Example:**
```java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void showNames() {
        System.out.println("Parent name: " + super.name); // Accesses the parent class variable
        System.out.println("Child name: " + this.name);   // Accesses the child class variable
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.showNames();
    }
}
```

**Output:**
```Parent name: Parent
Child name: Child
```
### Key Points to Remember

- The super() call must always be the first statement in the child class constructor.
- If the parent class has no default (no-argument) constructor, you must explicitly call a parameterized constructor using super().
- Use super only to refer to the immediate parent class.