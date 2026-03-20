public class Counter extends Thread{
    int counter =0;

    public void run(){
        System.out.println("counter begore "+ this.counter);
        this.counter++;
        System.out.println("counter after  "+ this.counter);

    }
}