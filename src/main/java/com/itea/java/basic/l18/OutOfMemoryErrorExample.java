package com.itea.java.basic.l18;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

    public static void main(String[] args) {

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            list.add(new Thread(() -> System.out.println("Hey hou")));
        }
    }
}
