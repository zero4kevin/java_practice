package com.zero4kevin;
class TestSynchronization1{
    public class Table{
        void printTable(int n){//method not synchronized
            synchronized (this) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(n * i);
                    try {
                        Thread.sleep(400);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }

    public class MyThread1 extends Thread{
        Table t;
        MyThread1(Table t){
            this.t=t;
        }

        public void run(){
            t.printTable(5);
        }
    }

    public class MyThread2 extends Thread{
        Table t;
        MyThread2(Table t){
            this.t=t;
        }
        public void run(){
            t.printTable(100);
        }
    }


    public static void main(String args[]){
        TestSynchronization1 ts= new TestSynchronization1();
        Table obj = ts.new Table();//only one object
        MyThread1 t1=ts.new MyThread1(obj);
        MyThread2 t2=ts. new MyThread2(obj);
        t1.start();
        t2.start();
    }
}