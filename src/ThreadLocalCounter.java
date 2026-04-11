
public class ThreadLocalCounter {

    private ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> {
        return 0;
    });

    public void increment() {
        this.counter.set(this.counter.get() + 1);
    }

    public int getCounter() {
        return this.counter.get();
    }
}
