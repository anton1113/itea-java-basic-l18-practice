package com.itea.java.basic.l18.classwork;

public class MultithreadingExample {

    public static void main(String[] args) {

        Thread threadA = new Thread(new MyRunnable("thread A"));
        Thread threadB = new Thread(new MyRunnable("thread B"));

        threadA.start();
        threadB.start();
    }
}
