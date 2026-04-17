package main;

public class GoodsBogieUC15 {

    String shape;
    String cargo;

    public GoodsBogieUC15(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.");
        }
    }
}