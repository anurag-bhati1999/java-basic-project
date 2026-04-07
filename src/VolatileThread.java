
public class VolatileThread implements Runnable {

    private VolatileClass volatileClass;

    public VolatileThread(VolatileClass volatileClass) {
        this.volatileClass = volatileClass;
    }

    public void run() {
        this.volatileClass.update();
        
    }
}
