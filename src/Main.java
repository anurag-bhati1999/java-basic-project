public class Main {

    public static void main(String args[]) {
    //    basicThread();
        // basicRunnable();
        stopThread();
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
}
