package com.itea.java.basic.l18;

public class CreateThreadExample {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(() -> System.out.println("I am a new thread!"));
        thread.start();
        Thread.sleep(100);
        thread.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(this);
        }
    }
}
