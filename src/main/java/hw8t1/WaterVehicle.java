package hw8t1;

abstract public class WaterVehicle implements Vehicle{
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
