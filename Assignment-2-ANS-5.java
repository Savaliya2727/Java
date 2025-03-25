public class Ass5 {
    public static void main(String[] args) {
        Cube myCube = new Cube(3);
        myCube.printSquare();
        myCube.printCube();
    }
}

class Number {
    int x;
    Number(int x) {
        this.x = x;
    }
}


class Square extends Number {
    
    Square(int x) {
        super(x);
    }
    
    void printSquare() {
        int square = x * x;
        System.out.println("Square of " + x + " is: " + square);
    }
}


class Cube extends Square {
   
    Cube(int x) {
        super(x);
    }
    
    void printCube() {
        int cube = x * x * x;
        System.out.println("Cube of " + x + " is: " + cube);
    }
}


