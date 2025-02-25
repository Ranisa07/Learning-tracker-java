package java;

import java.util.Arrays;

class Employee implements Comparable<Employee> 
{
    private int id;
    private String name; 
    private double salary;
    
    public Employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "Employee {" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }

    public int compareTo(Employee emp ){
        return Double.compare(this.salary, emp.salary); // Ascending order of salary
    }
}
public class EmployeeList{
    public static void main(String[] args){
        Employee[] employees={
            new Employee(1, "Alice", 50000),
            new Employee(2, "Bob", 40000),
            new Employee(3, "Charlie", 60000)
        };
         // Sort the array using Arrays.sort
         Arrays.sort(employees);

         // Display sorted array
         System.out.println("Sorted Employees by Salary:");
         for (Employee em1 : employees) {
             System.out.println(em1);
         }
    }
}
