package main;

public class UseCase14CustomException {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC", -10);

            System.out.println("Bogies created successfully");

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}