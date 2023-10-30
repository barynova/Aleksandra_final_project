package hw8t1_vehicle;

abstract public class AirVehicle implements Vehicle{
    public String name;

    public AirVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is a category which includes plane, helikopter, air baloon");
    }
}
