package com.itea.java.basic.l18;

public class IsAliveExample {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> System.out.println("New thread!"));
        thread.start();
        thread.join();
        System.out.println(thread.isAlive());
    }
}
