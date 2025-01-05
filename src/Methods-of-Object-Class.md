# Methods of the Object Class in Java

In Java, the Object class is the root class of the class hierarchy. Every class in Java implicitly extends the Object class. The Object class provides several useful methods that are inherited by all Java classes. 
Below are the commonly used methods of the Object class, along with explanations and example code.

## 1. toString():

**Description:**

The toString() method returns a string representation of the object. By default, it returns a string that consists of the class name followed by the "@" symbol and the object's hash code. However, this method is
often overridden to provide a more meaningful string representation.

**Syntax:**
```java
public String toString()
```

**Example:**
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person.toString()); // Output: Person{name='Alice', age=30}
    }
}
```
**OUTPUT**

![Screenshot 2024-12-25 192009](https://github.com/user-attachments/assets/e8eb824f-eaa0-4d0c-bbcb-fbc7962abdf3)

**Explanation:**

In the example, we override the toString() method to provide a custom string representation of the Person class. The toString() method returns the name and age fields of the Person object.

## 2. equals(Object obj):
**Description:**

The equals() method checks whether two objects are considered equal. By default, it checks for reference equality (i.e., if both references point to the same object). It is often
overridden to check for logical equality between objects.

**Syntax:**
```java
public boolean equals(Object obj)
```

**Example**
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        System.out.println(person1.equals(person2)); // Output: true
    }
}
```
**OUTPUT**

![Screenshot 2024-12-25 192128](https://github.com/user-attachments/assets/3c23d552-9a90-4a3d-a9d2-15005eac9ab7)

**Explanation:**

In this example, we override the equals() method to compare the name and age fields of two Person objects. If both fields are the same, the objects are considered equal.
### 3. hashCode()
**Description:**

The hashCode() method returns an integer that represents the hash code of the object. It is used primarily in hashing-based collections like HashMap. If two objects are
considered equal (based on the equals() method), they must return the same hash code.

**Syntax:**
```java
public int hashCode()
```
**Example:**
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        System.out.println(person1.hashCode() == person2.hashCode()); // Output: true
    }
}
```

**OUTPUT**

![Screenshot 2024-12-25 192236](https://github.com/user-attachments/assets/a6b9177d-127a-44b9-9871-72da28469b8d)

**Explanation:**

In this example, we override the hashCode() method to generate a hash code based on the name and age fields. Since the objects have the same values for these fields, their hash codes will be the same.

## 4. getClass()
**Description:**

The getClass() method returns the Class object associated with the class of the object. This is useful for reflection operations and obtaining the runtime class of an object.

**Syntax:**
```java
public final Class<?> getClass()
```
**Example:**
```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println(person.getClass().getName()); // Output: Person
    }
}
```

**OUTPUT**

![Screenshot 2024-12-25 192335](https://github.com/user-attachments/assets/c8536768-b1da-44fa-87d5-01b4ab8a0091)

**Explanation:**

In this example, getClass() is used to print the name of the class of the object, which is Person.

## 5. clone()

**Description**

The clone() method is used to create and return a copy of the object. By default, it performs a shallow copy, meaning that it copies the object but does not recursively clone objects referenced by the fields.
To use this method, the class must implement the Cloneable interface.

**Syntax:**
```java
public Object clone() throws CloneNotSupportedException
```
**Example**
```java
class Person implements Cloneable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Alice", 30);
        Person person2 = (Person) person1.clone();
        System.out.println(person1 != person2); // Output: true
        System.out.println(person1.getClass() == person2.getClass()); // Output: true
    }
}
```
**OUTPUT**

![Screenshot 2024-12-25 192439](https://github.com/user-attachments/assets/6240d0d3-41b0-4b77-b0c2-48ed1a64640f)

**Explanation:**

In this example, the Person class implements the Cloneable interface, and we override the clone() method to create a copy of the Person object. The result shows that the cloned object is a new instance.

## 6. notify()
**Description:**

The notify() method is used to wake up a single thread that is waiting on the object's monitor. It is used in synchronized code blocks when a thread wants to notify other threads about a condition change.

**Syntax:**
```java
public final void notify()
```
**Example**
```java
class SharedResource {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producing item");
        notify(); // Wake up a waiting thread
    }

    synchronized void consume() throws InterruptedException {
        wait(); // Wait for the notify signal
        System.out.println("Consuming item");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                resource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumer.start();
        Thread.sleep(1000); // Ensure the consumer is waiting
        producer.start();
    }
}
```
**OUTPUT**

![Screenshot 2024-12-25 192551](https://github.com/user-attachments/assets/9d36e052-e4cf-4cf8-a0e2-1918012fa21a)

**Explanation:**

In this example, the notify() method is used to wake up the consumer thread after the producer has finished producing. The consume() method uses wait() to wait for the signal from the produce() method.

## Conclusion

These are some of the important methods of the Object class in Java. Most of these methods are commonly overridden in custom classes to provide specific behavior and are essential for working with 
objects in Java, especially in collections, concurrency, and reflection.
