package hw7t1;

public class Trapezoid extends Quadrangle{
    public Trapezoid(double width, double height, double length) {
        super(width, height, length);
    }

    public double calculateSquare() {
        return (2*length + height) / 2 * height;}
}
