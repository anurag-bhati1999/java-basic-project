
public class SynchronizeCounter extends Thread {

    private int counter = 0;

    public synchronized void increment() {
        this.counter++;
    }

    public synchronized int getCounter() {
        return this.counter;
    }

    public void increment2() {
        synchronized (this) {
            this.counter++;
        }
    }

    public int getCounter2() {
        synchronized (this) {
            return this.counter;
        }
    }
}
