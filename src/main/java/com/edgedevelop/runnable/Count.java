package com.edgedevelop.runnable;

public class Count implements Runnable {

    Thread myThread;

    Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println(myThread);

        myThread.start();
    }

    public void run() {

        try {
            for (int i = 0; i < 5; i++ ) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }

        System.out.println("mythread run is over");
    }
}

class RunnableExample {

    public static void main(String[] args) {
        Count c = new Count();

        try {
            while (c.myThread.isAlive()) {
                System.out.println("Main thread will be alive until the child thread is alive");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread run is over");
    }

}