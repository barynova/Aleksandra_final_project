package hw8t1_vehicle;

public class Barzha extends WaterVehicle{
    public Barzha(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Barzha is giant");
    }
}
