package com.itea.java.basic.l18.classwork;

public class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i ++) {
            System.out.println("CurrentThread = " + Thread.currentThread().getName() + "Thread " + name + " is running " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
