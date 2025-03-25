

public class Ass4 {
    public static void main(String[] args) {
        try {
            InputValidator.validateNumber(-10); // This will trigger InvalidInputException
        } 
        catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}

class InputValidator {
    // Method that throws InvalidInputException for negative input
    public static void validateNumber(int number) throws InvalidInputException {
        if (number < 0) {
            throw new InvalidInputException("Error: Negative numbers are not allowed!");
        } else {
            System.out.println("Valid input: " + number);
        }
    }
}

//Custom Exception Class
class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
     super(message);
 }
}
