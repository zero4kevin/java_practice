package com.zero4kevin;
class InterruptedThread extends Thread{
    public void run(){
        for(int i=1;i<=2;i++){
            if(Thread.interrupted()){
                System.out.println("code for interrupted thread");
            }else{
                System.out.println("code for normal thread");
            }
        }//end of for loop  
    }

    public static void main(String args[]){
        InterruptedThread t1=new InterruptedThread();
        InterruptedThread t2=new InterruptedThread();
        t1.start();
        System.out.println("t1.isInterrupted: "+t1.isInterrupted());
        t1.interrupt();
        System.out.println("t1.isInterrupted: "+t1.isInterrupted());
        t2.start();
        System.out.println("t2.isInterrupted: "+t2.isInterrupted());
    }
}  