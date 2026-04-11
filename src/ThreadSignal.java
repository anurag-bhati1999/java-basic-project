
public class ThreadSignal {

    private boolean wasSignaled = false;

    MonitorObject myObject = new MonitorObject();

    public void doWait() {
        synchronized (myObject) {
            System.out.println("Wait start for thread " + Thread.currentThread().getName());
            while (!wasSignaled) { // to prevent spuriou wakeups
                try {
                    myObject.wait(); // in multiple thread, it will again go for ewait as  wasginal will be false again
                } catch (Exception e) {
                }
            }
            System.out.println("wait end " + Thread.currentThread().getName());
            wasSignaled = false;
        }
    }

    public void doNotify() {
        synchronized (myObject) {
            System.err.println("notify start");
            wasSignaled = true;
            myObject.notifyAll();
            System.out.println("notify out");
        }
    }
}
