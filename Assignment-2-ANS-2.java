class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class Ass2 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.display();
    }
}
