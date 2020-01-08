package com.itea.java.basic.l18.exercises;

import java.util.List;

public class NameWriterThread extends Thread {

    private List<String> output;

    public NameWriterThread(String name, List<String> output) {
        super(name);
        this.output = output;
    }

    @Override
    public void run() {
        while (true) {
            if (output.size() >= 100) {
                break;
            }
            output.add(getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
