// Main class to test the hierarchy and methods
public class Ass16 {
    public static void main(String[] args) {
        // Creating objects for different employees
        Employee emp1 = new Manager("Alice", "123 Main St", 80000, "Manager");
        Employee emp2 = new Developer("Bob", "456 Elm St", 70000, "Developer");
        Employee emp3 = new Programmer("Charlie", "789 Oak St", 60000, "Programmer");

        // Generating performance reports and managing projects
        emp1.generatePerformanceReport();
        emp1.manageProjects();

        emp2.generatePerformanceReport();
        emp2.manageProjects();

        emp3.generatePerformanceReport();
        emp3.manageProjects();
    }
}
// Base class
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus
    double calculateBonus() {
        return salary * 0.10; // Default bonus is 10% of the salary
    }

    // Method to generate performance report
    void generatePerformanceReport() {
        System.out.println("Performance Report for " + name + ":");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }

    // Method to manage projects (to be overridden by subclasses if necessary)
    void manageProjects() {
        System.out.println(name + " is managing general projects.");
    }
}

// Subclass Manager
class Manager extends Employee {

    Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // Managers get a 20% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is managing managerial projects.");
    }
}

// Subclass Developer
class Developer extends Employee {

    Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // Developers get a 15% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is managing development projects.");
    }
}

// Subclass Programmer
class Programmer extends Employee {

    Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        return salary * 0.12; // Programmers get a 12% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is managing programming projects.");
    }
}

