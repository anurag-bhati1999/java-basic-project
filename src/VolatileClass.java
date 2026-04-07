
public class VolatileClass {

    private volatile int counter = 0;

    public void update() {
        this.counter++;
    }

    public void get() {
        System.out.println(this.counter);
    }
}
