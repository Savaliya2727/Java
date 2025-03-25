import java.util.Scanner;

public class Ass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking two integers as input
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        try {
            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling ArithmeticException if denominator is zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}
