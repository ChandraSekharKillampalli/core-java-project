package core.multithreading;

public class BasicThreads extends Thread{
    public void run(){
        System.out.println("Main thread is running");
    }
    public static void main(String[] args){
        BasicThreads basicThreads = new BasicThreads();
        basicThreads.start();
    }

}
