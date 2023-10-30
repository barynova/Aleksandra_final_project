package hw8t1_vehicle;

public class AirBaloon extends AirVehicle{
    public AirBaloon(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Air baloon only for romantic, not for fast moving");
    }
}