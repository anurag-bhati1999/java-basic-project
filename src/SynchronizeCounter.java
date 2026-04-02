
public class SynchronizeCounter extends Thread {

    private int counter = 0;
    private static int counter2 =0;

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

    public static synchronized void increment3(){
        counter2++;
    }

    public static synchronized int getCounter3(){
        return counter2;
    }

     public static void increment4(){
        synchronized(SynchronizeCounter.class){
            counter2++;
        } 
    }

    public static synchronized int getCounter4(){
        synchronized(SynchronizeCounter.class){
            return counter2;
        } 
    }
}
