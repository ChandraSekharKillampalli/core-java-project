package core.multithreading;

public class BasicThreads implements Runnable{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Main thread is running");
            Thread.yield();
        } catch (InterruptedException e){
            System.err.print("Thread is interrupted");
        }

    }
    public static void main(String[] args){
        BasicThreads basicThreads = new BasicThreads();
        basicThreads.run();
    }

}
