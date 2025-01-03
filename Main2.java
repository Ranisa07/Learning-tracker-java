// Define an interface called Animal
 interface Animal {
    // Abstract method (does not have a body)
    void sound();

    // Abstract method (does not have a body)
    void eat();

    // A constant (interface fields are implicitly `public static final`)
    int numberOfLegs = 4;
}
// Implementing the Animal interface in a Dog class
 class Dog implements Animal {

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
public class Main2 {
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
    

