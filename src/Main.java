public class Main {

    public static void main(String args[]) {
        // basicThread();
        // basicRunnable();
        // stopThread();
        //daemon();
         //virtual();
         synch();
    }

    public static void basicThread(){
        Thread thread  = new BasicThread();
        thread.setName("my thread");
        thread.start();
        System.out.println("anurag bhati");
        System.out.println("current thread "+ Thread.currentThread().getName());
        System.out.println("my thread name  " + thread.getName());
    }

    public static void basicRunnable(){
        // System.err.println("anurag");
        Runnable myRunnable = new BasicRunnable();
        Thread thread = new Thread(myRunnable, "my runnable thread");
        thread.start();
        System.out.println("anurag Bhati");
        System.err.println("my thread "+ thread.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Last Last");
       
    }

    public static void stopThread(){
        System.err.println("anurag");
        StopThread myRunnable= new StopThread();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            Thread.sleep(30);
        } catch (Exception e) {
        }
       
        myRunnable.doStop();
    }

    public static void daemon() {
        BasicRunnable myRunnable = new BasicRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        try {
            thread.join();
        } catch (Exception e) {
            System.out.println("exception throwm");
        }
    }

    public static void virtual(){
        System.out.println("hii");
        BasicRunnable myRunnable = new BasicRunnable();
        Thread vThread = Thread.ofVirtual().start(myRunnable);
    }

    public static void counter(){
        Counter counter = new Counter();
        counter.start();
    }

    public static void synch() {
        SynchronizeCounter sync1 = new SynchronizeCounter();
        SynchronizeThread runnable = new SynchronizeThread(sync1);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
