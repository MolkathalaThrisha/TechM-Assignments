package Employee;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(3, "Alice", 70000));
        service.addEmployee(new Employee(1, "Bob", 50000));
        service.addEmployee(new Employee(2, "Charlie", 60000));

        System.out.println("All Employees:");
        displayEmployees(service.getAllEmployees());

        
        System.out.println("\nEmployees Sorted by Name:");
        displayEmployees(service.sortByName());

     
        System.out.println("\nEmployees Sorted by Salary:");
        displayEmployees(service.sortBySalary());

        
        System.out.println("\nEmployees Sorted by ID:");
        displayEmployees(service.sortById());
    }

    private static void displayEmployees(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
