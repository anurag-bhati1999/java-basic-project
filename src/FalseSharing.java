
public class FalseSharing {

    public void falseShare() {

        long iterations = 1_000_000_000;
        Counter1 counter1 = new Counter1();
        Counter1 counter2 = counter1; // can avoid false sharing by new Counter1();
        Thread thread1 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            for (long i = 0; i < iterations; i++) {
                counter1.count1++;
            }
            long endtime = System.currentTimeMillis();
            System.out.println("Diff in time " + (endtime - startTime));
        });

        Thread thread2 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            for (long i = 0; i < iterations; i++) {
                counter2.count2++;
            }
            long endtime = System.currentTimeMillis();
            System.err.println("Total time " + (endtime - startTime));
        });

        thread1.start();
        thread2.start();
    }
}
