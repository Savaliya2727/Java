// Main class to test the Employee class
public class Ass6 {
    public static void main(String[] args) {
        // Creating objects for three different employees
        Employee emp1 = new Employee("E001", "Alice", "Manager", 50000);
        Employee emp2 = new Employee("E002", "Bob", "Engineer", 40000);
        Employee emp3 = new Employee("E003", "Charlie", "Technician", 30000);

        // Calculate and print the pay for each employee
        emp1.calculateAndPrintPay();
        emp2.calculateAndPrintPay();
        emp3.calculateAndPrintPay();
    }
}


// Employee class definition
class Employee {
    // Instance variables
    String employeeCode;
    String name;
    String designation;
    double basicPay;

    // Constructor to assign initial values
    Employee(String employeeCode, String name, String designation, double basicPay) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.designation = designation;
        this.basicPay = basicPay;
    }

    // Method to calculate and print allowances and total pay
    void calculateAndPrintPay() {
        double HRA = basicPay * 0.10; 
        double DA = basicPay * 0.50;  
        double MA = 200;              
        double PF = basicPay * 0.10;  
        double PT = 250;              
        
        // Calculate total pay
        double totalPay = basicPay + HRA + DA + MA - PF - PT;

        // Print the details
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("MA: " + MA);
        System.out.println("PF: " + PF);
        System.out.println("PT: " + PT);
        System.out.println("Total Pay: " + totalPay);
        System.out.println("---------------------------");
    }
}
