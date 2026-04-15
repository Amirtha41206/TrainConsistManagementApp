package main;

import java.util.*;
import java.util.stream.*;

public class UseCase13Performance {

    public List<Bogie> filterWithLoop(List<Bogie> bogies) {

        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        return result;
    }

    public List<Bogie> filterWithStream(List<Bogie> bogies) {

        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        UseCase13Performance app = new UseCase13Performance();

        long start = System.nanoTime();
        app.filterWithLoop(bogies);
        long end = System.nanoTime();
        System.out.println("Loop Time: " + (end - start));

        start = System.nanoTime();
        app.filterWithStream(bogies);
        end = System.nanoTime();
        System.out.println("Stream Time: " + (end - start));
    }
}