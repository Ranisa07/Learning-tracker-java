# Static and Non-Static Block Execution in Java

## Overview

In Java, **blocks** are used for initializing code segments. These blocks can be categorized as:
1. **Static Blocks** - Run once when the class is loaded into memory.
2. **Non-Static Blocks** - Executed each time an object of the class is created, before the constructor is called.

### Static Blocks
- Declared using the `static` keyword.
- Executed once per class, regardless of the number of objects created.
- Used to initialize static variables or perform operations needed at the class-loading time.

### Non-Static Blocks
- Declared without the `static` keyword.
- Executed every time an instance of the class is created, just before the constructor.
- Often used for common code required by all constructors.

---

## Code Example

```java
public class BlockExecution {

    // Static Block
    static {
        System.out.println("Static block executed.");
    }

    // Non-Static Block
    {
        System.out.println("Non-static block executed.");
    }

    // Constructor
    public BlockExecution() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts.");
        
        // Creating the first object
        BlockExecution obj1 = new BlockExecution();

        // Creating the second object
        BlockExecution obj2 = new BlockExecution();

        System.out.println("Main method ends.");
    }
}
```

**Output**
```
Static block executed.
Main method starts.
Non-static block executed.
Constructor executed.
Non-static block executed.
Constructor executed.
Main method ends.
```
## Explanation

**Static Block:**

- Executed when the class is loaded into memory (before the main method starts).
- Executes only once during the lifecycle of the class.

**Non-Static Block:**

- Executes before the constructor, each time an object is instantiated.
- Runs once per object creation.

**Constructor:**

- Called immediately after the non-static block for the instantiated object.