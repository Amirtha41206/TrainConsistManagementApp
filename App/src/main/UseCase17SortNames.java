package main;

import java.util.Arrays;

public class UseCase17SortNames {

    public String[] sortBogieNames(String[] names) {

        Arrays.sort(names);
        return names;
    }

    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        UseCase17SortNames app = new