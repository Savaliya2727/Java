

public class Ass10 {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberPrintingRunnable());
        thread.start();
    }
}

class NumberPrintingRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(5000); // 5 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

