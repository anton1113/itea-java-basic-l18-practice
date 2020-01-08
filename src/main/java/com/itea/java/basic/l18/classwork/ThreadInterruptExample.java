package com.itea.java.basic.l18.classwork;

public class ThreadInterruptExample {

    public static void main(String[] args) throws Exception {

        InfiniteThread infiniteThread = new InfiniteThread();
        infiniteThread.start();

        Thread.sleep(1500);
        infiniteThread.stop();
    }

    static class InfiniteThread extends Thread {

        @Override
        public void run() {

            while (true) {
                System.out.println(this);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    interrupt();
                }
            }
        }
    }
}
