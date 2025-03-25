

public class Ass9 {
    public static void main(String[] args) {
        NumberPrintingThread thread = new NumberPrintingThread();
        thread.start();
    }
}

class NumberPrintingThread extends Thread {
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
