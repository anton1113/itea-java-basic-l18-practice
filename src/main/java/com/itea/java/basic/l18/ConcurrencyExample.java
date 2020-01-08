package com.itea.java.basic.l18;

import java.io.FileInputStream;

public class ConcurrencyExample {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("thread1");
        MyThread myThread2 = new MyThread("thread2");
        MyThread myThread3 = new MyThread("thread3");
//        FileInputStream fileInputStream = new FileInputStream("").read()
    }

    static class MyThread implements Runnable {

        private Thread thread;

        public MyThread(String name) {
            thread = new Thread(this);
            thread.setName(name);
            thread.start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(thread.getName() + " execution #" + i);
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
