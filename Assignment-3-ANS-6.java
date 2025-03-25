

public class Ass6 {
    public static void main(String[] args) {
        String str = null; // Assigning null to the string

        try {
            // Attempting to access length of a null string
            int length = str.length();
            System.out.println("String length: " + length);
        } 
        catch (NullPointerException e) {
            System.out.println("Exception caught: Cannot get the length of a null string!");
        }

        System.out.println("Program execution continues...");
    }
}
