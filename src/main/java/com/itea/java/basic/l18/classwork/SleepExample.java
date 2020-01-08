package com.itea.java.basic.l18.classwork;

import java.time.LocalDateTime;

public class SleepExample {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(LocalDateTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
