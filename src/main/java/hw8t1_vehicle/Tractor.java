package hw8t1_vehicle;

public class Tractor extends GroundVehicle{
    public Tractor(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Tractor is powerful");
    }
}