public class Ass9 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        
        circle.draw();
        rectangle.draw();
    }
}


// Interfac
interface Shape {
    void draw();
}

// Circle class implementing Sha
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Rectangle class implementing Sha
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

