package main;

import java.util.Arrays;

public class UseCase19BinarySearch {

    public boolean binarySearch(String[] bogies, String key) {

        // Step 1: Sort array (important)
        Arrays.sort(bogies);

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = bogies[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            } 
            else if (cmp < 0) {
                low = mid + 1; // search right
            } 
            else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String key = "BG309";

        UseCase19BinarySearch app = new UseCase19BinarySearch();

        boolean found = app.binarySearch(bogies, key);

        if (found) {
            System.out.println("Bogie Found: " + key);
        } else {
            System.out.println("Bogie Not Found: " + key);
        }
    }
}