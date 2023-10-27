package hw8t1;

public class VehicleWorld {
    public static void main(String[] args) {
        // Створюємо transport і викликаємо методи
        Vehicle lodka = new Lodka("Super Lodka");
        Vehicle kater = new Kater("Super Kater");
        Vehicle barzha = new Barzha("Super Barzha");
        Vehicle car = new Car("Super Car");
        Vehicle bus = new Bus("Super Bus");
        Vehicle tractor = new Tractor("Super Tractor");
        Vehicle plane = new Plane("Super Airplane");
        Vehicle helikopter = new Tractor("Super Kukuruznik");
        Vehicle airBaloon = new AirBaloon("Super Air Baloon");



        lodka.move();
        kater.move();
        barzha.move();
        car.move();
        bus.move();
        tractor.move();
        plane.move();
        helikopter.move();
        airBaloon.move();


    }
}
