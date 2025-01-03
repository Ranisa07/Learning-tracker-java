# Java Classes & Objects

## Lets understand by a Program

```java

class Car{

//Fields (Properties)
String brand;
int year;

//Constructor (to initialize objects)
Car(String brand, int year){
this.brand=brand;
this.year=year;
}

//Method (Behavior)
void displayInfo(){
System.out.println("Brand:"+ brand);
System.out.println("Year:"+year);
}

//Main class to demonstate objects
public class Main{
public static void main(String []args){

//Create an object for Car class
Car myCar=new Car("Toyota",2020);

//Access fields and call methods
myCar.displayInfo();
}
}
```

## Explanation

1. **Defining a Class:**
   
    The Car class represents a template for cars. It contains:
   - **Fields**: brand and year to store car details.
   - **Constructor:** Car(String brand, int year) initializes the fields when an object is created.
   - **Method:** displayInfo() prints the car's details.
2. **Creating an Object:**

    In the main method of the Main class:
   - An object myCar of the Car class is created using the constructor.
   - The method displayInfo() is called on myCar to display its details.
3. **Output:**

    Running the code will produce the following output:

 **Brand:Toyota**
 **Year:2020**

   Images
   ![Screenshot 2024-12-25 101748](https://github.com/user-attachments/assets/d52a9a88-54ae-4bbb-b860-b425e6601f6e)

   
