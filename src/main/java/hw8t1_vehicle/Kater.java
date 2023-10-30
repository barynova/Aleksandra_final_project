package hw8t1_vehicle;

public class Kater extends WaterVehicle{
    public Kater(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Kater is sinking");
    }
}
