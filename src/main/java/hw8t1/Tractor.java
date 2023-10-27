package hw8t1;

public class Tractor extends GroundVehicle{
    public Tractor(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Tractor is powerful");
    }
}