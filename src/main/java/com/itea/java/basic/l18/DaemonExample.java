package com.itea.java.basic.l18;

public class DaemonExample {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("hey ho");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
        thread.start();
        thread.join();
    }
}
