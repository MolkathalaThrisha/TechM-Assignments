package Employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public List<Employee> sortByName() {
        employees.sort(Comparator.comparing(Employee::getName));
        return employees;
    }
    public List<Employee> sortBySalary() {
        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        return employees;
    }

    public List<Employee> sortById() {
        employees.sort(Comparator.comparingInt(Employee::getId));
        return employees;
    }
}
