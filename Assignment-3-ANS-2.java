import java.util.Scanner;

public class Ass2{
    public static void main(String[] args) {
        // Initializing an array of five integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Creating a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking an index as input
            System.out.print("Enter an index (0 to 4): ");
            int index = scanner.nextInt();

            // Printing the array element at the specified index
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception if the index is out of bounds
            System.out.println("Error: Invalid index. Please enter a number between 0 and 4.");
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}
