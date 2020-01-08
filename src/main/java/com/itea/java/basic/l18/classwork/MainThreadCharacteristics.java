package com.itea.java.basic.l18.classwork;

public class MainThreadCharacteristics {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        String name = thread.getName();
        int prioriry = thread.getPriority();
        Thread.State state = thread.getState();

        System.out.printf("Name = %s, priority = %d, state = %s", name, prioriry, state);
    }
}
