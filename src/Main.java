public class Main {

    public static void main(String args[]) {
    //    basicThread();
        basicRunnable();
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
}
