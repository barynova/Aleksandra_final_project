package hw8t1_vehicle;

public class Helikopter extends AirVehicle{
    public Helikopter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Helikopter moves like a grany");
    }
}