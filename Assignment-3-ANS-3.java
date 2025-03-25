

public class Ass3 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
            
            int value = Integer.parseInt("abc"); // This will throw IllegalArgumentException
            System.out.println(value);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: Illegal argument encountered!");
        } 
        catch (Exception e) { // General exception catch block
            System.out.println("Error: An unexpected exception occurred!");
        }

        System.out.println("Program continues...");
    }
}
