class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling the add method with two integers
        System.out.println("Sum of 5 and 3 (int): " + calc.add(5, 3));
        
        // Calling the overloaded add method with three integers
        System.out.println("Sum of 5, 3 and 8 (int): " + calc.add(5, 3, 8));
        
        // Calling the overloaded add method with two doubles
        System.out.println("Sum of 5.5 and 3.5 (double): " + calc.add(5.5, 3.5));
        
        // Calling the overloaded add method with an integer and a double
        System.out.println("Sum of 5 and 3.5 (int + double): " + calc.add(5, 3.5));
    }
}