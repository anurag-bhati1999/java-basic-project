public class Main {

    public static void main(String args[]) {
       basicThread();
    }

    public static void basicThread(){
        System.out.println("aurag");
        Thread thread  = new BasicThread();
        thread.setName("my thread");
        thread.start();
        System.out.println("bhati");
        System.out.println("current thread "+ Thread.currentThread().getName());
        System.out.println("my thread name  " + thread.getName());
    }
}
