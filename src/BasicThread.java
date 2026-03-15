import java.time.LocalTime;
class BasicThread extends Thread{

    public void run(){
        System.out.println("current time " + LocalTime.now());
    }
}