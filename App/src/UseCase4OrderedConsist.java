import java.util.*;

public class UseCase4OrderedConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2, "Pantry Car");

        System.out.println("After adding Pantry Car: " + trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final Train Consist: " + trainConsist);

        System.out.println("Program continues...");
    }
}