package hw8t1;

public class Plane extends AirVehicle{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Plane is super fast");
    }
}