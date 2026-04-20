package src.gla.com.Encapsulation;
import java.util.*;

public class main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Creating objects
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 0, 20, 500);

        // Assign departments
        emp1.assignDepartment("IT");
        emp2.assignDepartment("Support");

        // Add to list
        employees.add(emp1);
        employees.add(emp2);

        // Polymorphism: using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }

            System.out.println("----------------------");
        }
    }
}
