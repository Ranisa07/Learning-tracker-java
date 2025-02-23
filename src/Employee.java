package src;
import java.util.Objects;

    public class Employee {
        private int id;
        private String name;
        private double salary;
    
        // Constructor
        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    
        // Getters and Setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getSalary() {
            return salary;
        }
    
        public void setSalary(double salary) {
            this.salary = salary;
        }
    
        // Override equals method
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true; // Same reference
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false; // Null or different class
            }
            Employee employee = (Employee) obj;
            return id == employee.id &&
                   Double.compare(employee.salary, salary) == 0 &&
                   Objects.equals(name, employee.name); // Compare fields
        }
    
        // Override hashCode method
        @Override
        public int hashCode() {
            return Objects.hash(id, name, salary); // Generate hashCode using fields
        }
    
        // Override toString method
        @Override
        public String toString() {
            return "Employee{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   ", salary=" + salary +
                   '}';
        }
    
        // Main method for testing
        public static void main(String[] args) {
            Employee emp1 = new Employee(101, "Alice", 50000);
            Employee emp2 = new Employee(101, "Alice", 50000);
            Employee emp3 = new Employee(102, "Bob", 60000);
    
            System.out.println(emp1); // toString()
            System.out.println(emp1.equals(emp2)); // true
            System.out.println(emp1.equals(emp3)); // false
            System.out.println(emp1.hashCode()); // hashCode()
            System.out.println(emp2.hashCode()); // hashCode()
        }
    }
    

