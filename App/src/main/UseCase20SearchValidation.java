package main;

public class UseCase20SearchValidation {

    public boolean searchBogie(String[] bogies, String key) {

        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Normal search (linear)
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309"};

        UseCase20SearchValidation app = new UseCase20SearchValidation();

        try {
            boolean found = app.searchBogie(bogies, "BG205");

            if (found) {
                System.out.println("Bogie Found");
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}