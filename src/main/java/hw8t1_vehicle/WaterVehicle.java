package hw8t1_vehicle;

abstract public class WaterVehicle implements movable{
    public String name;
    public WaterVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is a category which includes kater, lodka, barzha");
    }
}
