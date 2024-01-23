import java.util.concurrent.CountDownLatch;

public class TheadCOuntDown {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Thread t1 = new Thread(new Task("Thread 1", 2000, latch)); // Sleeps for 2 seconds
        Thread t2 = new Thread(new Task("Thread 2", 3000, latch)); // Sleeps for 3 seconds
        Thread t3 = new Thread(new Task("Thread 3", 1000, latch)); // Sleeps for 1 second

        t1.start();
        t2.start();
        t3.start();

        try {
            latch.await(); // Block the main thread until all threads finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished. Main thread exiting.");
    }

    static class Task implements Runnable {
        private final String threadName;
        private final long sleepDurationMillis;
        private final CountDownLatch latch;

        public Task(String threadName, long sleepDurationMillis, CountDownLatch latch) {
            this.threadName = threadName;
            this.sleepDurationMillis = sleepDurationMillis;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                System.out.println(threadName + " started.");
                Thread.sleep(sleepDurationMillis);
                System.out.println(threadName + " finished after " + sleepDurationMillis + " milliseconds.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println(threadName + " was interrupted.");
            } finally {
                latch.countDown(); // Signal that this thread has finished
            }
        }
    }
}
