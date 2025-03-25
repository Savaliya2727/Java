import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            AgeValidator.checkAge(age); // Validate age
        } 
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } 
        finally {
            scanner.close(); // Close the scanner resource
        }

        System.out.println("Program execution continues...");
    }
}



class AgeValidator {
    // Method that checks if age is valid
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Error: Age must be 18 or above.");
        } else {
            System.out.println("Valid age: Access granted.");
        }
    }
}
//Custom Exception Class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
