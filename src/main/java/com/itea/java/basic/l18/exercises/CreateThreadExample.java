package com.itea.java.basic.l18.exercises;

import java.util.function.Function;

public class CreateThreadExample {

    public static void main(String[] args) {

        Thread viaThread = new ThreadExample();
        Thread viaRunnable = new Thread(new RunnableExample());
        Thread viaLambda = new Thread(() ->
                System.out.println("User lambda expression: " + Thread.currentThread()));

        viaThread.start();
        viaRunnable.start();
        viaLambda.start();

//        Function<Integer, String> function = (Object::toString);
//        String s = function.apply(155);
    }

    static class ThreadExample extends Thread {

        @Override
        public void run() {
            System.out.println("Extend Thread: " + this);
        }
    }

    static class RunnableExample implements Runnable {

        public void run() {
            System.out.println("Implement Runnable: " + Thread.currentThread());
        }
    }
}
