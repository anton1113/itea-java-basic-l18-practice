package com.itea.java.basic.l18.classwork;

public class JoinExample {

    public static void main(String[] args) throws Exception {

        MyThread myThread1 = new MyThread("my-thread-1");
        MyThread myThread2 = new MyThread("my-thread-2");
        MyThread myThread3 = new MyThread("my-thread-3");

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        myThread3.start();
    }

    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
