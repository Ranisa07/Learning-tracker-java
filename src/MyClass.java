package src;

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
