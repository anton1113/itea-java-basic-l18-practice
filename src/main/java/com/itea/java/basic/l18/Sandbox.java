package com.itea.java.basic.l18;

public class Sandbox {

    public static void main(String[] args) {

        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        Thread.State state = Thread.currentThread().getState();

        Thread thread = new Thread(() -> System.out.println("Separate thread instruction!"));

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("name = %s, priority = %d, state = %s", name, priority, state);
    }
}
