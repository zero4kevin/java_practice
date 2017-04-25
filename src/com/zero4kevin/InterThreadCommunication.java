package com.zero4kevin;

/**
 * Created by xi1zhang on 2017/4/21.
 */
class InterThreadCommunication {
    class Customer {
        int amount = 10000;
        synchronized void withdraw(int amount) {
            System.out.println("going to withdraw...");
            if (this.amount < amount) {
                System.out.println("Less balance; waiting for deposit...");
                try {
                    wait();
                } catch (Exception e) {
                }
            }
            this.amount -= amount;
            System.out.println("withdraw completed...\nafter withdraw, the money is : "+ this.amount);
        }
        synchronized void deposit(int amount) {
            System.out.println("going to deposit...");
            this.amount += amount;
            System.out.println("deposit completed... ");
            System.out.println("after deposit, the money is : "+ this.amount);
            notify();
        }
    }

    public static void main(String args[]) {
        final Customer c = new InterThreadCommunication().new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15001);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(10009);
            }
        }.start();
    }
}