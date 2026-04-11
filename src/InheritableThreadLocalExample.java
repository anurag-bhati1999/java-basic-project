
public class InheritableThreadLocalExample {

    public static void main(String[] args) {
        ThreadLocal<String> string1 = new ThreadLocal<>();
        InheritableThreadLocal<String> string2 = new InheritableThreadLocal<>();

        Thread thread1 = new Thread(() -> {
            string1.set("anurag");
            string2.set("bhati");
            Thread childThread = new Thread(() -> {
                System.out.println("string1 in child " + string1.get());
                System.out.println("string2 in child " + string2.get());
            });
            childThread.start(); // child thread
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("string1 in threed 2 " + string1.get());
            System.out.println("string2 in thread 2 " + string2.get());
        });
        thread2.start();

    }
}
