package com.zero4kevin;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by xi1zhang on 2017/4/17.
 */
public class MultiProgram implements Runnable {
     private String message;
     public MultiProgram(String s){
         this.message=s;
     }
     public void run() {
         System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
         processmessage();//call processmessage method that sleeps the thread for 2 seconds
         System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
     }
    private void processmessage() {
         try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new MultiProgram("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}
