package com.itea.java.basic.l18;

public class InterruptExample {

    public static void main(String[] args) throws Exception {
        Thread infiniteThread = new InfiniteThread();
        infiniteThread.start();
        Thread.sleep(1000);
        infiniteThread.interrupt();
    }

    static class InfiniteThread extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Infinite thread works");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        }
    }
}
