
import java.time.LocalTime;

class StopThread implements Runnable{
    private boolean stop = false;

    public synchronized void doStop(){
        this.stop = true;
    }

    private synchronized boolean keepRunning(){
        return this.stop == false;
    }


    public void  run(){
        while (keepRunning()) { 
            System.err.println("curent timme" + LocalTime.now());
        }
    }
}