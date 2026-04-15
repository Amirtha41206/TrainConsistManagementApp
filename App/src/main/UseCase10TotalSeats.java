package main;

import java.util.*;

public class UseCase10TotalSeats {

    public int getTotalSeats(List<Bogie> bogies) {

        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        int total = new UseCase10TotalSeats().getTotalSeats(bogies);

        System.out.println("Total Seating Capacity: " + total);
    }
}