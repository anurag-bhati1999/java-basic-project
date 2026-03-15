import java.time.LocalTime;
class BasicRunnable implements Runnable{

    public void  run(){
        System.out.println("Current time " + LocalTime.now());
    }
}