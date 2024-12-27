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
// Outputs: The animal is sleeping.
    
public class Main4 {
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
