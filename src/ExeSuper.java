package src;
class Parent {
    String name = "Parent";
    Parent(String message) {
        System.out.println("Parent Constructor: " + message);
    }
    Parent() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    String name = "Child";
    Child(String message) {
        super(message); // Calls the parent class constructor
        System.out.println("Child Constructor");
    }
    Child()
    {
        System.out.println("Display method in Child class");   
    }
    void showNames() {
        System.out.println("Parent name: " + super.name); // Accesses the parent class variable
        System.out.println("Child name: " + this.name);   // Accesses the child class variable
    }   
}

public class ExeSuper {
    public static void main(String[] args) {
        Child child = new Child("Hello from Parent!");
        Child child1 = new Child();
        child.showNames();
    }
}
