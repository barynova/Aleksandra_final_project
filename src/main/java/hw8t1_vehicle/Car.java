package hw8t1_vehicle;

public class Car extends GroundVehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Car has 4 wheels");
    }
}