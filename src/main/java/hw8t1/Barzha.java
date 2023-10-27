package hw8t1;

public class Barzha extends WaterVehicle{
    public Barzha(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Barzha is giant");
    }
}
