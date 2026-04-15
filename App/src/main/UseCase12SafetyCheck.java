package main;

import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UseCase12SafetyCheck {

    public boolean isTrainSafe(List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum"));
    }

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));

        boolean safe = new UseCase12SafetyCheck().isTrainSafe(bogies);

        System.out.println("Train Safety Status: " + safe);
    }
}