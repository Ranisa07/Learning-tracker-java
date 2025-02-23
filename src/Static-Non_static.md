# Static & Non-static field and methods in java

## Let's understand with an example

### Write a java program for understanding the concept of Static Fields and Methods & Non-static Fields and Methods.

```java
public class StaticNonStaticExample{
//Static field: belongs to the class
static String staticField="I am a static field";

//Non-static field: belongs to an Instance
String nonStaticField;

//Constructor to initialize the non-static field
public StaticNonStaticExample(String value){
this.nonStaticField=value;
}

//Static method: can access static fields only
static void displayStaticField(){
System.out.println(staticField);
}

//Non-static method: can access both static and non-static fields
void displayField(){
System.out.println("Static Field:"+ staticField);
System.out.println("Non-Static Field:"+ nonStaticField);
}

public static void main(String []args){
//Accessing static field and method directly using the class name
System.out.println(StaticNonStaticExamole.staticField);
StaticNonStaticExample.displayStaticField();
StaticNonStaticExample example=new StaticNonStaticExample("I am a non-static field");
example.displayField();
}
}
```

# Explanation
1. **Staic Field:**
    - Declared with the static keyword.
    - Shared across all instances of the class.
    - Accessed using the class name or an instance of the class.
    - In the code, staticField is a static field and can be accessed using StaticNonStaticExample.staticField.
2. **Non-Static Field:**
    - Declared without the static keyword.
    - Each instance of the class has its own copy of the non-static field.
    - Accessed only through an instance of the class.
    - In the code, nonStaticField is a non-static field and is initialized via the constructor.
3. **Static Method:**
    - Can only access static fields directly.
    - Cannot access non-static fields unless an instance is provided.
    - **Example:** displayFields()

**~~OUTPUT~~**
   
   I am a static field
   
   I am a static field
   
   Static Field:I am a static field
   
   Non-Static Field:I am a non-static field

   Images
   ![Screenshot 2024-12-25 140159](https://github.com/user-attachments/assets/fc390144-37e7-44ba-9678-eece94bf4e92)

