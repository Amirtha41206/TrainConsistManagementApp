package main;

import java.util.regex.*;

public class UseCase11RegexValidation {

    public boolean isValidTrainID(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public boolean isValidCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        UseCase11RegexValidation app = new UseCase11RegexValidation();

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID valid: " + app.isValidTrainID(trainId));
        System.out.println("Cargo Code valid: " + app.isValidCargoCode(cargoCode));
    }
}