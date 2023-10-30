package hw8t1_vehicle;

public class Plane extends AirVehicle{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Plane is super fast");
    }
}