package hw8t1;

public class Lodka extends WaterVehicle{
    public Lodka(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Lodka is boolking");
    }
}
