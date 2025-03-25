// Main class to test the method overriding
public class Ass13 {
    public static void main(String[] args) {
        // Creating an object of Vehicle class
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive();
        
        // Creating an object of Car class
        Car myCar = new Car();
        myCar.drive();
    }
}
// Base class
class Vehicle {
    // Method to be overridden
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass that overrides the drive() method
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}
