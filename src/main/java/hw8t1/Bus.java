package hw8t1;

public class Bus extends GroundVehicle{
    public Bus(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Bus is not so speedy");
    }
}
