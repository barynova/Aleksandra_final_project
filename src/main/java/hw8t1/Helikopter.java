package hw8t1;

public class Helikopter extends AirVehicle{
    public Helikopter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Helikopter moves like a grany");
    }
}