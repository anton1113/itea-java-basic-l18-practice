package com.itea.java.basic.l18.classwork;

public class IsAliveExample {

    public static void main(String[] args) {

        Thread child = new Thread(() -> System.out.println(Thread.currentThread()));
        child.start();

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
    }
}
