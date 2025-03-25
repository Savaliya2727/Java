
public class Ass1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}

class Student {
	String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}