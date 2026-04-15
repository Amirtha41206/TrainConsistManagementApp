package main;

import java.util.*;
import java.util.stream.*;

public class UseCase9GroupingBogies {

    public Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {

        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 40));

        Map<String, List<Bogie>> grouped =
                new UseCase9GroupingBogies().groupBogies(bogies);

        System.out.println(grouped);
    }
}