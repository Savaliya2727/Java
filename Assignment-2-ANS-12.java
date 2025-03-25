
import PKG.MyClass;
import CALCULATE.sum;
import CALCULATE.SUB;

public class S12 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage();

        sum sumObj = new sum();
        SUB subObj = new SUB();

        int a = 10;
        int b = 5;
        int sum = sumObj.add(a, b);
        int difference = subObj.subtract(a, b);

        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        System.out.println("Difference between " + a + " and " + b + " is: " + difference);
    }
}
