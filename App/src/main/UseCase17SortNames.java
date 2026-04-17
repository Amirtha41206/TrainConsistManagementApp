package main;

import java.util.Arrays;

public class UseCase17SortNames{

    public String[] sortBogieNames(String[] bogies) {

        Arrays.sort(bogies);
        return bogies;
    }

    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        UseCase17TrainConsistMgmt app = new UseCase17TrainConsistMgmt();

        String[] sorted = app.sortBogieNames(bogies);

        System.out.println("Sorted Bogie Names: " + Arrays.toString(sorted));
    }
}