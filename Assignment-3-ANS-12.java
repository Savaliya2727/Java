

public class Ass12 {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(new HighPriorityThread());
        Thread lowPriorityThread = new Thread(new LowPriorityThread());
        
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Highest priority
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
class HighPriorityThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("High Priority Thread - Count: " + i);
        }
    }
}

class LowPriorityThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Low Priority Thread - Count: " + i);
        }
    }
}

