package hw8t1;

abstract public class GroundVehicle implements Vehicle{
    public String name;

    public GroundVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is a category which includes car, tractor, bus");
    }
}
