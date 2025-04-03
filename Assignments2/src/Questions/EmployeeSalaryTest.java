package Questions;
class Employee {
 protected String name;
 protected double baseSalary;

 public Employee(String name, double baseSalary) {
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public double calculateSalary() {
     return baseSalary;
 }

 public void displayInfo() {
     System.out.println("Employee Name: " + name);
     System.out.println("Base Salary: $" + baseSalary);
 }
}

class Manager extends Employee {
 private double bonus;

 public Manager(String name, double baseSalary, double bonus) {
     super(name, baseSalary);
     this.bonus = bonus;
 }


 public double calculateSalary() {
     return baseSalary + bonus;
 }
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Bonus: $" + bonus);
     System.out.println("Total Salary: $" + calculateSalary());
 }
}

class Programmer extends Employee {
 private int overtimeHours;
 private double overtimeRate;

 public Programmer(String name, double baseSalary, int overtimeHours, double overtimeRate) {
     super(name, baseSalary);
     this.overtimeHours = overtimeHours;
     this.overtimeRate = overtimeRate;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + (overtimeHours * overtimeRate);
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Overtime Hours: " + overtimeHours);
     System.out.println("Overtime Pay: $" + (overtimeHours * overtimeRate));
     System.out.println("Total Salary: $" + calculateSalary());
 }
}

public class EmployeeSalaryTest {
 public static void main(String[] args) {
     Manager manager = new Manager("Alice Johnson", 80000, 10000);
     Programmer programmer = new Programmer("Bob Smith", 60000, 10, 50);

     System.out.println("Manager Details:");
     manager.displayInfo();
     System.out.println();

     System.out.println("Programmer Details:");
     programmer.displayInfo();
 }
}
