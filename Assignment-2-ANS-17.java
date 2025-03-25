// Main class to test the implementation
public class Ass17 {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog myDog = new Dog();
        
        // Call the bark() method
        myDog.bark();
    }
}
// Define the Animal interface
interface Animal {
    void bark();
}

// Implement the Animal interface in the Dog class
class Dog implements Animal {
    // Override the bark() method to print "Dog is barking"
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
