# Object Class Methods in Java

The `Object` class is the root class of the Java class hierarchy. Every class in Java inherits from the `Object` class. Below are the methods provided by the `Object` class.

## Methods

### 1. `clone()`
- **Description**: Creates and returns a copy (clone) of the object. This method is part of the `Cloneable` interface.
- **Return type**: `Object`
- **Throws**: `CloneNotSupportedException`

### 2. `equals(Object obj)`
- **Description**: Compares this object with the specified object for equality.
- **Return type**: `boolean`
- **Parameters**: `Object obj` - The object to be compared.
- **Throws**: None

### 3. `finalize()`
- **Description**: Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
- **Return type**: `void`
- **Throws**: `Throwable`

### 4. `getClass()`
- **Description**: Returns the runtime class of the object.
- **Return type**: `Class<?>`
- **Throws**: None

### 5. `hashCode()`
- **Description**: Returns a hash code value for the object, which is used in hash-based collections such as `HashMap`.
- **Return type**: `int`
- **Throws**: None

### 6. `notify()`
- **Description**: Wakes up a single thread that is waiting on this object's monitor.
- **Return type**: `void`
- **Throws**: `IllegalMonitorStateException`

### 7. `notifyAll()`
- **Description**: Wakes up all threads that are waiting on this object's monitor.
- **Return type**: `void`
- **Throws**: `IllegalMonitorStateException`

### 8. `toString()`
- **Description**: Returns a string representation of the object. By default, it returns a string that consists of the class name followed by the `@` symbol and the object's hashcode.
- **Return type**: `String`
- **Throws**: None

### 9. `wait()`
- **Description**: Causes the current thread to wait until it is awakened by another thread.
- **Return type**: `void`
- **Throws**: `InterruptedException`, `IllegalMonitorStateException`

### 10. `wait(long timeout)`
- **Description**: Causes the current thread to wait for the specified amount of time until it is awakened.
- **Return type**: `void`
- **Parameters**: `long timeout` - The time to wait in milliseconds.
- **Throws**: `InterruptedException`, `IllegalMonitorStateException`

### 11. `wait(long timeout, int nanos)`
- **Description**: Causes the current thread to wait for the specified amount of time, with an additional nanoseconds value.
- **Return type**: `void`
- **Parameters**: 
    - `long timeout` - The time to wait in milliseconds.
    - `int nanos` - The additional nanoseconds to wait.
- **Throws**: `InterruptedException`, `IllegalMonitorStateException`

## Conclusion

These are the primary methods provided by the `Object` class in Java. Since all classes in Java inherit from `Object`, every class will have access to these methods unless they override them.


**EXAMPLE**
```JAVA
// MyClass.java


public class MyClass {
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyClass{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both objects are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check if object is null or not the same class
        MyClass myClass = (MyClass) obj; // Cast to MyClass
        return age == myClass.age && name.equals(myClass.name); // Check if fields are equal
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age; // Generate a unique hashcode based on fields
    }

    public static void main(String[] args) {
        MyClass person1 = new MyClass("Alice", 30);
        MyClass person2 = new MyClass("Alice", 30);
        MyClass person3 = new MyClass("Bob", 25);

        // getClass method
        System.out.println("Class of person1: " + person1.getClass().getName());

        // toString method
        System.out.println("person1: " + person1.toString());
        System.out.println("person2: " + person2.toString());

        // equals method
        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));

        // hashCode method
        System.out.println("Hashcode of person1: " + person1.hashCode());
        System.out.println("Hashcode of person2: " + person2.hashCode());
        System.out.println("Hashcode of person3: " + person3.hashCode());
    }
}
```
**Explanation of methods:**
1.	getClass(): This method returns the Class object associated with the runtime class of the object. It is used here to get the class name of the object.
2.	toString(): The toString() method returns a string representation of the object. We override this method to customize the string output for the MyClass object.
3.	equals(Object obj): This method checks if two objects are equal. In our example, it compares the name and age fields of two MyClass objects.
4.	hashCode(): The hashCode() method returns a hash code for the object. We override this method to ensure that objects with the same content have the same hash code.
```
Class of person1: MyClass
person1: MyClass{name='Alice', age=30}
person2: MyClass{name='Alice', age=30}
person1 equals person2: true
person1 equals person3: false
Hashcode of person1: 93118661
Hashcode of person2: 93118661
Hashcode of person3: 186285822
```

In this example:

-	getClass() prints the name of the class.
-	toString() prints the custom string representation of the objects.
-	equals() compares two objects based on their field values.
-	hashCode() generates a hash value based on the name and age fields.


