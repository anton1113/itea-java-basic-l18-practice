package com.itea.java.basic.l18.exercises;

public class ProfilingExample {

    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();

        Thread.sleep(100);

        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed " + (endTime - startTime));
    }
}
