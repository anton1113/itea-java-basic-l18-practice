package com.itea.java.basic.l18.classwork;

public class HelloWorldAsync {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println(Thread.currentThread());
            System.out.println("Hello world!");
        }).start();

        MyThread myThread = new MyThread();
        myThread.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread hello");
        }
    }
}
