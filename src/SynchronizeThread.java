
public class SynchronizeThread implements Runnable{
    public SynchronizeCounter counter;

    public SynchronizeThread(SynchronizeCounter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i=0;i<10;i++){
            counter.increment();
            System.out.println(Thread.currentThread().getName()
            +"->"+ counter.getCounter()
            );
        }
    }

    
}