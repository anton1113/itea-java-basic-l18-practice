package com.itea.java.basic.l18.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PriorityExample {

    public static void main(String[] args) {

        List<String> output = new ArrayList<>();

        NameWriterThread threadA = new NameWriterThread("a", output);
        NameWriterThread threadB = new NameWriterThread("b", output);
        NameWriterThread threadC = new NameWriterThread("c", output);

        threadA.start();
        threadB.start();
        threadC.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(output);

        Map<String, Integer> outputStats = new HashMap<>();
        output.forEach(name -> outputStats.merge(name, 1, Integer::sum));

        System.out.println(outputStats);
    }
}


