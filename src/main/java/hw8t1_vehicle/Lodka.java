package hw8t1_vehicle;

public class Lodka extends WaterVehicle{
    public Lodka(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Lodka is boolking");
    }
}
