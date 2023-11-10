package hw8t1_vehicle;

abstract public class GroundVehicle implements movable{
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
