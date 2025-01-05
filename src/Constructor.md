# Default Constructor in Java 
## What is a Constructor ?
In Java, a **constructor** is a special method used to initialize objects. It is called when an object of a class is created. Constructors have the same name as the class and do not have a return type.

## What is a Default Constructor ?
A **Default Constructor** is a constructor that takes no arguments and is either:

1. **Implicity provided by Java** if no constructors are explicitly defined in class.

2. **Explicitly defined by the programmer**.

### Implicit Default Constructor

If a class does not define any constructors, Java automatically provides a default constructor that initializes the object with default values:

- Numeric fields are set to `0`.
- `char` fields are set to `'\u0000'`.
- `boolean` fields are set to `false`.
- Object references are set to `null`.

**Example**
```java
class DefaultExample{
    int number;
    String text;
    // No constructor defined
    // Java provides a default constructor
}
public class Main {
    public static void main(String []args)
    {
        DefaultExample obj=new DefaultExample();
        System.out.println("Number:"+obj.number);
        // Output: 0
        System.out.println("Text:"+obj.text);
        // Output: null
    }
}
```
### Explicit Default Constructor
A default Constructor can also be explicitly defined by the programmer to perform specific initializations.

**Example:**
```java
class DefaultExample {
    int number;
    String text;

    //Explicit default constructor
    public DefaultExample() {
        number=42;
        text="Hello, World!";
    }
}
public class Main{
    public static void main(String []args)
    {
        DefaultExample obj=new DefaultExample();
        System.out.println("Number:"+obj.number);
        //Output: 42
        System.out.println("Text:"+obj.text);
        //Output: Hello World!
    }
}
```
**OUTPUT**
![alt text](<Screenshot 2025-01-02 215405-1.png>)

**Key Points**

- A default constructor is provided automatically if no other constructors are defined in the class.
- If you define any constructor in the class, Java does not provide a default constructor.
- Explicitly defining a default constructor allows you to initialize fields with specific values.


---

# Parameterized Constructor in Java
In Java, a **Parameterized Constructor** is a constructor that accepts arguments(parameters) to initialize an object with specific values. It provides a way to pass data during object creation.

## Syntax
```java
class className {
    //Parameterized Constructor
    className(DataType Parameter1, DataType Parameter2)
    {
        //Initialize instance variables with parameters
    }
}
```
**Example:**
```java
class Student {
    String name;
    int age;
    
    //Parameterized Constructor
    Student(String name1, int age1)
    {
        name=name1;
        age=age1;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
public class Main{
    public static void main(String []args)
    {
        //Create an object using the parameterized constructor
        Student student1=new Student("Alice",20);
        student1.display();
        Student student2=new Student("Bivek",21);
        student2.display();
    }
}
```
**OUTPUT**
![alt text](<Screenshot 2025-01-02 215955.png>)

**Key Points**

- **Overloading:** A class can have multiple constructors, including parameterized and default constructors, which is called constructor overloading.
- **Initialization:** Parameterized constructors are helpful when objects need to be initialized with different values at the time of creation.

---

# Understanding `this` Keyword in Java Constructors

The `this` keyword in java is used to refer to the current objects. It is commonly used in constructors to differentiate between instance variables and parameters or to call another constructor within the same class.

---

## Using "this" in a Default Constructor

A **default constructor** initializes object properties with default values. It can use the `this` keyword to call a parameterized constructor for code reuse.


### Let's Understand with an Example
```java
class Example {
    int x;
    int y;

     //Default constructor 
    Example(){
        this(10,20); // Calls the parameterized constructor
        System.out.println("Default constructor called");
    }
     // Parameterized constructor
    Example(int x, int y){
        this.x=x; //Refers to the instance variable 'x'
        this.y=y; //Refers to the instance variable 'y'
        System.out.println("Parameterized constructor called");
    }
    void show(){
        System.out.println("x:" +x ",y:" +y);
    }
}
public class Main{
    public static void main(String []args){
        Example e1=new Example(); //Calls the Default constructor
        e1.show();
    }
}
```
**OUTPUT**
![alt text](<Screenshot 2025-01-02 225221.png>)

## Using `this` in a Parameterized Constructor

A **parameterized constructor** initializes an object with specific values. The `this` keyword is used to avoid ambiguity when instance variables have same names as constructor parameters.

### Example:
```java
class Example1{
    int p;
    int q;

    //Parameterized constructor
    Example1(int p, int q){
        this.p=p; //Refers to the instance variable 'p'
        this.q=q; //Refers to the instance variable 'q'
    }
    void show1(){
        System.out.println("p:" +p+",q:" +q);
    }
}
public class Main{
    public static void main(String []args){
        Example1 ob=new Example1(5,15); //Calls the parameterized constructor
        ob.show1();
    }
}
```
**OUTPUT**
![alt text](<Screenshot 2025-01-02 225607.png>)

**Key Points**

1. The `this` keyword can be used to:
    - Differentiate between instance variables and parameters.
    - Invoke another constructor within the same class.
2. The `this` constructor call must be the first statement in the constructor.
3. Using `this` ensures clean and readable code, especially in cases ambiguity.

