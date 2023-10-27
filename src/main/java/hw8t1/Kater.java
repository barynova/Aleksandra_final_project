package hw8t1;

public class Kater extends WaterVehicle{
    public Kater(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Kater is sinking");
    }
}
