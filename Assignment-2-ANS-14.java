// Main class to test the methods
public class Ass14 {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee Salary: " + emp.getSalary());
        
        // Creating an object of HRManager class
        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("HR Manager Salary: " + hr.getSalary());
    }
}
// Base class
class Employee {
    // Method to be overridden
    void work() {
        System.out.println("Employee is working");
    }

    // Method to get the salary
    double getSalary() {
        return 50000; // Base salary for an employee
    }
}

// Subclass that overrides the work() method and adds a new method
class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing HR activities");
    }

    // New method to add an employee
    void addEmployee() {
        System.out.println("Adding a new employee");
    }
}
