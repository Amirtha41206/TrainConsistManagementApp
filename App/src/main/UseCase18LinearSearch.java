package main;

public class UseCase18LinearSearch {

    public boolean searchBogie(String[] bogies, String key) {

        for (int i = 0; i < bogies.length; i++) {

            if (bogies[i].equals(key)) {
                return true; // found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String key = "BG309";

        UseCase18LinearSearch app = new UseCase18LinearSearch();

        boolean found = app.searchBogie(bogies, key);

        if (found) {
            System.out.println("Bogie Found: " + key);
        } else {
            System.out.println("Bogie Not Found: " + key);
        }
    }
}