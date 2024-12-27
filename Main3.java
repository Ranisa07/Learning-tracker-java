 interface Animal {
    void sound();
    void eat();
    
    // Default method with implementation
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
 class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Output: Bark
        myDog.eat();   // Output: Dog is eating.
        
        // Calling the default sleep() method
        myDog.sleep(); // Output: The animal is sleeping.
    }
}
