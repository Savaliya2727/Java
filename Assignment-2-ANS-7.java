
final class FinalClass {
       final int finalVariable = 10;
       final void finalMethod() {
        System.out.println("This is a final method in a final class.");
    }
}

class AnotherClass {
        void demonstrateFinal() {
            FinalClass obj = new FinalClass();
            System.out.println("Final variable value: " + obj.finalVariable);
            obj.finalMethod();
    }
}

public class Ass7 {
    public static void main(String[] args) {
        AnotherClass anotherObj = new AnotherClass();
        anotherObj.demonstrateFinal();
    }
}
