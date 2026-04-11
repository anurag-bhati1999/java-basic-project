
public class ThreadLocalRunnable implements Runnable {

    private ThreadLocalCounter counter;

    public ThreadLocalRunnable(ThreadLocalCounter counter) {
        this.counter = counter;
    }

    public void run() {
        int i;
        for (i = 0; i < 20; i++) {
            this.counter.increment();
            System.out.println("Thread " + Thread.currentThread().getName()
                    + " counter Value is " + this.counter.getCounter());
        }
    }
}
