

public class Ass8 {
    public static void main(String[] args) {
        HelloWorldThread thread = new HelloWorldThread();
        thread.start();
    }
}

class HelloWorldThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, World!");
            try {
                Thread.sleep(5000); // 5 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

