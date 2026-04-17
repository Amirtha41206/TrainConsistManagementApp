package main;

public class UseCase15SafeCargo {

    public static void main(String[] args) {

        GoodsBogieUC15 b1 = new GoodsBogieUC15("Cylindrical");
        b1.assignCargo("Petroleum");

        GoodsBogieUC15 b2 = new GoodsBogieUC15("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println("Program continues...");
    }
}