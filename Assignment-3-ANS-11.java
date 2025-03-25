

public class Ass11 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberThread());
        Thread oddThread = new Thread(new OddNumberThread());
        
        evenThread.start();
        oddThread.start();
    }
}

class EvenNumberThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddNumberThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

