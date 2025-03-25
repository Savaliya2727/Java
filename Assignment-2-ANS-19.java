// Main class to test the Drawable interface and its implementations
public class Ass19 {
    public static void main(String[] args) {
        // Create objects of Circle, Rectangle, and Triangle classes
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();
        
        // Call the draw() method on each object
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}

// Define the Drawable interface
interface Drawable {
    void draw();
}

// Implement the Drawable interface in the Circle class
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Implement the Drawable interface in the Rectangle class
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Implement the Drawable interface in the Triangle class
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

